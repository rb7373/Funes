/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.RegistroNuevoUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author RUBEN
 */
public class ControllerRegistroNuevoUsuario implements ActionListener {

    private Model Modelo$;  //Contiene una referencia al modelo
    private RegistroNuevoUsuario RegistroNuevoUsuario$;

    @Override
    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();
        String nickname = RegistroNuevoUsuario$.getjTextFieldNickname().getText();
        String provincia = RegistroNuevoUsuario$.getjComboBoxProvincia().getSelectedItem().toString();
        String cedula = RegistroNuevoUsuario$.getjTextFieldCedula().getText();
        String dia = RegistroNuevoUsuario$.getDiaNacimiento();
        String mes = RegistroNuevoUsuario$.getMesNacimiento();
        String anno = RegistroNuevoUsuario$.getAnnoNacimiento();

        if (fuenteDelEvento == RegistroNuevoUsuario$.getjButtonBuscarPersona()) {
            validarCedulaProvincia(cedula, provincia);
            calcularEdad(dia, mes, anno);
        } else if (fuenteDelEvento == RegistroNuevoUsuario$.getjButtonRegistrarse()) {
            if (Modelo$.verificarExitenciaNuevoUsuario(cedula, nickname)) {
                RegistroNuevoUsuario$.mostrarMensajeError("Este usuario ya ha sido registrado anteriormente."
                        + " Inténtelo de nuevo.", "Error");
            } else {
                if(registrarNuevoUsuario(cedula, provincia)){
                    limpiarPantalla();
                }
                
            }

        } else if (fuenteDelEvento == RegistroNuevoUsuario$.getjButtonTerminosyCondiciones()) {
            TerminosyCondiciones();
        }
        else if(fuenteDelEvento == RegistroNuevoUsuario$.getjButtonSalirDeRegistro()){
            RegistroNuevoUsuario$.ocultarVentana();
            limpiarPantalla();
        }
        else if(fuenteDelEvento == RegistroNuevoUsuario$.getjButtonSalirDeRegistro()){
            RegistroNuevoUsuario$.ocultarVentana();
            limpiarPantalla();
        }
        
    }

    public ControllerRegistroNuevoUsuario(Model Modelo$, RegistroNuevoUsuario RegistroNuevoUsuario$) {
        this.Modelo$ = Modelo$;
        this.RegistroNuevoUsuario$ = RegistroNuevoUsuario$;
    }

    private boolean registrarNuevoUsuario(String cedula, String provincia) {
        return Modelo$.RegistrarNuevoUsuario(cedula, provincia);
    }

    private void validarCedulaProvincia(String cedula, String provincia) {
        Modelo$.validarBusquedaPersona(cedula, provincia);
    }

    private void validarInformacionRestante() {

    }

    private void calcularEdad(String dia, String mes, String anno) {
        Modelo$.setEdadNuevoUsuario(dia, mes, anno);
    }

    private void limpiarPantalla() {
        Modelo$.limpiarPantallaRegistroNuevoUsuario();
    }

    private void TerminosyCondiciones() {
        Modelo$.llamarTerminosyCondiciones();
    }

}
