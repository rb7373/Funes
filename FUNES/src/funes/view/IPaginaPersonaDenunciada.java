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
public interface IPaginaPersonaDenunciada extends IGUI {
    public String getNombreCompleto();
    public String getCedula();
    
    public void setNombrePersonaDenunciada(String nombre);

    public void setCedulaPersonaDenunciada(String cedula);

    public void setEdadPersonaDenunciada(String edad);

    public void setLugarDondeLaboraPersonaDenunciada(String lugar);

    public void setCargoPersonaDenunciada(String cargo);
    public void setCalifiacionPersonaDenunciada(String calificacion);
    public void setIntroCalificacion(String intro);
    
}
