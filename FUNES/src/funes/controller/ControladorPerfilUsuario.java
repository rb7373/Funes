/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.PerfilUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Trei
 */
public class ControladorPerfilUsuario implements ActionListener {

    private Model Modelo$;
    private PerfilUsuario PerfilUsuario$;

    public void actionPerformed(ActionEvent evento) {
        Object fuentoDelEvento = evento.getSource();
        
        String nickname = PerfilUsuario$.getNickname();
        
        if(fuentoDelEvento == PerfilUsuario$.getjButtonDenunciarPersona()){
            
            System.out.println("Usted quiere denunciar una persona");
            denunciarPersona();

        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonDenunciarEntidad()) {
            System.out.println("Usted quiere denunciar una entidad");
            denunciarEntidad();

        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonBuscar()) {
            System.out.println("Usted quiere buscar");
            buscar();
        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonEditarCuenta()) {
            habilitarContrasenna();
        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonGuardarInformacionCuenta()) {
            deshabilitarContrasenna();
            guardarNuevoNicknameyContrasenna();
        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonEditarInformacionPersonalUsuario()) {
            habilitarInformacionPersonal();
        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonGuardarInformacionPersonal()) {
            deshabilitarInformacionPersonal();
            guardarInformacionPersonalActualizada();
        } else if (fuentoDelEvento == PerfilUsuario$.getjButtonCerrarSesion()) {
            salir();
        }

    }

    public ControladorPerfilUsuario(Model model, PerfilUsuario perfilUsuario) {
        this.Modelo$ = model;
        this.PerfilUsuario$ = perfilUsuario;
    }

    private void denunciarPersona() {
        Modelo$.solicitudDenunciarPersona();
    }

    private void denunciarEntidad() {
        Modelo$.solicitudDenunciarEntidad();

    }

    private void buscar() {
        Modelo$.solicitudBuscar();
        Modelo$.listaCategorias();
    }

    private void editarNicknameyContrasenna() {

    }

    private void habilitarContrasenna() {
        Modelo$.habilitarContrasennaPerfilUsuario();
    }

    private void deshabilitarContrasenna() {
        Modelo$.deshabilitarContrasennaPerfilUsuario();
    }

    private void habilitarInformacionPersonal() {
        Modelo$.habilitarInformacionPersonalUsuario();
    }

    private void deshabilitarInformacionPersonal() {
        Modelo$.deshabilitarInformacionPersonalUsuario();
    }

    private void guardarNuevoNicknameyContrasenna() {
        Modelo$.actualizarDatos();
    }

    private void guardarInformacionPersonalActualizada() {
        Modelo$.actualizarDatos();
    }

    private void salir() {
        Modelo$.salirDePerfilUsuario();
    }
}
