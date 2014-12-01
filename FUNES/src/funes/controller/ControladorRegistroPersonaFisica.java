/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import funes.view.RegistroPersonaFisica;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class ControladorRegistroPersonaFisica implements ActionListener {

    private Model Modelo$;
    private RegistroPersonaFisica RegistroPersonaFisica$;
    private Component parent;

    @Override
    public void actionPerformed(ActionEvent evento) {
        Object fuenteDelEvento = evento.getSource();

        String provincia = RegistroPersonaFisica$.getjComboBoxProvincia().getSelectedItem().toString();
        String cedula = RegistroPersonaFisica$.getjTextFieldcedulaDenunciado().getText();
        String nombre = RegistroPersonaFisica$.getNombre();
        String apellido1 = RegistroPersonaFisica$.getPrimerApellido();
        String apellido2 = RegistroPersonaFisica$.getSegundoApellido();
        String trabajo = RegistroPersonaFisica$.getLugarDeTrabajo();
        String cargo = RegistroPersonaFisica$.getCargo();
        String nombreCompleto = nombre.trim() + " " + apellido1.trim() + " " + apellido2.trim();

        if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonBuscarDenunciado()) {

            validarCedulaProvincia(cedula, provincia);

            System.out.println(provincia);
            System.out.println(cedula);

        } else if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonSubirFotoPersonaDenunciada()) {

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

        } else if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonRegistrarDenunciado()) {

            ArrayList<String> categorias = RegistroPersonaFisica$.getCategoriasEscogidas();
            System.out.println("lista categorias escogidas:");
            System.out.println(categorias);

            if (!(Modelo$.verificarExitenciaNuevoPersona(cedula))) {
                RegistroPersona(cedula, provincia, categorias);
                setProfile(nombreCompleto, cedula, trabajo, cargo);

            } else {
                RegistroPersonaFisica$.mostrarMensajeError("Esta persona ya fué registrada.", "Error");
            }

        } else if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonIntroducirCategoria()) {
            String categoriaAIngresar = RegistroPersonaFisica$.getCategoria();
            agregarCategoriaAPersona(categoriaAIngresar);

        } else if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonRegistrarNuevaCategoria()) {
            System.out.println("Usted desea registrar una nueva categoría");
            String nuevaCategoria = RegistroPersonaFisica$.getjTextFieldCategoriaRegistrada().getText();
            registrarCategoria(nuevaCategoria);

        } else if (fuenteDelEvento == RegistroPersonaFisica$.getjButtonSalirRegistroPersona()) {
            salir();
            limpiarDatos();
        }
    }

    // Constructores
    public ControladorRegistroPersonaFisica(Model Model$, RegistroPersonaFisica RegistroPersonaFisica$) {
        this.Modelo$ = Model$;
        this.RegistroPersonaFisica$ = RegistroPersonaFisica$;
    }

    private void validarCedulaProvincia(String cedula, String provincia) {
        Modelo$.validarBusquedaPersonaDenunciada(cedula, provincia);
    }
    
    private boolean RegistroPersona(String cedula, String provincia, ArrayList<String> cat){
        boolean exito = false;
        boolean registro =  Modelo$.registrarNuevaPersonaDenunciada(cedula, provincia, cat);
        if (registro){
             JOptionPane.showMessageDialog(null,"La persona ha sido registrada con éxito.", "FUNATEC", 
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarDatos();
                salir(); 
                exito = true;
        }
        else{
            exito = false;
        }
        return exito;
    }

    private void agregarCategoriaAPersona(String categoria) {
        Modelo$.agregoCategoriaPersona(categoria);

    }

    private void registrarCategoria(String categoria) {
        Modelo$.registroCategoriaPersona(categoria);

    }

    private void salir() {
        Modelo$.salirDeRegistrarPersonaFisica();
    }

    private void limpiarDatos() {
        Modelo$.limpiarPantallaRegistroPersona();
    }

    private void setPaginaPersonaDenunciada(String nombre, String cedula, String institucionLaboral, String cargo) {
        Modelo$.setRegistroPaginaPersonaDenunciada(nombre, cedula, institucionLaboral, cargo);
    }

    private void setProfile(String nombreCompleto, String cedula, String trabajo, String cargo) {
        setPaginaPersonaDenunciada(nombreCompleto, cedula, trabajo, cargo);
    }
}
