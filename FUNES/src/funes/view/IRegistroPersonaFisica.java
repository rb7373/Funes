/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface IRegistroPersonaFisica extends IGUI {

    public void setCedula(String cedula);

    public void setSexo(String sexo); //1=Masculino   2=Femenino   

    public void setNombre(String nombre);

    public void setPrimerApellido(String apellido);

    public void setSegundoApellido(String apellido);

    public void setLugarDeTrabajo();

    public void setCargo();

    public void setBusquedaExitosa(boolean exitoso);

    public String getNombre();

    public String getPrimerApellido();

    public String getSegundoApellido();

    public String getCedula();

    public String getProvincia();

    public String getGenero();

    public String getLugarDeTrabajo();

    public String getCargo();

    public String getCategoria();

    public void setCategoriaEscogida(String pCategoria);

    public void setCategoriasEscogidas();

    public void nuevaCategoria(String categoria);

    public void setCategoriaRegistrada();

    public ArrayList<String> getCategoriasEscogidas();

    public ArrayList<String> getCategoriasAEscoger();

}
