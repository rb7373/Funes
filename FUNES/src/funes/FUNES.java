/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes;

import funes.model.Model;
import funes.model.networking.MultiThreadedSocketServer;
import funes.view.LogIn;
import funes.view.RegistroNuevoUsuario;
import funes.view.RegistroPersonaFisica;
import funes.view.RegistroEntidad;
import funes.view.PerfilUsuario;
import funes.view.Buscar;
import funes.view.BusquedaEntidad;
import funes.view.BusquedaPersona;
import funes.view.BusquedaTipoCategoria;
import funes.view.PaginaEntidadDenunciada;
import funes.view.PaginaPersonaDenunciada;
import funes.view.TerminosyCondiciones;

public class FUNES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");

        Model modelo = new Model();

        MultiThreadedSocketServer servidor = new MultiThreadedSocketServer(11111, modelo);
        new Thread(servidor).start();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                RegistroNuevoUsuario registroNuevoUsuario = new RegistroNuevoUsuario(modelo);
                LogIn logIn = new LogIn(modelo);
                RegistroPersonaFisica registroPersonaFisica = new RegistroPersonaFisica(modelo);
                RegistroEntidad registroEntidad = new RegistroEntidad(modelo);
                PerfilUsuario perfilUsuario = new PerfilUsuario(modelo);
                Buscar buscar = new Buscar(modelo);
                BusquedaPersona busquedaPersona = new BusquedaPersona(modelo);
                BusquedaEntidad busquedaEntidad = new BusquedaEntidad(modelo);
                BusquedaTipoCategoria busquedaTipoCategoria = new BusquedaTipoCategoria(modelo);

                PaginaEntidadDenunciada paginaEntidadDenunciada = new PaginaEntidadDenunciada(modelo);
                PaginaPersonaDenunciada paginaPersonaDenunciada = new PaginaPersonaDenunciada(modelo);

                TerminosyCondiciones terminosyCondiciones = new TerminosyCondiciones(modelo);

                //RegistroNuevoUsuarioConsola registroNuevoUsuarioConsola = new RegistroNuevoUsuarioConsola(modelo);
                registroNuevoUsuario.setVisible(false);
                logIn.setVisible(true);
                registroPersonaFisica.setVisible(false);
                registroEntidad.setVisible(false);
                perfilUsuario.setVisible(false);
                buscar.setVisible(false);
                busquedaPersona.setVisible(false);
                busquedaEntidad.setVisible(false);
                busquedaTipoCategoria.setVisible(false);
                paginaPersonaDenunciada.setVisible(false);
                paginaEntidadDenunciada.setVisible(false);
                terminosyCondiciones.setVisible(false);

                modelo.setRegistroNuevoUsuario$(registroNuevoUsuario);
                modelo.setLogIn$(logIn);
                modelo.setRegistroPersonaFisica$(registroPersonaFisica);
                modelo.setRegistroEntidad(registroEntidad);
                modelo.setPerfilUsuario$(perfilUsuario);
                modelo.setBuscar(buscar);
                modelo.setBuscarEntidad$(busquedaEntidad);
                modelo.setBuscarPersona$(busquedaPersona);
                modelo.setBuscarTipoCategoria$(busquedaTipoCategoria);
                modelo.setPaginaPersonaDenunciada(paginaPersonaDenunciada);
                modelo.setPaginaEntidadDenunciada(paginaEntidadDenunciada);
                modelo.setTerminosyCondiciones(terminosyCondiciones);

                //SERVIDOR - PARA dispositivos remotos
            }
        });
    }

}
