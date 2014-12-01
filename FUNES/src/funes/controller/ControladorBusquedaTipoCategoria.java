/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.BusquedaTipoCategoria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Trei
 */
public class ControladorBusquedaTipoCategoria implements ActionListener {

    private Model Modelo$;
    private BusquedaTipoCategoria BuscarTipoCategoria$;

    public void actionPerformed(ActionEvent evento) {

        String categoria = BuscarTipoCategoria$.getjTextFieldTipoCategoria().getText();
        String tipoDenunciado = BuscarTipoCategoria$.getjComboBoxEntPers().getSelectedItem().toString();

        Object fuenteDelEvento = evento.getSource();
        if (fuenteDelEvento == BuscarTipoCategoria$.getButtonBuscarTipoCategoria()) {
            BuscarPortipoCategoria(categoria, tipoDenunciado);

        } else if (fuenteDelEvento == BuscarTipoCategoria$.getjButtonSalirBUsquedaTipoCategoria()) {
            salir();
            limpiarDatos();
        }

    }

    public ControladorBusquedaTipoCategoria(Model Modelo$, BusquedaTipoCategoria BuscarTipoCategoria$) {
        this.Modelo$ = Modelo$;
        this.BuscarTipoCategoria$ = BuscarTipoCategoria$;

    }

    private void BuscarPortipoCategoria(String categoria, String tipoDenunciado) {
        System.out.println("Se realizara la busqueda por tipo de categoria");
        Modelo$.solicitudBuscarTipoCategoria(categoria, tipoDenunciado);

    }

    public void mostrarVentanaEntidadDenunciada(String nombre, String cedJuridica,
            String provincia) {
        Modelo$.setRegistroEntidadDenunciada(nombre, cedJuridica, provincia);
    }

    public void mostrarVentanaPersonaDenunciada(String nombre, String cedula,
            String institucionLaboral, String cargo) {
        Modelo$.setRegistroPaginaPersonaDenunciada(nombre, cedula,
                institucionLaboral, cargo);
    }

    private void salir() {
        Modelo$.salirDeBusquedaTipoCategoria();
    }

    private void limpiarDatos() {
        Modelo$.limpiarPantallaBuscarCategoria();
    }

}
