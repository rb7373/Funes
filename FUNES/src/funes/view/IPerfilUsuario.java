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
public interface IPerfilUsuario extends IGUI {

    public String getNickname();

    public String getContrasenna();

    public String getDiaDeNacimiento();

    public String getMesNacimiento();

    public String getAnnoNacimiento();

    public String getLugarDeTrabajo();

    public String getCargo();

    public String getPrivado();

    public String getCedula();

    public void setNicknameLabel(String nickname);

    public void setContrasenna(String contrasenna);

    public void setNickname(String nickname);

    public void setNombreCompleto(String nombreCompleto);

    public void setCedula(String cedula);

    public void setGenero(String genero);

    public void setAnnoNacimiento(String anno);

    public void setEdad(String edad);

    public void setLugarDeTrabajo(String lugarDeTrabajo);

    public void setCargo(String cargo);

    public void setPrivado(String privado);

    public void setDiaNacimiento(String dia);

    public void setMesNacimiento(String mes);

    public void habilitarContrasenna();

    public void deshabilitarContrasenna();

    public void habilitarFechaDeNacimiento();

    public void deshabilitarFechaDeNacimiento();

    public void habilitarLugarDeTrabajo();

    public void deshabilitarLugarDeTrabajo();

    public void habilitarCargo();

    public void deshabilitarCargo();

    public void habilitarPrivado();

    public void deshabilitarPrivado();

}
