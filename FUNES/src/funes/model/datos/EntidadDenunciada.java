package funes.model.datos;



import datos.Calificacion;
import java.util.ArrayList;

/**
 * Estudiantes : Dennisse Rojas Casanova : 2013001522 Rub�n Abarca Navarro:
 * 201017259 Treicy S�nchez Guti�rrez: 2013001517 Fecha de creaci�n de la clase:
 * 20/5/2014 Fecha de �ltima modificaci�n : 21/5/2014 La clase contiene la
 * informaci�n respectiva sobre Entidad Denunciada
 *
 *
 */
public class EntidadDenunciada {

    private Categoria categoria;
    private String nombre = "";
    private String cedulaJuridica = "";
    private String pais;
    private String provincia;
    private String Canton;
    private String Distrito;
    private String Barrio;
    private String rutaFoto;

    private int id;

    ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();

    ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public double calcularPromedio(ArrayList<Calificacion> pCalificaciones) {

        double sumaCalificaciones = 0;
        int largo = pCalificaciones.size();
        double total = 0;

        for (int i = 0; i < largo; i++) {

            double calificacion;
            calificacion = pCalificaciones.get(i).getCalificacion();
            sumaCalificaciones += calificacion;

        }

        total = sumaCalificaciones / largo;

        return total;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

}
