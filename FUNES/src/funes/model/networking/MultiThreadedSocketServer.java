package funes.model.networking;

import funes.model.networking.controller.ControladorUsuarioExterno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import funes.model.Model;

public class MultiThreadedSocketServer implements Runnable {

    private ServerSocket myServerSocket;
    private Model Administrador;

    private int serverPort = 11111;
    //protected ServerSocket serverSocket = null;
    private boolean isStopped = false;
    private Thread runningThread = null;

    public MultiThreadedSocketServer(int port, Model modelo) {
        this.serverPort = port;
        this.Administrador = modelo;
    }

//    public void iniciarServidor() {
////        try {
////            myServerSocket = new ServerSocket(11111);
////        } catch (IOException ioe) {
////            System.out.println("Could not create server socket on port 11111. Quitting.");
////            System.exit(-1);
////        }
//
////        Calendar now = Calendar.getInstance();
////        SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
////        System.out.println("It is now : " + formatter.format(now.getTime()));
////        // Successfully created Server Socket. Now wait for connections. 
////        while (ServerOn) {
////            try {
////                // Accept incoming connections. 
////                Socket clientSocket = myServerSocket.accept();
////
////                // accept() will block until a client connects to the server. 
////                // If execution reaches this point, then it means that a client 
////                // socket has been accepted. 
////                // For each client, we will start a service thread to 
////                // service the client requests. This is to demonstrate a 
////                // Multi-Threaded server. Starting a thread also lets our 
////                // MultiThreadedSocketServer accept multiple connections simultaneously. 
////                // Start a Service thread 
////                ClientServiceThread cliThread = new ClientServiceThread(clientSocket);
////                cliThread.start();
////
////            } catch (IOException ioe) {
////                System.out.println("Exception encountered on accept. Ignoring. Stack Trace :");
////                ioe.printStackTrace();
////            }
////
////        }
////
////        try {
////            myServerSocket.close();
////            System.out.println("Server Stopped");
////        } catch (Exception ioe) {
////            System.out.println("Problem stopping server socket");
////            System.exit(-1);
////        }
//    }
    public static void main(String[] args) {
//        MultiThreadedSocketServer servidor = new MultiThreadedSocketServer(11111); 
//        new Thread(servidor).start();
    }

    @Override
    public void run() {
        synchronized (this) {
            this.runningThread = Thread.currentThread();
        }
        openServerSocket();
        while (!isStopped()) {
            Socket clientSocket = null;
            try {
                clientSocket = this.myServerSocket.accept();
            } catch (IOException e) {
                if (isStopped()) {
                    System.out.println("Server Stopped.");
                    return;
                }
                //throw new RuntimeException("Error accepting client connection", e);

                System.out.println("Error accepting client connection");
            }
            ClientServiceThread cliThread = new ClientServiceThread(clientSocket, this);
            cliThread.start();

            try {
                Thread.sleep(1 * 1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("Error al dormir el thread del servidor");
            }
        }
        stop();
        System.out.println("Server Stopped.");
    }

    public synchronized boolean isStopped() {
        return this.isStopped;
    }

    public synchronized void stop() {
        this.isStopped = true;
        try {
            this.myServerSocket.close();
            System.out.println("SERVIDOR detenido!");
        } catch (IOException e) {
            //throw new RuntimeException("Error closing server", e);
            System.out.println("Error closing server");
            System.exit(-1);
        }
    }

    private void openServerSocket() {
        try {
            this.myServerSocket = new ServerSocket(this.serverPort);

            Calendar now = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
            System.out.println("It is now : " + formatter.format(now.getTime()));

        } catch (IOException e) {
            //throw new RuntimeException("Cannot open port: "+String.valueOf(this.serverPort), e);
            System.out.println("Cannot open port: " + String.valueOf(this.serverPort));
            System.exit(-1);
        }
    }

    public Model getAdministrador() {
        return Administrador;
    }

}
