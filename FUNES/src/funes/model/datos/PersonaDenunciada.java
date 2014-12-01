package funes.model.datos;

import datos.Calificacion;
import java.util.ArrayList;

public class PersonaDenunciada extends Persona {

    private String provincia;
    private ArrayList<Categoria> categorias;
    private ArrayList<Calificacion> calificacion;
    private String rutaFoto;

	// M�todos que utiliza la clase
    public void calcularPromedio() {

    }

    // Getters and Setters
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Calificacion> getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(ArrayList<Calificacion> calificacion) {
        this.calificacion = calificacion;
    }

    public void setProvincia(String pProvincia) {
        this.provincia = pProvincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

}
