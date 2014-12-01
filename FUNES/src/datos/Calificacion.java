package datos;

/**
 * Estudiantes : Dennisse Rojas Casanova : 2013001522
 *               Rub�n Abarca Navarro:     201017259
 *               Treicy S�nchez Guti�rrez: 2013001517
 * Fecha de creaci�n de la clase: 20/5/2014
 * Fecha de �ltima modificaci�n : 21/5/2014
 * La clase contiene la informaci�n respectiva sobre calificaci�n 
 * 
 *
 */
public class Calificacion {

    private String nickname;

    private int calificacion;

    private String comentario;

    private String rutaPrueba;

    private int id;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRutaPrueba() {
        return rutaPrueba;
    }

    public void setRutaPrueba(String rutaPrueba) {
        this.rutaPrueba = rutaPrueba;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
