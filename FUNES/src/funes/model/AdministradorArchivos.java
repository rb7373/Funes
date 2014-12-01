/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 * @author RUBEN
 */
public class AdministradorArchivos {

    File Archivo = null;
    FileReader LectorDeArchivo = null;
    BufferedReader BufferDeLectura = null;

    public String buscarPorCedula(String ruta, String cedula) {

        String resultado = "";

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            Archivo = new File(ruta);
            LectorDeArchivo = new FileReader(Archivo);

            BufferDeLectura = new BufferedReader(new InputStreamReader(
                    new FileInputStream(Archivo), "UTF8"));

            //BufferDeLectura = new BufferedReader(LectorDeArchivo);
            // Lectura del fichero
            String linea;
            cedula = cedula.trim();
            System.out.println("Inicia busqueda");
            while ((linea = BufferDeLectura.readLine()) != null) {
                String cedulaTemporal = linea.substring(0, 9);
                //System.out.println(cedulaTemporal);
                if (cedula.equals(cedulaTemporal)) {
                    resultado = linea;
                    break;
                }
            }
            System.out.println("Finaliza busqueda");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != LectorDeArchivo) {
                    LectorDeArchivo.close();
                }
            } catch (Exception e2) {
                System.out.println("ERROR");
            }
        }

        return resultado;

    }

    public static void main(String[] args) {
        AdministradorArchivos administradorArchivos = new AdministradorArchivos();

        administradorArchivos.buscarPorCedula(Constantes.RUTA_PADRON_SAN_JOSE, "114910642");
    }

}
