/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.AdministradorPrincipal;
import funes.model.Model;
import funes.view.RegistroEntidad;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author USUARIO
 */
public class ControladorRegistroEntidad implements ActionListener {

    private Model Modelo$;  //Contiene una referencia al modelo
    private RegistroEntidad RegistroEntidad$;
    private Component parent;

    
    
    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();

        String nombre = RegistroEntidad$.getjTextFieldNombreEntidad().getText();
        String cedulaJuridica = RegistroEntidad$.getjTextFieldCedJuridica().getText();
        String pais = RegistroEntidad$.getjTextFieldPaisEntidad().getText();
        String provincia = RegistroEntidad$.getjComboBoxProvinciaEntidad().getSelectedItem().toString();
        String canton = RegistroEntidad$.getjTextFieldCanton().getText();
        String distrito = RegistroEntidad$.getjTextFieldDistrito().getText();
        String barrio = RegistroEntidad$.getjTextFieldBarrio().getText();

        if (fuenteDelEvento == RegistroEntidad$.getjButtonRegistrarEntidad()) {

            ArrayList<String> categorias = new ArrayList<String>();
            categorias = RegistroEntidad$.getCategoriasEscogidas();
            System.out.print(categorias);
            
            if ((categorias.size() == 0) || nombre.equals("") || (cedulaJuridica.equals(""))||(pais.equals(""))
                    || (provincia.equals("")) || (provincia.equals("")) ||(canton.equals("")) || 
                    (distrito.equals("")) || (barrio.equals(""))){
                
                RegistroEntidad$.mostrarMensajeError("Por favor llene todos los datos", "ERROR");
            }
            else{
                 if (!(Modelo$.verificarExitenciaNuevaEntidad(cedulaJuridica))) {
                        registrarEntidad(nombre, cedulaJuridica, pais, provincia, canton, distrito, barrio, categorias);
                        setProfile(nombre, cedulaJuridica);
                } else if (Modelo$.verificarExitenciaNuevaEntidad(cedulaJuridica)) {
                        RegistroEntidad$.mostrarMensajeError("Esta entidad ya fué registrada.", "Error");
                }
            
            }
           
        } else if (fuenteDelEvento == RegistroEntidad$.getjButtonSalirRegistroEntidad()) {
            salir();
            limpiarDatos();
        } else if (fuenteDelEvento == RegistroEntidad$.getjButtonAgregoCategoria()) {
            String categoriaAIngresar = RegistroEntidad$.getCategoria();
            agregarCategoriaAEntidad(categoriaAIngresar);

        } else if (fuenteDelEvento == RegistroEntidad$.getjButtonRegistrarCategoria()) {
            String nuevaCategoria = RegistroEntidad$.getjTextFieldCategoriaRegistrada().getText();
            registrarCategoria(nuevaCategoria);

        } else if (fuenteDelEvento == RegistroEntidad$.getjButtonFotoEntidadDenunciada()) {
            System.out.println("FOTOOOOOOOO");

            String rutaFoto;

            final JFileChooser cuadroArchivo = new JFileChooser();
            int returnVal = cuadroArchivo.showOpenDialog(parent);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = cuadroArchivo.getSelectedFile();
                //This is where a real application would open the file.
                System.out.println("Opening: " + file.getAbsolutePath());
                ImageIcon tmpIconAux = new ImageIcon(file.getAbsolutePath());
                rutaFoto = file.getAbsolutePath();
                //Escalar Imagen
//                    jLabelFotoEntidadDenunciada.getWidth();
//                    ImageIcon tmpIcon = new ImageIcon(tmpIconAux.getImage().getScaledInstance(jLabelFotoEntidadDenunciada.getWidth(), jLabelFotoEntidadDenunciada.getHeight(), Image.SCALE_SMOOTH));
//                    jLabelFotoEntidadDenunciada.setIcon(tmpIcon);

            } else {
                System.out.println("Open command cancelled by user.");
            }
        }
    }

    public ControladorRegistroEntidad(Model Modelo, RegistroEntidad registroEntidad) {
        this.Modelo$ = Modelo;
        this.RegistroEntidad$ = registroEntidad;

    }

    private void registrarEntidad(String entidad, String cedJuridica, String pais, String provincia,
            String canton, String distrito, String barrio, ArrayList<String> categorias) {

       Modelo$.registrarNuevaEntidad(entidad, cedJuridica, pais, provincia,
                canton, distrito, barrio, categorias);
      
            JOptionPane.showMessageDialog(null, "La entidad ha sido registrada con éxito.", "FUNATEC",
                    JOptionPane.INFORMATION_MESSAGE);
            salir();
            limpiarDatos();
           
        

    }

    private void agregarCategoriaAEntidad(String categoria) {
        Modelo$.agregoCategoriaEntidad(categoria);
    }

    private void registrarCategoria(String categoria) {
        Modelo$.registroCategoria(categoria);

    }

    private void salir() {
        Modelo$.salirDeRegistroEntidad();
    }

    public void limpiarDatos() {
        Modelo$.limpiarPantallaRegistroEntidad();
    }

    public void setProfile(String nombre, String Cedula) {
       Modelo$.setRegistroPaginaEntidadDenunciada(nombre, Cedula);
    }
}
