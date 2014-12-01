/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model.networking;

import funes.model.networking.controller.ControladorUsuarioExterno;
import funes.model.networking.controller.ProtocoloComunicacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author RUBEN
 */
public class ClientServiceThread extends Thread {

    Socket myClientSocket;
    boolean m_bRunThread = true;
    private MultiThreadedSocketServer servidor;
    private ProtocoloComunicacion adminitradorProtocolo;

    BufferedReader in = null;
    PrintWriter out = null;

    ClientServiceThread(Socket s, MultiThreadedSocketServer servidor) {
        myClientSocket = s;
        this.servidor = servidor;
        adminitradorProtocolo = new ProtocoloComunicacion(this);
    }

    public void run() {
            // Obtain the input stream and the output stream for the socket 
        // A good practice is to encapsulate them with a BufferedReader 
        // and a PrintWriter as shown below. 

        // Print out details of this connection 
        System.out.println("Accepted Client Address - " + myClientSocket.getInetAddress().getHostName());

        try {
            in = new BufferedReader(new InputStreamReader(myClientSocket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(myClientSocket.getOutputStream()));

            out.println("Bienvenido");

            // At this point, we can read for input and reply with appropriate output. 
            // Run in a loop until m_bRunThread is set to false 
            while (m_bRunThread) {
                // read incoming stream 
                String clientCommand = in.readLine();
                System.out.println("Client Says :" + clientCommand);

                if (servidor.isStopped()) {
                    // Special command. Quit this thread 
                    System.out.print("Server has already stopped");
                    out.println("Server has already stopped");
                    out.flush();
                    m_bRunThread = false;

                }

                if (clientCommand.equalsIgnoreCase("quit")) {
                    // Special command. Quit this thread 
                    m_bRunThread = false;
                    System.out.print("Stopping client thread for client : ");
                } else if (clientCommand.equalsIgnoreCase("end")) {
                    // Special command. Quit this thread and Stop the Server
                    m_bRunThread = false;
                    System.out.print("Stopping client thread for client : ");
                    servidor.stop();
                } else {
                    // Process it 
                    //out.println("Server Says : " + clientCommand);
                    //out.flush();

                    adminitradorProtocolo.interpretarMensaje(clientCommand);
                }

                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println("Error al dormir el thread del servidor");
                }
            }
        } catch (Exception e) {
            System.out.println("Error de conexion");
        } finally {
            // Clean up 
            try {
                in.close();
                out.close();
                myClientSocket.close();
                System.out.println("...Stopped");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public void enviarMensaje(String mensaje) {
        if (out != null) {
            out.println(mensaje);
            out.flush();
        }
    }

    public MultiThreadedSocketServer getServidor() {
        return servidor;
    }

}
