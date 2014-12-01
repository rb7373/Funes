/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.PaginaEntidadDenunciada;
import funes.view.PaginaPersonaDenunciada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPaginaEntidadDenunciada implements ActionListener {

    private Model Modelo$;
    private PaginaEntidadDenunciada PaginaEntidadDenunciada$;

    public ControladorPaginaEntidadDenunciada(Model model, PaginaEntidadDenunciada paginaPersonaDenunciada) {
        this.Modelo$ = model;
        this.PaginaEntidadDenunciada$ = paginaPersonaDenunciada;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Object fuentoDelEvento = evento.getSource();
        if (fuentoDelEvento == PaginaEntidadDenunciada$.getjButtonDenunciarEntidadFisica()) {
            
            String razon = PaginaEntidadDenunciada$.getjTextAreaComentarioDeDenuncia().getText();
            String calificacion =  String.valueOf(PaginaEntidadDenunciada$.getResultadoCalificacion());
            String nombre = PaginaEntidadDenunciada$.getjLabelNombreEntidadDenunciada().getText();
            String cedula = PaginaEntidadDenunciada$.getjLabelCedulaJuridicaEntidadDenunciada().getText();
            
             if (razon.equals("")){
                PaginaEntidadDenunciada$.mostrarMensajeError("Por favor, indica la razón de tu denuncia.","ERROR");
            }
             else if (!(usuarioYaCalifico(cedula))){
                    denunciarEntidad(calificacion, nombre, razon, cedula);
            }
            else{
                PaginaEntidadDenunciada$.mostrarMensajeError("Ya has calificado anteriormente a esta entidad","ERROR");
            }
            
            
            System.out.println("Denunciado!!!!");
            System.out.println(razon);
            System.out.println("Calificacion de entidad: " + String.valueOf(PaginaEntidadDenunciada$.getResultadoCalificacion()));
            
            
        } else if (fuentoDelEvento == PaginaEntidadDenunciada$.getjButtonSalirPaginaEntidadDenunciada()) {
            PaginaEntidadDenunciada$.ocultarVentana();
        }

    }
    public void denunciarEntidad(String calificacion,String nombre,String  razon,String cedula){
        Modelo$.setearCalificacionEntidadDenunciada(calificacion, nombre,razon,cedula);
    }
    public boolean usuarioYaCalifico(String cedula){
        return Modelo$.verificarSiUsuarioYaCalificoEntidadDenunciada(cedula);
    }
}
