/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import funes.view.TerminosyCondiciones;

public class ControladorTerminosyCondiciones implements ActionListener {

    private Model Modelo$;
    private TerminosyCondiciones TerminosyCondiciones$;

    @Override
    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();
        if (fuenteDelEvento == TerminosyCondiciones$.getjButtonSalirTerminosyCondiciones()) {
            salir();
        }
    }

    public ControladorTerminosyCondiciones(Model modelo, TerminosyCondiciones terminosyCondiciones) {
        this.Modelo$ = modelo;
        this.TerminosyCondiciones$ = terminosyCondiciones;
    }

    public void salir() {
        Modelo$.salirDeTerminosyCondiciones();
    }
}
