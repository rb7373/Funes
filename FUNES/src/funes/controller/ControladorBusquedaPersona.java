/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import datos.PersonaDenunciada;
import funes.model.Model;
import funes.view.BusquedaPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorBusquedaPersona implements ActionListener {

    private Model Modelo$;
    private BusquedaPersona BuscarPersona$;

    public void actionPerformed(ActionEvent evento) {

        Object fuenteDelEvento = evento.getSource();
        String nombre = BuscarPersona$.getjTextFieldNombrePersona().getText();
        String primerApellido = BuscarPersona$.getjTextFieldApellido1Persona().getText();
        String segundoApellido = BuscarPersona$.getjTextFieldApellido2Persona().getText();
        String cedula = BuscarPersona$.getjTextFieldCedulaPersona().getText();

        if (fuenteDelEvento == BuscarPersona$.getButtonBuscarPersona()) {

            BuscarPersona(nombre, cedula, primerApellido, segundoApellido);

        } else if (fuenteDelEvento == BuscarPersona$.getjButtonSalirBusquedaPersona()) {
            salir();
            limpiarDatos();
        }

    }

    public ControladorBusquedaPersona(Model Modelo$, BusquedaPersona BusquedaPersona$) {
        this.Modelo$ = Modelo$;
        this.BuscarPersona$ = BusquedaPersona$;
    }

    private void BuscarPersona(String nombre, String cedula, String primerApellido, String segundoApellido) {
        System.out.println("Se realizará la busqueda de persona");
       
        ArrayList<PersonaDenunciada> solicitudBuscarPersona = Modelo$.solicitudBuscarPersona(nombre, cedula, primerApellido, segundoApellido);

        if (solicitudBuscarPersona.size() > 0) {
            System.out.println("ENCONTRADO");
            BuscarPersona$.mostrarResultados(solicitudBuscarPersona);
        } else {
            BuscarPersona$.mostrarMensajeError("No hay resultados a mostrar", "FUNATEC");
        }

    }

    private void salir() {
        Modelo$.salirDeBusquedaPersona();
    }

    public void mostrarVentanaPersonaDenunciada(String nombre, String cedula,
            String institucionLaboral, String cargo) {
        Modelo$.setRegistroPaginaPersonaDenunciada(nombre, cedula,
                institucionLaboral, cargo);
    }
    public void limpiarDatos(){
        Modelo$.limpiarPantallaBuscarPersona();
    }
}
