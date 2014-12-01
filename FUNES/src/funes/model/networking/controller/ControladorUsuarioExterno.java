/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model.networking.controller;

import funes.model.Model;
import funes.model.networking.ClientServiceThread;

/**
 *
 * @author RUBEN
 */
public class ControladorUsuarioExterno {

    private Model Modelo$;
    private ClientServiceThread Cliente;

    public ControladorUsuarioExterno(Model Model, ClientServiceThread clienteThread) {
        this.Modelo$ = Model;
        this.Cliente = clienteThread;
    }

    private void SignUp() {
        Modelo$.solicitudRegistrarNuevoUsuario();
    }

    private void validarUsuario(String usuario, String contrasenna) {
        Modelo$.ValidarCuentadeUsuario(usuario, contrasenna);
    }

    private void actualizarPerfilUsuario(String nickname) {
        Modelo$.ActualizarPerfilUsuarioLogueado(nickname);
    }
}
