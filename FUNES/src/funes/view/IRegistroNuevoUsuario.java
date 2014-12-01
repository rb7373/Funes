/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

/**
 *
 * @author RUBEN
 */
public interface IRegistroNuevoUsuario extends IGUI {

    public void setCedula(String cedula);

    public void setSexo(String sexo); //1=Masculino   2=Femenino   

    public void setNombre(String nombre);

    public void setPrimerApellido(String apellido);

    public void setSegundoApellido(String apellido);

    public void setAnnoNacimiento();

    public void setLugarDeTrabajo();

    public void setCargo();

    public void setNickname();

    public void setContrasenna();

    public void setBusquedaExitosa(boolean exitoso);

    public void setEdad(String edad);

    public String getNombre();

    public String getPrimerApellido();

    public String getSegundoApellido();

    public String getCedula();

    public String getProvincia();

    public String getDiaNacimiento();

    public String getMesNacimiento();

    public String getAnnoNacimiento();

    public String getEdad();

    public String getGenero();

    public String getLugarDeTrabajo();

    public String getCargo();

    public String getNickname();

    public String getContrasenna();

    public String getPrivado();
    // falta privado
}
