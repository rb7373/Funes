/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

/**
 *
 * @author USUARIO
 */
public interface IPaginaEntidadDenunciada extends IGUI {
    public String getCedula();
    public void setIntroCalificacion(String intro);   
    public void setCalifiacionEntidadDenunciada(String calificacion);
    public void setNombreEntidadDenunciada(String nombre);
    public void setCedulaJuridicaEntidadDenunciada(String cedula);
}
