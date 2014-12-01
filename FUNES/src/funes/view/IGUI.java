/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.view;

/**
 * Posee la definicion de metodos comunes a las ventanas graficas
 *
 * @author RUBEN
 */
public interface IGUI {

    public void mostrarMensajeError(String mensaje, String titulo);

    public void vincularEventos();

    public void mostrarVentana();

    public void ocultarVentana();
}
