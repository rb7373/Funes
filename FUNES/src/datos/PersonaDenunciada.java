package datos;

import funes.model.datos.*;
import java.util.ArrayList;

public class PersonaDenunciada extends Persona {
	
        private String provincia;
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private ArrayList<Calificacion> calificacion = new ArrayList<Calificacion>();
        private String rutaFoto;
	
	// M�todos que utiliza la clase
	
	public void calcularPromedio(){
		
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
        
	public void setProvincia(String pProvincia){
            this.provincia = pProvincia;
        }
        public String getProvincia(){
            return provincia;
        }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

}
