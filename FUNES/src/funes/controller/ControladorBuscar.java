/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.Buscar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ControladorBuscar implements ActionListener {

    private Model Modelo$;
    private Buscar Buscar$;

    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();
        

        if (fuenteDelEvento == Buscar$.getjButtonBuscarPorPersona()) {
            System.out.println("Usted quiere buscar una persona");
            buscarPersona();
        } else if (fuenteDelEvento == Buscar$.getjButtonBuscarPorCategoria()) {
            System.out.println("Usted quiere buscar una categoría");
            buscarCategoria();

        } else if (fuenteDelEvento == Buscar$.getjButtonBuscarPorEntidad()) {
            System.out.println("Usted quiere buscar una entidad");
            buscarEntidad();
        } else if (fuenteDelEvento == Buscar$.getjButtonSalirBuscar()) {
            salir();
        }
        else if(fuenteDelEvento == Buscar$.getjButtonCategoriasTotales()){
            mostrarCategorias();
        }
    }

    public ControladorBuscar(Model Modelo, Buscar buscar) {
        this.Modelo$ = Modelo;
        this.Buscar$ = buscar;
    }

    private void buscarEntidad() {
        Modelo$.solicitudBuscarEntidad();

    }

    private void buscarPersona() {
        Modelo$.solicitudBuscarPersona();

    }

    private void buscarCategoria() {
        Modelo$.solicitudBuscarTipoCategoria();

    }

    private void salir() {
        Modelo$.salirDeBuscar();
    }
    private void mostrarCategorias(){
        ArrayList<String> solicitudBuscarCategoria = Modelo$.mostrarCategoriasRegistradas();
        
        if (solicitudBuscarCategoria.size() > 0) {
            System.out.println("ENCONTRADO");
            Buscar$.mostrarResultados(solicitudBuscarCategoria);
        } else {
            Buscar$.mostrarMensajeError("No hay resultados a mostrar", "FUNATEC");
        }
        
    }
}
