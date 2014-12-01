/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

import datos.EntidadDenunciada;
import datos.PersonaDenunciada;
import java.util.ArrayList;

/**
 *
 * @author Trei
 */
public interface IBusquedaTipoCategoria extends IGUI {

    public void mostrarResultadosEntidad(ArrayList<EntidadDenunciada> resultado);

    public void mostrarResultadosPersona(ArrayList<PersonaDenunciada> resultado);
    public void setCategoria();

}
