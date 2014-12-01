package funes.model.datos;

import java.util.Calendar;

/**
 * Fecha de Creaci�n: 20/05/2014 Dennisse Rojas
 *
 * La clase Persona es la clase base de todos los objetos que hacen referencia a
 * una persona f�sica en el sistema FUNES.
 *
 * Contiene todos los atributos necesarios para identificar a una persona en la
 * base de datos del Tribunal Supremo de Elecciones.
 *
 * Posee le m�todo calcularEdad(), el cual calcula la edad de la persona basada
 * en su fecha de nacimiento.
 *
 */
public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String genero;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private int edad;
    private String institucionLaboral;
    private String cargo;

	// Metodos que implemeta la clase
    public void calcularEdad() {

        // Calcula la fecha actual del sistema
        Calendar fechaActual = Calendar.getInstance();
        int diaActual = fechaActual.get(Calendar.DATE);
        int mesActual = fechaActual.get(Calendar.MONTH);
        int anoActual = fechaActual.get(Calendar.YEAR);

		// Calcula la edad de la persona
        edad = anoActual - anoNacimiento;
        if (mesNacimiento > mesActual) {
            edad -= 1;
        }
        if (mesNacimiento == mesActual) {
            if (diaNacimiento > diaActual) {
                edad -= 1;
            }

        }
        setEdad(edad);
    }

	// Getters and Settters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getInstitucionLaboral() {
        return institucionLaboral;
    }

    public void setInstitucionLaboral(String institucionLaboral) {
        this.institucionLaboral = institucionLaboral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        Persona Denisse = new Persona();
        Denisse.setNombre("Denisse");
        Denisse.setAnoNacimiento(1995);
        Denisse.setMesNacimiento(1);
        Denisse.setDiaNacimiento(3);
        Denisse.calcularEdad();

        System.out.println(Denisse.nombre + " tiene " + Denisse.edad + " annos.");

        Persona Treicy = new Persona();
        Treicy.setNombre("Treicy");
        Treicy.setAnoNacimiento(1994);
        Treicy.setMesNacimiento(1);
        Treicy.setDiaNacimiento(27);
        Treicy.calcularEdad();

        System.out.println(Treicy.nombre + " tiene " + Treicy.edad + " annos.");
    }

}
