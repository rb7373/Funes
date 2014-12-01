/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import datos.EntidadDenunciada;
import funes.model.Model;
import funes.view.BusquedaEntidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Trei
 */
public class ControladorBuscarEntidad implements ActionListener {

    private Model Modelo$;
    private BusquedaEntidad buscarEntidad$;

    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();

        String entidad = buscarEntidad$.getjTextFieldNombreEntidad().getText();
        String cedJuridica = buscarEntidad$.getjTextFieldCedJuridica().getText();

        if (fuenteDelEvento == buscarEntidad$.getjButtonBuscarEntidad()) {

            buscarEntidad(entidad, cedJuridica);

        } else if (fuenteDelEvento == buscarEntidad$.getjButtonSalirBusquedaEntidad()) {
            salir();
            limpiarDatos();
        }

    }

    public ControladorBuscarEntidad(Model modelo, BusquedaEntidad buscarEntidad) {
        this.Modelo$ = modelo;
        this.buscarEntidad$ = buscarEntidad;
    }

    private void buscarEntidad(String nombre, String cedulaJuridica) {
        System.out.println("Se realizará busqueda de Entidad");
        ArrayList<EntidadDenunciada> solicitudBuscarEntidad = Modelo$.solicitudBuscarEntidad(nombre, cedulaJuridica);

        if (solicitudBuscarEntidad.size() > 0) {
            System.out.println("ENCONTRADO");
            buscarEntidad$.mostrarResultados(solicitudBuscarEntidad);
        } else {
            buscarEntidad$.mostrarMensajeError("No hay resultados a mostrar", "FUNATEC");
        }
    }

    public void mostrarVentanaEntidadDenunciada(String nombre, String cedJuridica,
            String provincia) {
        Modelo$.setRegistroEntidadDenunciada(nombre, cedJuridica, provincia);
    }

    private void salir() {
        Modelo$.salirDeBuscarEntidad();
    }
    
    private void limpiarDatos(){
        Modelo$.limpiarPantallaBuscarEntidad();
    }

}
