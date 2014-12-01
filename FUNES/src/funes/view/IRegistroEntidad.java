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
public interface IRegistroEntidad extends IGUI {

    public String getNombre();

    public String getCedulaJuridica();

    public String getProvincia();

    public String getPais();

    public String getCanton();

    public String getBarrio();

    public String getDistrito();

    public String getCategoria();

    public void setNombre();

    public void setCedulaJuridica();

    public void setPais();

    public void setCanton();

    public void setBarrio();

    public void setDistrito();

    public void setCategoria(String pCategoria);

    public void setCategoriasEscogidas();

    public void nuevaCategoria(String categoria);

    public void setCategoriaRegistrada();

    public ArrayList<String> getCategoriasEscogidas();

    public ArrayList<String> getCategoriasAEscoger();

}
