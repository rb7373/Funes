package funes.model.datos;

import java.util.ArrayList;

public class Usuario extends Persona {

    private String nickname;
    private String contrasena;
    private String provincia;
    private boolean bloqueado;
    private boolean privado;
    private ArrayList<Reporte> reportes;

    // Metodos que implementa la clase
    public void registrarPersona() {

    }

    public void registrarEntidad() {

    }

    public void calificarPersona() {

    }

    public void calificarEntidad() {

    }

    public void reportarUsuario() {

    }

	// Getters and Setters
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }

}
