/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import datos.PersonaDenunciada;
import funes.model.Model;
import funes.view.PaginaPersonaDenunciada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPaginaPersonaDenunciada implements ActionListener {

    private Model Modelo$;
    private PaginaPersonaDenunciada PaginaPersonaDenunciada$;

    @Override
    public void actionPerformed(ActionEvent evento) {
        Object fuentoDelEvento = evento.getSource();
        System.out.println("Evento");
        
        PersonaDenunciada persona$;
        
      
        if (fuentoDelEvento == PaginaPersonaDenunciada$.getjButtonDenunciarPersonaFisica()){
            String razon = PaginaPersonaDenunciada$.getjTextAreaComentarioDeDenuncia().getText();
            System.out.println("Razon: " + razon);
            String calificacion =  String.valueOf(PaginaPersonaDenunciada$.getResultadoCalificacion());
            String nombre = PaginaPersonaDenunciada$.getNombreCompleto();
            String cedula = PaginaPersonaDenunciada$.getCedula();
            
            if (razon.equals("")){
                PaginaPersonaDenunciada$.mostrarMensajeError("Por favor, indica la razón de tu denuncia.","ERROR");
            }
            
            else if (!(usuarioYaCalifico(cedula))){
                    denunciarPersonaFisica(calificacion, nombre, razon, cedula);
            }
            else{
                PaginaPersonaDenunciada$.mostrarMensajeError("Ya has calificado anteriormente a este usuario","ERROR");
            }
            
        }
        else if (fuentoDelEvento == PaginaPersonaDenunciada$.getjButtonSalirPaginaPersonaDenunciada()){
            limpiarDatos(); 
            PaginaPersonaDenunciada$.ocultarVentana();

        }
    }

public ControladorPaginaPersonaDenunciada(Model model, PaginaPersonaDenunciada paginaPersonaDenunciada) {
        this.Modelo$ = model;
        this.PaginaPersonaDenunciada$ = paginaPersonaDenunciada;
    }
    
    public void denunciarPersonaFisica(String calificacion, String nombreCompleto, String razon, String cedula)
    {
        Modelo$.setearCalificacionPersonaDenunciada(calificacion,  nombreCompleto, razon, cedula);
    }

    private boolean usuarioYaCalifico(String cedula) {
       
        return Modelo$.verificarSiUsuarioYaCalificoPersonaDenunciada(cedula);
                       
    }
    private void limpiarDatos(){
        Modelo$.salirDePersonaDenunciada();
    }
    
}
