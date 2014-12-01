/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.controller;

import funes.model.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import funes.view.LogIn;

/**
 *
 * @author USUARIO
 */
public class ControladorLogIn implements ActionListener {

    private Model Modelo$;
    private LogIn LogIn$;
    private String nickname;

    @Override
    public void actionPerformed(ActionEvent evento) {

        Object fuenteDelEvento = evento.getSource();

        if (fuenteDelEvento == LogIn$.getjButtonEntrar()) {
            String nickName = LogIn$.getjTextFieldNickname().getText();
            String password = new String(LogIn$.getjPasswordFieldContrasenna().getPassword());
            // validarUsuario(nickName, password);
            System.out.println(nickName);
            System.out.println(password);
            validarUsuario(nickName, password);
            actualizarPerfilUsuario(nickName);

        } else if (fuenteDelEvento == LogIn$.getjButtonSignUp()) {
            System.out.println("Registrar");
            SignUp();
        }
    }

    public ControladorLogIn(Model Model, LogIn LogIn) {
        this.Modelo$ = Model;
        this.LogIn$ = LogIn;
    }

    private void SignUp() {
        Modelo$.solicitudRegistrarNuevoUsuario();
    }

    private void validarUsuario(String usuario, String contrasenna) {
        Modelo$.ValidarCuentadeUsuario(usuario, contrasenna);
    }

    private void actualizarPerfilUsuario(String nickname) {
        Modelo$.ActualizarPerfilUsuarioLogueado(nickname);
    }
}
