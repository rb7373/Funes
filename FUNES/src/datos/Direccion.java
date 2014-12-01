package datos;

/**
 * Estudiantes : Dennisse Rojas Casanova : 2013001522 Rub�n Abarca Navarro:
 * 201017259 Treicy Sanchez Gutierrez: 2013001517 Fecha de creaci�n de la clase:
 * 20/5/2014 Fecha de �ltima modificaci�n : 21/5/2014 La clase contiene la
 * informaci�n respectiva sobre direcci�n
 *
 *
 */
public class Direccion {

    private String pais = "";

    private String provincia = "";

    private String canton = "";

    private String distrito = "";

    private String barrio = "";

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

}
