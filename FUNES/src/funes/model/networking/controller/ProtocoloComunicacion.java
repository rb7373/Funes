/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model.networking.controller;

import funes.model.networking.ClientServiceThread;
import java.util.Arrays;

/**
 *
 * @author RUBEN
 */
public class ProtocoloComunicacion {

    private ClientServiceThread cliente;

    public ProtocoloComunicacion(ClientServiceThread cliente) {
        this.cliente = cliente;
    }

    public void interpretarMensaje(String mensaje) {
        System.out.println("Interpretando mensaje");
        System.out.println("---");
        System.out.println(mensaje);
        System.out.println("---");
        if (mensaje.contains("SETNICK")) {
            System.out.println("DIVIDIENDO MENSAJE");
            String[] mensajeDividido = mensaje.split("#", -1);
            String toString = Arrays.toString(mensajeDividido);
            System.out.println(toString);
            String nickname = mensajeDividido[1];
            String password = mensajeDividido[3];
            System.out.println(nickname);
            System.out.println(password);
            cliente.getServidor().getAdministrador().ValidarCuentadeUsuarioRemoto(nickname, password, this);
        } else {
            System.out.println("Petición no conocida");
            //cliente.getServidor().getAdministrador().ValidarCuentadeUsuarioRemoto("RB", "RB", this);
        }

    }

    public void enviarMensaje(String mensaje) {
        cliente.enviarMensaje(mensaje);
    }
}
