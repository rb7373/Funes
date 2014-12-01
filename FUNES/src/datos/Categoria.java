package datos;

/**
 * Estudiantes : Dennisse Rojas Casanova : 2013001522 Rubén Abarca Navarro:
 * 201017259 Treicy Sánchez Gutiérrez: 2013001517 Fecha de creación de la clase:
 * 20/5/2014 Fecha de última modificaci�n : 21/5/2014 La clase contiene la
 * información respectiva sobre Categoría
 *
 *
 */
public class Categoria {

    private String nombre;
    //Si la categoría es de una entidad o una persona.
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String ptipo) {
        this.tipo = ptipo;

    }

}
