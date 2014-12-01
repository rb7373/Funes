/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funes.model;

import funes.view.ILogin;
import funes.view.IRegistroNuevoUsuario;
import funes.view.IRegistroPersonaFisica;
import funes.view.IRegistroEntidad;
import funes.view.IPerfilUsuario;
import funes.view.IBuscar;
import funes.view.IBusquedaEntidad;
import funes.view.IBusquedaPersona;
import funes.view.IBusquedaTipoCategoria;
import funes.view.IPaginaPersonaDenunciada;
import funes.view.IPaginaEntidadDenunciada;
import funes.view.ITerminosyCondiciones;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import busquedas.AdministradorDeBusquedas;
import datos.*;
import funes.model.networking.controller.ProtocoloComunicacion;

public class Model {
    
    private String usuarioEnCurso;

    private IRegistroNuevoUsuario RegistroNuevoUsuario$ = null;
    private IRegistroPersonaFisica RegistroPersonaFisica$ = null;
    private ILogin LogIn$ = null;
    private IRegistroEntidad RegistroEntidad$ = null;
    private IPerfilUsuario perfilUsuario$ = null;
    private IBuscar Buscar$ = null;
    private IBusquedaEntidad busquedaEntidad$ = null;
    private IBusquedaPersona busquedaPersona$ = null;
    private IBusquedaTipoCategoria busquedaTipoCategoria$ = null;
    private IPaginaPersonaDenunciada paginaPersonaDenunciada$ = null;
    private IPaginaEntidadDenunciada paginaEntidadDenunciada$ = null;
    private ITerminosyCondiciones terminosyCondiciones$ = null;

    private AdministradorArchivos AdministradorArchivos$ = new AdministradorArchivos();
    private AdministradorPrincipal AdministradorPrincipal$ = new AdministradorPrincipal();
    private AdministradorDeBusquedas AdministradorBusquedas = new AdministradorDeBusquedas();

    public Model() {

        ArrayList<String> pDatosPersonales = new ArrayList<>();

        String provincia = "San José";
        String cedula = "114910642";
        String nombre = "RUBEN";
        String primerApellido = "ABARCA";
        String segundoApellido = "NAVARRO";
        String genero = "1";
        String dia = "03";
        String mes = "02";
        String anno = "1992";
        String edad = "22";
        String lugarDeTrabajo = "TEC";
        String cargo = "ESTUDIANTE";
        String nickname = "RB";
        String contrasenna = "RB";
        String privado = "Privado";

        pDatosPersonales.add(0, provincia);
        pDatosPersonales.add(1, cedula);
        pDatosPersonales.add(2, nombre);
        pDatosPersonales.add(3, primerApellido);
        pDatosPersonales.add(4, segundoApellido);
        pDatosPersonales.add(5, genero);
        pDatosPersonales.add(6, dia);
        pDatosPersonales.add(7, mes);
        pDatosPersonales.add(8, anno);
        pDatosPersonales.add(9, edad);
        pDatosPersonales.add(10, lugarDeTrabajo);
        pDatosPersonales.add(11, cargo);
        pDatosPersonales.add(12, nickname);
        pDatosPersonales.add(13, contrasenna);
        pDatosPersonales.add(14, privado);
        AdministradorPrincipal$.registrarNuevoUsuario(pDatosPersonales);

        ArrayList<String> pDatosPersonalesDenunciado = new ArrayList<>();

        String provinciaDenunciado = "San José";
        String cedulaDenunciado = "504020156";
        String nombreDenunciado = "Treicy";
        String primerApellidoDenunciado = "Sánchez";
        String segundoApellidoDenunciado = "Gutiérrez";
        String generoDenunciado = "2";
        String lugarTrabajoDenunciado = "TEC";
        String cargoDenunciado = "Profesora";

        pDatosPersonalesDenunciado.add(0, provinciaDenunciado);
        pDatosPersonalesDenunciado.add(1, cedulaDenunciado);
        pDatosPersonalesDenunciado.add(2, nombreDenunciado);
        pDatosPersonalesDenunciado.add(3, primerApellidoDenunciado);
        pDatosPersonalesDenunciado.add(4, segundoApellidoDenunciado);
        pDatosPersonalesDenunciado.add(5, generoDenunciado);
        pDatosPersonalesDenunciado.add(6, lugarTrabajoDenunciado);
        pDatosPersonalesDenunciado.add(7, cargoDenunciado);

        ArrayList<String> catEscogidas = new ArrayList<String>();
        catEscogidas.add("Chofer");
        catEscogidas.add("Dueño mascotas");
        catEscogidas.add("Diputado");
        catEscogidas.add("Presidente");
        catEscogidas.add("Estudiante");

        AdministradorPrincipal$.registrarPersona(pDatosPersonalesDenunciado, catEscogidas);
        System.out.println("El registro de persona fue: Exitoso");

        pDatosPersonalesDenunciado = new ArrayList<>();

        provinciaDenunciado = "San José";
        cedulaDenunciado = "115930572";
        nombreDenunciado = "Catalina";
        primerApellidoDenunciado = "Castro";
        segundoApellidoDenunciado = "Mena";
        generoDenunciado = "2";
        lugarTrabajoDenunciado = "TEC";
        cargoDenunciado = "Astronauta";

        pDatosPersonalesDenunciado.add(0, provinciaDenunciado);
        pDatosPersonalesDenunciado.add(1, cedulaDenunciado);
        pDatosPersonalesDenunciado.add(2, nombreDenunciado);
        pDatosPersonalesDenunciado.add(3, primerApellidoDenunciado);
        pDatosPersonalesDenunciado.add(4, segundoApellidoDenunciado);
        pDatosPersonalesDenunciado.add(5, generoDenunciado);
        pDatosPersonalesDenunciado.add(6, lugarTrabajoDenunciado);
        pDatosPersonalesDenunciado.add(7, cargoDenunciado);

        catEscogidas = new ArrayList<String>();
        catEscogidas.add("Chofer");
        catEscogidas.add("Dueño mascotas");
        catEscogidas.add("Presidente");

        AdministradorPrincipal$.registrarPersona(pDatosPersonalesDenunciado, catEscogidas);
        System.out.println("El registro de persona fue: Exitoso");

        pDatosPersonalesDenunciado = new ArrayList<>();

        provinciaDenunciado = "Heredia";
        cedulaDenunciado = "115930575";
        nombreDenunciado = "Denisse";
        primerApellidoDenunciado = "Solis";
        segundoApellidoDenunciado = "Mena";
        generoDenunciado = "2";
        lugarTrabajoDenunciado = "TEC";
        cargoDenunciado = "Astronauta";

        pDatosPersonalesDenunciado.add(0, provinciaDenunciado);
        pDatosPersonalesDenunciado.add(1, cedulaDenunciado);
        pDatosPersonalesDenunciado.add(2, nombreDenunciado);
        pDatosPersonalesDenunciado.add(3, primerApellidoDenunciado);
        pDatosPersonalesDenunciado.add(4, segundoApellidoDenunciado);
        pDatosPersonalesDenunciado.add(5, generoDenunciado);
        pDatosPersonalesDenunciado.add(6, lugarTrabajoDenunciado);
        pDatosPersonalesDenunciado.add(7, cargoDenunciado);

        catEscogidas = new ArrayList<String>();
        catEscogidas.add("Chofer");
        catEscogidas.add("Dueño mascotas");
        catEscogidas.add("Presidente");

        AdministradorPrincipal$.registrarPersona(pDatosPersonalesDenunciado, catEscogidas);
        System.out.println("El registro de persona fue: Exitoso");

        pDatosPersonalesDenunciado = new ArrayList<>();

        provinciaDenunciado = "Heredia";
        cedulaDenunciado = "115930571";
        nombreDenunciado = "Catalina";
        primerApellidoDenunciado = "Solis";
        segundoApellidoDenunciado = "Mena";
        generoDenunciado = "2";
        lugarTrabajoDenunciado = "TEC";
        cargoDenunciado = "Astronauta";

        pDatosPersonalesDenunciado.add(0, provinciaDenunciado);
        pDatosPersonalesDenunciado.add(1, cedulaDenunciado);
        pDatosPersonalesDenunciado.add(2, nombreDenunciado);
        pDatosPersonalesDenunciado.add(3, primerApellidoDenunciado);
        pDatosPersonalesDenunciado.add(4, segundoApellidoDenunciado);
        pDatosPersonalesDenunciado.add(5, generoDenunciado);
        pDatosPersonalesDenunciado.add(6, lugarTrabajoDenunciado);
        pDatosPersonalesDenunciado.add(7, cargoDenunciado);

        catEscogidas = new ArrayList<String>();
        catEscogidas.add("Chofer");
        catEscogidas.add("Dueño mascotas");
        catEscogidas.add("Presidente");

        AdministradorPrincipal$.registrarPersona(pDatosPersonalesDenunciado, catEscogidas);
        System.out.println("El registro de persona fue: Exitoso");

        ArrayList<String> datosEntidad = new ArrayList<String>();

        String entidad = "TEC";
        String cedJuridica = "6789";
        String pais = "Costa Rica";
        String provinciaEntidad = "Cartago";
        String canton = "central";
        String distrito = "pepe";
        String barrio = "centro";

        datosEntidad.add(0, entidad);
        datosEntidad.add(1, cedJuridica);
        datosEntidad.add(2, pais);
        datosEntidad.add(3, provinciaEntidad);
        datosEntidad.add(4, canton);
        datosEntidad.add(5, distrito);
        datosEntidad.add(6, barrio);

        ArrayList<String> catEntidad = new ArrayList<String>();
        catEntidad.add("restaurante");
        catEntidad.add("estudiantil");

        AdministradorPrincipal$.registrarEntidad(datosEntidad, catEntidad);

        datosEntidad = new ArrayList<String>();

        entidad = "ASONI";
        cedJuridica = "123456";
        pais = "Costa Rica";
        provinciaEntidad = "San Jose";
        canton = "San José";
        distrito = "Hatillo";
        barrio = "Sagrada Familia";

        datosEntidad.add(0, entidad);
        datosEntidad.add(1, cedJuridica);
        datosEntidad.add(2, pais);
        datosEntidad.add(3, provinciaEntidad);
        datosEntidad.add(4, canton);
        datosEntidad.add(5, distrito);
        datosEntidad.add(6, barrio);

        catEntidad = new ArrayList<String>();
        catEntidad.add("Ayuda Social");
        catEntidad.add("Senasa");
        catEntidad.add("condominio");

        AdministradorPrincipal$.registrarEntidad(datosEntidad, catEntidad);

        datosEntidad = new ArrayList<String>();

        entidad = "ASONI tec";
        cedJuridica = "1234564";
        pais = "Costa Rica";
        provinciaEntidad = "San Jose";
        canton = "San José";
        distrito = "Hatillo";
        barrio = "Sagrada Familia";

        datosEntidad.add(0, entidad);
        datosEntidad.add(1, cedJuridica);
        datosEntidad.add(2, pais);
        datosEntidad.add(3, provinciaEntidad);
        datosEntidad.add(4, canton);
        datosEntidad.add(5, distrito);
        datosEntidad.add(6, barrio);

        catEntidad = new ArrayList<String>();
        catEntidad.add("Ayuda Social");
        catEntidad.add("Senasa");
        catEntidad.add("condominio");

        AdministradorPrincipal$.registrarEntidad(datosEntidad, catEntidad);

    }

    public void setPerfilUsuario$(IPerfilUsuario perfilUsuario$) {
        this.perfilUsuario$ = perfilUsuario$;
    }

    public void setRegistroNuevoUsuario$(IRegistroNuevoUsuario RegistroNuevoUsuario$) {
        this.RegistroNuevoUsuario$ = RegistroNuevoUsuario$;
    }

    public void setRegistroPersonaFisica$(IRegistroPersonaFisica RegistroPersonaFisica$) {
        this.RegistroPersonaFisica$ = RegistroPersonaFisica$;
    }

    public void setLogIn$(ILogin LogIn$) {
        this.LogIn$ = LogIn$;
    }

    public void setRegistroEntidad(IRegistroEntidad registroEntidad) {
        this.RegistroEntidad$ = registroEntidad;
    }

    public void setBuscar(IBuscar buscar) {
        this.Buscar$ = buscar;
    }

    public void setBuscarEntidad$(IBusquedaEntidad buscarEntidad) {
        this.busquedaEntidad$ = buscarEntidad;
    }

    public void setBuscarPersona$(IBusquedaPersona buscarPersona) {
        this.busquedaPersona$ = buscarPersona;
    }

    public void setBuscarTipoCategoria$(IBusquedaTipoCategoria buscarTipoCategoria) {
        this.busquedaTipoCategoria$ = buscarTipoCategoria;
    }

    public void setPaginaPersonaDenunciada(IPaginaPersonaDenunciada paginaPersonaDenunciada$) {
        this.paginaPersonaDenunciada$ = paginaPersonaDenunciada$;

    }

    public void setPaginaEntidadDenunciada(IPaginaEntidadDenunciada paginaEntidadDenunciada) {
        this.paginaEntidadDenunciada$ = paginaEntidadDenunciada;
    }

    public void setTerminosyCondiciones(ITerminosyCondiciones terminosyCondiciones) {
        this.terminosyCondiciones$ = terminosyCondiciones;
    }

    public boolean validarBusquedaPersona(String cedula, String provincia) {
        boolean personaValida = false;
        cedula = cedula.trim();
        if (esNumerico(cedula)) {
            if (cedula.length() == 9) {
                if (provincia.equals(Constantes.ALAJUELA)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_ALAJUELA, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.CARTAGO)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_CARTAGO, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.GUANACASTE)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_GUANACASTE, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.HEREDIA)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_HEREDIA, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.LIMON)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_LIMON, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.PUNTARENAS)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_PUNTARENAS, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.SAN_JOSE)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_SAN_JOSE, cedula);
                    validarBusquedaPorCedula(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else {
                    RegistroNuevoUsuario$.mostrarMensajeError("Favor sólo digitar números", "FUNES-TEC");
                }
            } else {
                RegistroNuevoUsuario$.mostrarMensajeError("Favor sólo digitar nueve dígitos", "FUNES-TEC");
            }
        } else {
            //if ()
            RegistroNuevoUsuario$.mostrarMensajeError("Favor sólo digitar números", "FUNES-TEC");
        }
        return personaValida;
    }

    private void validarBusquedaPorCedula(String resultdo) {
        if (resultdo.equals(Constantes.NO_ENCONTRADO)) {
            RegistroNuevoUsuario$.mostrarMensajeError(Constantes.PERSONA_NO_ENCONTRADA, Constantes.TITULO_APLICACION);
        } else {
            System.out.println("USUARIO ENCONTRADO");
            String cedula = resultdo.substring(0, 9);
            String sexo = resultdo.substring(17, 18);
            String nombre = resultdo.substring(34, 64);
            String primerApellido = resultdo.substring(65, 90);
            String segundoApellido = resultdo.substring(92, 116);

            System.out.println("#" + cedula + "#");
            System.out.println("Sexo:" + sexo);

            RegistroNuevoUsuario$.setBusquedaExitosa(true);
            RegistroNuevoUsuario$.setCedula(cedula);
            RegistroNuevoUsuario$.setSexo(sexo);
            RegistroNuevoUsuario$.setNombre(nombre);
            RegistroNuevoUsuario$.setPrimerApellido(primerApellido);
            RegistroNuevoUsuario$.setSegundoApellido(segundoApellido);

        }
    }

    public boolean validarBusquedaPersonaDenunciada(String cedula, String provincia) {
        limpiarPantallaRegistroPersona();
        boolean personaValida = false;
        cedula = cedula.trim();
        if (esNumerico(cedula)) {
            if (cedula.length() == 9) {
                if (provincia.equals(Constantes.ALAJUELA)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_ALAJUELA, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.CARTAGO)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_CARTAGO, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.GUANACASTE)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_GUANACASTE, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.HEREDIA)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_HEREDIA, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.LIMON)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_LIMON, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.PUNTARENAS)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_PUNTARENAS, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else if (provincia.equals(Constantes.SAN_JOSE)) {
                    String resultadoBusquedaPorCedula = AdministradorArchivos$.buscarPorCedula(Constantes.RUTA_PADRON_SAN_JOSE, cedula);
                    validarBusquedaPorCedulaDenunciado(resultadoBusquedaPorCedula);
                    personaValida = true;
                } else {
                    RegistroPersonaFisica$.mostrarMensajeError("Favor sólo digitar números", "FUNES-TEC");
                }
            } else {
                RegistroPersonaFisica$.mostrarMensajeError("Favor sólo digitar nueve dígitos", "FUNES-TEC");
            }
        } else {
            //if ()
            RegistroPersonaFisica$.mostrarMensajeError("Favor sólo digitar números", "FUNES-TEC");
        }
        return personaValida;
    }

    private void validarBusquedaPorCedulaDenunciado(String resultdo) {
        if (resultdo.equals(Constantes.NO_ENCONTRADO)) {
            RegistroPersonaFisica$.mostrarMensajeError(Constantes.PERSONA_NO_ENCONTRADA, Constantes.TITULO_APLICACION);
        } else {
            System.out.println("USUARIO ENCONTRADO");
            String cedula = resultdo.substring(0, 9);
            String sexo = resultdo.substring(17, 18);
            String nombre = resultdo.substring(34, 64);
            String primerApellido = resultdo.substring(65, 90);
            String segundoApellido = resultdo.substring(92, 116);

            System.out.println("#" + cedula + "#");
            System.out.println("SEXO:  " + sexo);

            RegistroPersonaFisica$.setBusquedaExitosa(true);
            RegistroPersonaFisica$.setCedula(cedula);
            RegistroPersonaFisica$.setSexo(sexo);
            RegistroPersonaFisica$.setNombre(nombre);
            RegistroPersonaFisica$.setPrimerApellido(primerApellido);
            RegistroPersonaFisica$.setSegundoApellido(segundoApellido);

        }
    }

    public void solicitudRegistrarNuevoUsuario() {
        RegistroNuevoUsuario$.mostrarVentana();
    }

    public void solicitudDenunciarPersona() {
        RegistroPersonaFisica$.mostrarVentana();
    }

    public void solicitudDenunciarEntidad() {
        RegistroEntidad$.mostrarVentana();
    }

    public void solicitudBuscar() {
        Buscar$.mostrarVentana();
    }

    public void solicitudBuscarPersona() {
        busquedaPersona$.mostrarVentana();

    }

    public void solicitudBuscarEntidad() {
        busquedaEntidad$.mostrarVentana();
    }

    public void solicitudBuscarTipoCategoria() {
        busquedaTipoCategoria$.mostrarVentana();
    }

    public void validadInformacionRestante() {

    }

    public void ValidarCuentadeUsuario(String nickname, String contrasenna) {
        if (AdministradorPrincipal$.getNicknames().containsKey(nickname)) {
            System.out.println(nickname + " Si esta registrad@!");
            String valor = AdministradorPrincipal$.getNicknames().get(nickname);
            System.out.println("Su contrasenna es: " + valor);
            if (valor.equals(contrasenna)) {
                System.out.println("Bienvenido!!!");
                setUsuarioEnCurso(nickname);
                perfilUsuario$.mostrarVentana();
                LogIn$.ocultarVentana();
            } else {
                LogIn$.mostrarMensajeError("La contraseña no es válida. Por favor inténtalo de nuevo.", "ERROR");
            }
        } else {
            LogIn$.mostrarMensajeError("Al parecer no estás registrado. Por favor registrese dando clic en SignUp.", nickname);
        }
    }

    private boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Registraar nuevo Usuario
    public boolean RegistrarNuevoUsuario(String cedulaUsuario, String provinciaUsuario) {
        boolean registroExitoso = false;
        ArrayList<String> pDatosPersonales = new ArrayList<>();

        String provincia = RegistroNuevoUsuario$.getProvincia();
        String cedula = RegistroNuevoUsuario$.getCedula();
        String nombre = RegistroNuevoUsuario$.getNombre();
        String primerApellido = RegistroNuevoUsuario$.getPrimerApellido();
        String segundoApellido = RegistroNuevoUsuario$.getSegundoApellido();
        String genero = RegistroNuevoUsuario$.getGenero();
        String dia = RegistroNuevoUsuario$.getDiaNacimiento();
        String mes = RegistroNuevoUsuario$.getMesNacimiento();
        String anno = RegistroNuevoUsuario$.getAnnoNacimiento();
        String edad = RegistroNuevoUsuario$.getEdad();
        String lugarDeTrabajo = RegistroNuevoUsuario$.getLugarDeTrabajo();
        String cargo = RegistroNuevoUsuario$.getCargo();
        String nickname = RegistroNuevoUsuario$.getNickname();
        String contrasenna = RegistroNuevoUsuario$.getContrasenna();
        String privado = RegistroNuevoUsuario$.getPrivado();

        if ((provincia.equals("")) || (cedula.equals("")) || (nombre.equals("")) || (primerApellido.equals(""))
                || (segundoApellido.equals("")) || (genero.equals("")) || (dia.equals("")) || (mes.equals(""))
                || (anno.equals("")) || (edad.equals("")) || (lugarDeTrabajo.equals("")) || (cargo.equals(""))
                || (nickname.equals("")) || (contrasenna.equals("")) || (privado.equals(""))) {

            RegistroNuevoUsuario$.mostrarMensajeError("Por favor, llene todos los datos", Constantes.TITULO_APLICACION);
            return registroExitoso;
        } else {
            pDatosPersonales.add(0, provincia);
            pDatosPersonales.add(1, cedula);
            pDatosPersonales.add(2, nombre);
            pDatosPersonales.add(3, primerApellido);
            pDatosPersonales.add(4, segundoApellido);
            pDatosPersonales.add(5, genero);
            pDatosPersonales.add(6, dia);
            pDatosPersonales.add(7, mes);
            pDatosPersonales.add(8, anno);
            pDatosPersonales.add(9, edad);
            pDatosPersonales.add(10, lugarDeTrabajo);
            pDatosPersonales.add(11, cargo);
            pDatosPersonales.add(12, nickname);
            pDatosPersonales.add(13, contrasenna);
            pDatosPersonales.add(14, privado);
            AdministradorPrincipal$.registrarNuevoUsuario(pDatosPersonales);
            registroExitoso = true;
            System.out.println("El registro del nuevo usuario fue: Exitoso");
            System.out.println("GENERO: " + pDatosPersonales.get(5));
            RegistroNuevoUsuario$.ocultarVentana();
        }
        return registroExitoso;
    }

    public boolean registrarNuevaPersonaDenunciada(String cedula, String provincia, ArrayList<String> cat) {

        boolean registroExitoso = false;
        ArrayList<String> pDatosPersonalesDenunciado = new ArrayList<>();

        String provinciaDenunciado = RegistroPersonaFisica$.getProvincia();
        String cedulaDenunciado = RegistroPersonaFisica$.getCedula();
        String nombreDenunciado = RegistroPersonaFisica$.getNombre();
        String primerApellidoDenunciado = RegistroPersonaFisica$.getPrimerApellido();
        String segundoApellidoDenunciado = RegistroPersonaFisica$.getSegundoApellido();
        String generoDenunciado = RegistroPersonaFisica$.getGenero();
        String lugarTrabajoDenunciado = RegistroPersonaFisica$.getLugarDeTrabajo();
        String cargoDenunciado = RegistroPersonaFisica$.getCargo();

        if (((cedulaDenunciado.equals("")) || (nombreDenunciado.equals("")) || (primerApellidoDenunciado.equals(""))
                || (segundoApellidoDenunciado.equals("")) || (generoDenunciado.equals(""))
                || (lugarTrabajoDenunciado.equals("")) || (cargoDenunciado.equals("")))) {

            RegistroPersonaFisica$.mostrarMensajeError("Por favor, llene todos los datos", Constantes.TITULO_APLICACION);
            return registroExitoso;
        } else if (RegistroPersonaFisica$.getCategoriasEscogidas().size() == 0) {
            RegistroPersonaFisica$.mostrarMensajeError("Por favor, llene todos los datos", Constantes.TITULO_APLICACION);
            return registroExitoso;
        } else {
            pDatosPersonalesDenunciado.add(0, provinciaDenunciado);
            pDatosPersonalesDenunciado.add(1, cedulaDenunciado);
            pDatosPersonalesDenunciado.add(2, nombreDenunciado);
            pDatosPersonalesDenunciado.add(3, primerApellidoDenunciado);
            pDatosPersonalesDenunciado.add(4, segundoApellidoDenunciado);
            pDatosPersonalesDenunciado.add(5, generoDenunciado);
            pDatosPersonalesDenunciado.add(6, lugarTrabajoDenunciado);
            pDatosPersonalesDenunciado.add(7, cargoDenunciado);

            AdministradorPrincipal$.registrarPersona(pDatosPersonalesDenunciado, cat);
            registroExitoso = true;
            System.out.println("El registro de persona fue: Exitoso");
        }

        return registroExitoso;

    }

    public boolean registrarNuevaEntidad(String entidad, String cedJuridica, String pais, String provincia, String canton, String distrito, String barrio, ArrayList<String> cat) {

        ArrayList<String> datosEntidad = new ArrayList<String>();
   
            System.out.println("VOY POR REGISTAR ENTIDAD EN EL ADMINISTRADOR PRINCIPAL");
            datosEntidad.add(0, entidad);
            datosEntidad.add(1, cedJuridica);
            datosEntidad.add(2, pais);
            datosEntidad.add(3, provincia);
            datosEntidad.add(4, canton);
            datosEntidad.add(5, distrito);
            datosEntidad.add(6, barrio);
            AdministradorPrincipal$.registrarEntidad(datosEntidad, cat);
            System.out.println("El registro de Entidad fue: Exitoso");
      return true;
    }

    public void ActualizarPerfilUsuarioLogueado(String nickname) {
        for (int usuario = 0; usuario < AdministradorPrincipal$.getListaUsuarios().size(); usuario++) {
            if (AdministradorPrincipal$.getListaUsuarios().get(usuario).getNickname().equals(nickname)) {
                String contrasenna = AdministradorPrincipal$.getNicknames().get(nickname);
                String nombreCompleto = AdministradorPrincipal$.getListaUsuarios().get(usuario).getNombre().trim() + " "
                        + AdministradorPrincipal$.getListaUsuarios().get(usuario).getPrimerApellido().trim() + " "
                        + AdministradorPrincipal$.getListaUsuarios().get(usuario).getSegundoApellido().trim();
                String cedula = AdministradorPrincipal$.getListaUsuarios().get(usuario).getCedula();
                String genero = AdministradorPrincipal$.getListaUsuarios().get(usuario).getGenero();
                String annoNacimiento = String.valueOf(AdministradorPrincipal$.getListaUsuarios().get(usuario).
                        getAnoNacimiento());
                String diaNacimiento = String.valueOf(AdministradorPrincipal$.getListaUsuarios().get(usuario).
                        getDiaNacimiento());
                String mesNacimiento = String.valueOf(AdministradorPrincipal$.getListaUsuarios().get(usuario).
                        getMesNacimiento());
                String edad = String.valueOf(AdministradorPrincipal$.getListaUsuarios().get(usuario).getEdad());
                String lugarDeTrabajo = AdministradorPrincipal$.getListaUsuarios().get(usuario).getInstitucionLaboral();
                String cargo = AdministradorPrincipal$.getListaUsuarios().get(usuario).getCargo();

                String privado;
                if (AdministradorPrincipal$.getListaUsuarios().get(usuario).isPrivado()) {
                    privado = "Privado";
                } else {
                    privado = "Publico";
                }

                System.out.println("El nombre del usuario con ese nickname es: " + nombreCompleto);
                System.out.println("GENERO SELECCIONADO: " + genero);
                System.out.println("dia de nacimiento seleccionado: " + diaNacimiento);

                perfilUsuario$.setNicknameLabel("¡Bienvenido " + nickname + "!");
                perfilUsuario$.setNickname(nickname);
                perfilUsuario$.setContrasenna(contrasenna);
                perfilUsuario$.setNombreCompleto(nombreCompleto);
                perfilUsuario$.setCedula(cedula);
                perfilUsuario$.setGenero(genero);
                perfilUsuario$.setAnnoNacimiento(annoNacimiento);
                perfilUsuario$.setEdad(edad);
                perfilUsuario$.setLugarDeTrabajo(lugarDeTrabajo);
                perfilUsuario$.setCargo(cargo);
                perfilUsuario$.setPrivado(privado);
                perfilUsuario$.setDiaNacimiento(diaNacimiento);
                perfilUsuario$.setMesNacimiento(mesNacimiento);

            }
        }
    }

    public String CalcularEdad(String dia, String mes, String anno) {
        int edad = 0;

        if (anno.equals("")) {
            RegistroNuevoUsuario$.mostrarMensajeError("Por favor, indique el año de nacimiento", Constantes.TITULO_APLICACION);
        } else {
            // Calcula la fecha actual del sistema
            Calendar fechaActual = Calendar.getInstance();
            int diaActual = fechaActual.get(Calendar.DATE);
            int mesActual = fechaActual.get(Calendar.MONTH);
            int anoActual = fechaActual.get(Calendar.YEAR);

            // Calcula la edad de la persona
            edad = anoActual - toNumber(anno);
            if (toNumber(mes) > mesActual) {
                edad -= 1;
            }
            if (toNumber(mes) == mesActual) {
                if (toNumber(dia) > diaActual) {
                    edad -= 1;
                }
            }

        }
        return String.valueOf(edad);
    }

    public void setEdadNuevoUsuario(String dia, String mes, String anno) {
        String edad = CalcularEdad(dia, mes, anno);
        RegistroNuevoUsuario$.setEdad(String.valueOf(edad));
    }

    public boolean verificarExitenciaNuevoUsuario(String cedula, String nickname) {
        boolean existe = false;
        for (int usuario = 0; usuario < AdministradorPrincipal$.getListaUsuarios().size(); usuario++) {
            Usuario usua = AdministradorPrincipal$.getListaUsuarios().get(usuario);
            if (usua.getCedula().equals(cedula)) {
                existe = true;
            } else if (AdministradorPrincipal$.getNicknames().containsKey(nickname)) {
                existe = true;
            }

        }
        return existe;
    }

    public boolean verificarExitenciaNuevoPersona(String cedula) {
        boolean existe = false;
        for (int persona = 0; persona < AdministradorPrincipal$.getListaPersonasFisicas().size(); persona++) {
            PersonaDenunciada pers = AdministradorPrincipal$.getListaPersonasFisicas().get(persona);
            if (pers.getCedula().equals(cedula)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean verificarExitenciaNuevaEntidad(String cedulaJuridica) {
        boolean existe = false;
        for (int entidad = 0; entidad < AdministradorPrincipal$.getListaEntidades().size(); entidad++) {
            EntidadDenunciada ent = AdministradorPrincipal$.getListaEntidades().get(entidad);
            if (ent.getCedulaJuridica().equals(cedulaJuridica)) {
                existe = true;
            }
        }
        return existe;
    }

    public void limpiarPantallaRegistroNuevoUsuario() {
        RegistroNuevoUsuario$.setAnnoNacimiento();
        RegistroNuevoUsuario$.setCargo();
        RegistroNuevoUsuario$.setContrasenna();
        RegistroNuevoUsuario$.setLugarDeTrabajo();
        RegistroNuevoUsuario$.setNickname();
        RegistroNuevoUsuario$.setNombre("");
        RegistroNuevoUsuario$.setCedula("");
        RegistroNuevoUsuario$.setEdad("");
        RegistroNuevoUsuario$.setPrimerApellido("");
        RegistroNuevoUsuario$.setSegundoApellido("");
    }

    public void limpiarPantallaLogIn() {
        LogIn$.setNickname();
        LogIn$.setContrasenna();
    }

    public void limpiarPantallaRegistroEntidad() {
        RegistroEntidad$.setNombre();
        RegistroEntidad$.setCedulaJuridica();
        RegistroEntidad$.setBarrio();
        RegistroEntidad$.setCanton();
        RegistroEntidad$.setCategoriaRegistrada();
        RegistroEntidad$.setPais();
        RegistroEntidad$.setDistrito();
        RegistroEntidad$.setCategoriasEscogidas();
    }

    public void limpiarPantallaRegistroPersona() {
        RegistroPersonaFisica$.setCedula("");
        RegistroPersonaFisica$.setNombre("");
        RegistroPersonaFisica$.setPrimerApellido("");
        RegistroPersonaFisica$.setSegundoApellido("");
        RegistroPersonaFisica$.setLugarDeTrabajo();
        RegistroPersonaFisica$.setCargo();
        RegistroPersonaFisica$.setCategoriasEscogidas();
    }
    
    public void limpiarPantallaBuscarEntidad(){
        busquedaEntidad$.setCedulaJuridica();
        busquedaEntidad$.setNombreEntidad();
    }
    
    public void limpiarPantallaBuscarPersona(){
        busquedaPersona$.setCedula();
        busquedaPersona$.setNombre();
        busquedaPersona$.setPrimerApellido();
        busquedaPersona$.setSegundoApellido();
    }
    public void limpiarPantallaBuscarCategoria(){
        busquedaTipoCategoria$.setCategoria();
    }

    public void setRegistroPaginaPersonaDenunciada(String nombre, String cedula,
            String institucionLaboral, String cargo) {
        paginaPersonaDenunciada$.setNombrePersonaDenunciada(nombre);
        paginaPersonaDenunciada$.setCedulaPersonaDenunciada(cedula);
        paginaPersonaDenunciada$.setLugarDondeLaboraPersonaDenunciada(institucionLaboral);
        paginaPersonaDenunciada$.setCargoPersonaDenunciada(cargo);
        paginaPersonaDenunciada$.mostrarVentana();
        
    }
    
    public void setRegistroPaginaEntidadDenunciada(String nombre, String cedula){
       paginaEntidadDenunciada$.setNombreEntidadDenunciada(nombre);
       paginaEntidadDenunciada$.setCedulaJuridicaEntidadDenunciada(cedula);
       paginaEntidadDenunciada$.mostrarVentana();
       paginaEntidadDenunciada$.setIntroCalificacion("");
       paginaEntidadDenunciada$.setCalifiacionEntidadDenunciada("");
    }
    
    public void setearCalificacionPersonaDenunciada(String calificacion, String nombre, String razon, String cedula){
       
        paginaPersonaDenunciada$.setIntroCalificacion("Su calificación para " + nombre);
        paginaPersonaDenunciada$.setCalifiacionPersonaDenunciada(calificacion);
        
        // Encuentra a la persona denunciada en la lista de denuniciados y la califica.
        
        for (int personaDenunciada = 0; personaDenunciada < AdministradorPrincipal$.getListaPersonasFisicas().size();
                    personaDenunciada ++){
            ArrayList<PersonaDenunciada> Denunciados = AdministradorPrincipal$.getListaPersonasFisicas();
            PersonaDenunciada Persona$ = Denunciados.get(personaDenunciada);
            if (Persona$.getCedula().equals(cedula)){
                           
                Calificacion calificacion$ = new Calificacion();
                calificacion$.setCalificacion(toNumber(calificacion));
                calificacion$.setComentario(razon);
                calificacion$.setNickname(usuarioEnCurso);
                Persona$.getCalificacion().add(calificacion$);
                System.out.println( usuarioEnCurso+" ha calificado satisfactoriamente a "
                        + Persona$.getNombre() + " con una calificacion"
                                + "de " + calificacion$.getCalificacion() + "y con el comentario: " + 
                                        calificacion$.getComentario());
            }
        } 
    }
    
    public void setearCalificacionEntidadDenunciada(String calificacion,String nombre,String  razon,String cedula){
         paginaEntidadDenunciada$.setIntroCalificacion("Su calificación para " + nombre);
         paginaEntidadDenunciada$.setCalifiacionEntidadDenunciada(calificacion);
         
          // Encuentra a la entidad denunciada en la lista de entidades denuniciadas y la califica.
         
         for (int entidadDenunciada = 0; entidadDenunciada < AdministradorPrincipal$.getListaEntidades().size();
                    entidadDenunciada ++){
            ArrayList<EntidadDenunciada> Denunciados = AdministradorPrincipal$.getListaEntidades();
            EntidadDenunciada Entidad$ = Denunciados.get(entidadDenunciada);
            if (Entidad$.getCedulaJuridica().equals(cedula)){
                           
                Calificacion calificacion$ = new Calificacion();
                
                calificacion$.setCalificacion(toNumber(calificacion));
                calificacion$.setComentario(razon);
                calificacion$.setNickname(usuarioEnCurso);
                Entidad$.getCalificacion().add(calificacion$);
                System.out.println( usuarioEnCurso+" ha calificado satisfactoriamente a "
                        + Entidad$.getNombre() + " con una calificacion"
                                + "de " + calificacion$.getCalificacion() + "y con el comentario: " + 
                                        calificacion$.getComentario());
            }
        } 
         
    }
    
    public boolean verificarSiUsuarioYaCalificoPersonaDenunciada(String cedula){
       boolean haCalificado = false;
       PersonaDenunciada persona$ = null;
       for (int p = 0; p < AdministradorPrincipal$.getListaPersonasFisicas().size(); p ++){
           if (AdministradorPrincipal$.getListaPersonasFisicas().get(p).getCedula().equals(cedula)){
               persona$ = AdministradorPrincipal$.getListaPersonasFisicas().get(p);
           }
       }
       
        for(int i = 0; i < persona$.getCalificacion().size(); i ++){
                    if (persona$.getCalificacion().get(i).getNickname().equals(usuarioEnCurso)){                
                        haCalificado = true;
                    }
                    else {haCalificado = false;}  
        }
       
       return haCalificado;
    }
    
     public boolean verificarSiUsuarioYaCalificoEntidadDenunciada(String cedula){
       boolean haCalificado = false;
       EntidadDenunciada entidadDenunciada$ = null;
       for (int p = 0; p < AdministradorPrincipal$.getListaEntidades().size(); p ++){
           if (AdministradorPrincipal$.getListaEntidades().get(p).getCedulaJuridica().equals(cedula)){
               entidadDenunciada$ = AdministradorPrincipal$.getListaEntidades().get(p);
           }
       }
       
        for(int i = 0; i < entidadDenunciada$.getCalificacion().size(); i ++){
                    if (entidadDenunciada$.getCalificacion().get(i).getNickname().equals(usuarioEnCurso)){                
                        haCalificado = true;
                    }
                    else {haCalificado = false;}  
        }
       
       return haCalificado;
    }

    public void setRegistroEntidadDenunciada(String nombre, String cedJuridica,
            String provincia) {
        //paginaEntidadDenunciada$.setNombrePersonaDenunciada(nombre);
        //paginaPersonaDenunciada$.setCedulaPersonaDenunciada(cedula);
        //paginaPersonaDenunciada$.setLugarDondeLaboraPersonaDenunciada(institucionLaboral);
        //paginaPersonaDenunciada$.setCargoPersonaDenunciada(cargo);
        paginaEntidadDenunciada$.mostrarVentana();
        paginaEntidadDenunciada$.mostrarMensajeError("MOSTRANDO VENTANA ENTIDAD", "FUNATEC");
    }

    public int toNumber(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            return 1;
        }
    }

    public void salirDeTerminosyCondiciones() {
        terminosyCondiciones$.ocultarVentana();
    }

    public void salirDeRegistrarPersonaFisica() {
        RegistroPersonaFisica$.ocultarVentana();
    }

    public void salirDeRegistroEntidad() {
        RegistroEntidad$.ocultarVentana();
    }

    public void salirDeBuscar() {
        Buscar$.ocultarVentana();
    }

    public void salirDeBuscarEntidad() {
        busquedaEntidad$.ocultarVentana();
    }

    public void salirDeBusquedaPersona() {
        busquedaPersona$.ocultarVentana();
    }

    public void salirDeBusquedaTipoCategoria() {
        busquedaTipoCategoria$.ocultarVentana();
    }

    public void salirDePerfilUsuario() {
        perfilUsuario$.ocultarVentana();
        limpiarPantallaLogIn();
        LogIn$.mostrarVentana();

    }
    public void salirDePersonaDenunciada(){
        paginaPersonaDenunciada$.setIntroCalificacion("");
        paginaPersonaDenunciada$.setCalifiacionPersonaDenunciada("");
    }   

    public void llamarTerminosyCondiciones() {
        terminosyCondiciones$.mostrarVentana();
    }

    public void editarNicknameyContrasennaUsuario() {

    }

    public void habilitarContrasennaPerfilUsuario() {
        System.out.println("HABILITANDO  :MODELO");
        perfilUsuario$.habilitarContrasenna();
    }

    public void deshabilitarContrasennaPerfilUsuario() {
        perfilUsuario$.deshabilitarContrasenna();
    }

    public void habilitarInformacionPersonalUsuario() {
        perfilUsuario$.habilitarFechaDeNacimiento();
        perfilUsuario$.habilitarLugarDeTrabajo();
        perfilUsuario$.habilitarCargo();
        perfilUsuario$.habilitarPrivado();
    }

    public void deshabilitarInformacionPersonalUsuario() {
        perfilUsuario$.deshabilitarFechaDeNacimiento();
        perfilUsuario$.deshabilitarLugarDeTrabajo();
        perfilUsuario$.deshabilitarCargo();
        perfilUsuario$.deshabilitarPrivado();
    }

    public void actualizarDatos() {
        String cedula = perfilUsuario$.getCedula();
        String nickname = perfilUsuario$.getNickname();
        String contrasenna = perfilUsuario$.getContrasenna();
        String diaNacimiento = perfilUsuario$.getDiaDeNacimiento();
        String mesNacimiento = perfilUsuario$.getMesNacimiento();
        String annoNacimiento = perfilUsuario$.getAnnoNacimiento();
        String lugarDeTrabajo = perfilUsuario$.getLugarDeTrabajo();
        String cargo = perfilUsuario$.getCargo();
        String privado = perfilUsuario$.getPrivado();

        String edad = CalcularEdad(diaNacimiento, mesNacimiento, annoNacimiento);

        for (int usuario = 0; usuario < AdministradorPrincipal$.getListaUsuarios().size(); usuario++) {
            if (AdministradorPrincipal$.getListaUsuarios().get(usuario).getCedula().equals(cedula)) {
                perfilUsuario$.setEdad(edad);
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setContrasena(contrasenna);
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setDiaNacimiento(toNumber(diaNacimiento));
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setMesNacimiento(toNumber(mesNacimiento));
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setAnoNacimiento(toNumber(annoNacimiento));
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setEdad(toNumber(edad));
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setInstitucionLaboral(lugarDeTrabajo);
                AdministradorPrincipal$.getListaUsuarios().get(usuario).setCargo(cargo);
                if (privado == "Privado") {
                    AdministradorPrincipal$.getListaUsuarios().get(usuario).setPrivado(true);
                } else if (privado == "Publico") {
                    AdministradorPrincipal$.getListaUsuarios().get(usuario).setPrivado(false);
                }

                if (AdministradorPrincipal$.getListaUsuarios().get(usuario).isPrivado()) {
                    System.out.println("La informacion de " + nickname + " es privada.");
                } else if (!(AdministradorPrincipal$.getListaUsuarios().get(usuario).isPrivado())) {
                    System.out.println("La informacion de " + nickname + " es publica.");
                }

                System.out.println("Se actualizó con éxito los datos ingresados.");
                JOptionPane.showMessageDialog(null,
                        "Se actualizó con éxito los datos ingresados.",
                        "Operación Exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        AdministradorPrincipal$.getNicknames().put(nickname, contrasenna);
        System.out.println("Se actualizó con éxito la contrasenna");
        System.out.println("La nueva combinación es: " + nickname + " = " + AdministradorPrincipal$.getNicknames().get(nickname));
    }

    public void solicitudBuscarTipoCategoria(String categoria, String tipoDenunciado) {
        if (tipoDenunciado.equals("Entidad")) {
            ArrayList<EntidadDenunciada> resultado = buscarTipoCategoriaEntidad(categoria);
            if (resultado.size() > 0) {
                System.out.println("ENCONTRADO");
                busquedaTipoCategoria$.mostrarResultadosEntidad(resultado);

            } else {
                busquedaTipoCategoria$.mostrarMensajeError("No hay resultados a mostrar", "FUNATEC");
            }
        } else if (tipoDenunciado.equals("Persona")) {
            ArrayList<PersonaDenunciada> resultado = buscarTipoCategoriaPersona(categoria);
            if (resultado.size() > 0) {
                System.out.println("ENCONTRADO");
                busquedaTipoCategoria$.mostrarResultadosPersona(resultado);
            } else {
                busquedaTipoCategoria$.mostrarMensajeError("No hay resultados a mostrar", "FUNATEC");
            }
        }
    }

    public ArrayList<PersonaDenunciada> buscarTipoCategoriaPersona(String categoria) {
        ArrayList<PersonaDenunciada> resultadoPersona = new ArrayList<PersonaDenunciada>();
        if (categoria.equals("")) {
            resultadoPersona = AdministradorPrincipal$.getListaPersonasFisicas();
            System.out.println("lista llena");
        } else {
            resultadoPersona = AdministradorBusquedas.buscarXTipoCategoriaPersona(categoria, AdministradorPrincipal$.getListaPersonasFisicas());
            System.out.println("lista llena");
        }

        for (int entidad = 0; entidad < resultadoPersona.size(); entidad++) {
            String nombre = resultadoPersona.get(entidad).getNombre();
            System.out.println(nombre);

        }
        return resultadoPersona;
    }

    public ArrayList<EntidadDenunciada> buscarTipoCategoriaEntidad(String categoria) {

        ArrayList<EntidadDenunciada> resultadoEntidades = new ArrayList<EntidadDenunciada>();
        if (categoria.equals("")) {
            resultadoEntidades = AdministradorPrincipal$.getListaEntidades();
            System.out.println("lista llena");
        } else {

            resultadoEntidades = AdministradorBusquedas.buscarXTipoCategoriaEntidad(categoria, AdministradorPrincipal$.getListaEntidades());
            System.out.println("lista llena");
        }

        for (int entidad = 0; entidad < resultadoEntidades.size(); entidad++) {
            String nombre = resultadoEntidades.get(entidad).getNombre();
            System.out.println(nombre);

        }
        return resultadoEntidades;
    }

    public void agregoCategoriaEntidad(String pCategoria) {
        boolean igual = false;

        ArrayList<String> categorias = new ArrayList<String>();
        categorias = RegistroEntidad$.getCategoriasEscogidas();

        for (int i = 0; i < categorias.size(); i++) {
            if ((pCategoria.toUpperCase()).equals((categorias.get(i)).toUpperCase())) {
                igual = true;
            }

        }

        if (igual == false) {
            RegistroEntidad$.setCategoria(pCategoria);

        } else {
            RegistroEntidad$.mostrarMensajeError("La categoría ya se encuentra registrada", "FUNATEC");
        }

    }

    public void registroCategoria(String pCategoriaRegistrada) {
        boolean igual = false;

        ArrayList<String> catg = new ArrayList<String>();
        catg = RegistroEntidad$.getCategoriasAEscoger();

        for (int i = 0; i < catg.size(); i++) {

            if ((pCategoriaRegistrada.toUpperCase()).equals((catg.get(i)).toUpperCase())) {
                igual = true;
            }
        }
        if (igual == false) {

            ArrayList<String> listaCategorias = new ArrayList<String>();
            RegistroEntidad$.nuevaCategoria(pCategoriaRegistrada);
            listaCategorias.add(pCategoriaRegistrada);

        } else {
            RegistroEntidad$.mostrarMensajeError("La categoría ya se encuentra registrada", "FUNATEC");

        }

    }

    public void agregoCategoriaPersona(String pCategoria) {

        boolean igual = false;

        ArrayList<String> cat = new ArrayList<String>();
        cat = RegistroPersonaFisica$.getCategoriasEscogidas();

        for (int i = 0; i < cat.size(); i++) {
            if ((pCategoria.toUpperCase()).equals((cat.get(i)).toUpperCase())) {
                igual = true;
            }

        }

        if (igual == false) {
            RegistroPersonaFisica$.setCategoriaEscogida(pCategoria);

        } else {
            RegistroPersonaFisica$.mostrarMensajeError("La categoría ya se encuentra registrada", "FUNATEC");
        }

    }

    public void registroCategoriaPersona(String pCategoriaRegistrada) {

        boolean igual = false;

        ArrayList<String> catg = new ArrayList<String>();
        catg = RegistroPersonaFisica$.getCategoriasAEscoger();

        for (int i = 0; i < catg.size(); i++) {

            if ((pCategoriaRegistrada.toUpperCase()).equals((catg.get(i)).toUpperCase())) {
                igual = true;
            }
        }
        if (igual == false) {

            RegistroPersonaFisica$.nuevaCategoria(pCategoriaRegistrada);

        } else {
            RegistroPersonaFisica$.mostrarMensajeError("La categoría ya se encuentra registrada", "FUNATEC");

        }

    }

    public ArrayList<EntidadDenunciada> solicitudBuscarEntidad(String categoria, String cedJuridica) {

        ArrayList<EntidadDenunciada> resultadoEntidades = new ArrayList<EntidadDenunciada>();

        if ((categoria.isEmpty()) && (cedJuridica.isEmpty())) {
            System.out.println("esta vacío");
            busquedaEntidad$.mostrarMensajeError("Debes proporcionar al menos un dato", "FUNATEC");
        } else if ((categoria.isEmpty()) && !(cedJuridica.isEmpty())) {
            resultadoEntidades = AdministradorBusquedas.buscarEntidadCedulaJ(cedJuridica, AdministradorPrincipal$.getListaEntidades());

        } else if (!(categoria.isEmpty()) && (cedJuridica.isEmpty())) {
            resultadoEntidades = AdministradorBusquedas.buscarEntidadNombre(categoria, AdministradorPrincipal$.getListaEntidades());

        } else if (!(categoria.isEmpty()) && !(cedJuridica.isEmpty())) {
            resultadoEntidades = AdministradorBusquedas.buscarEntidadNombreyCedula(categoria, cedJuridica, AdministradorPrincipal$.getListaEntidades());

        }

        for (int entidad = 0; entidad < resultadoEntidades.size(); entidad++) {
            String nombre = resultadoEntidades.get(entidad).getNombre();
            System.out.println(nombre);

        }
        return resultadoEntidades;
    }

    public ArrayList<PersonaDenunciada> solicitudBuscarPersona(String nombre, String cedula, String primerApellido, String segundoApellido) {

        ArrayList<PersonaDenunciada> resultadoPersonas = new ArrayList<PersonaDenunciada>();

        if (nombre.isEmpty() && cedula.isEmpty() && primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Está vacío");
            busquedaPersona$.mostrarMensajeError("Debes ingresar al menos un dato", "FUNATEC");

        } else if (!nombre.isEmpty() && cedula.isEmpty() && primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Busqueda x nombre");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaNombre(nombre, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (nombre.isEmpty() && !cedula.isEmpty() && primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Busqueda x cedula");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaCedula(cedula, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (nombre.isEmpty() && cedula.isEmpty() && !primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Busqueda x Primer Apellido");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaApellido1(primerApellido, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (nombre.isEmpty() && cedula.isEmpty() && primerApellido.isEmpty() && !segundoApellido.isEmpty()) {
            System.out.println("Busqueda x segundo apellido");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaApellido2(segundoApellido, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (!nombre.isEmpty() && !cedula.isEmpty() && primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Busqueda x nombre y cedula");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaNombreyCedula(nombre, cedula, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (!nombre.isEmpty() && cedula.isEmpty() && !primerApellido.isEmpty() && segundoApellido.isEmpty()) {
            System.out.println("Busqueda x snombre y primer apellido");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaNombreyApellido1(nombre, primerApellido, AdministradorPrincipal$.getListaPersonasFisicas());
        } else if (!nombre.isEmpty() && !cedula.isEmpty() && !primerApellido.isEmpty() && !segundoApellido.isEmpty()) {
            System.out.println("Busqueda x todo");
            resultadoPersonas = AdministradorBusquedas.buscarPersonaTotal(nombre, primerApellido, segundoApellido, cedula, AdministradorPrincipal$.getListaPersonasFisicas());

        }

        for (int entidad = 0; entidad < resultadoPersonas.size(); entidad++) {
            String nombreT = resultadoPersonas.get(entidad).getSegundoApellido();
            System.out.println(nombreT);

        }
        return resultadoPersonas;
    }

    public ArrayList<String> listaCategorias() {
        System.out.print(AdministradorPrincipal$.getListaCategorias());
        return AdministradorPrincipal$.getListaCategorias();
    }

    public void ValidarCuentadeUsuarioRemoto(String nickname, String contrasenna, ProtocoloComunicacion protocoloComunicacion) {
        if (nickname.isEmpty() | contrasenna.isEmpty()) {
            protocoloComunicacion.enviarMensaje("INFOR#LOGIN#INCOR#Ingrese todos los datos");
        } else {
            if (AdministradorPrincipal$.getNicknames().containsKey(nickname)) {
                System.out.println(nickname + " Si esta registrad@!");
                String valor = AdministradorPrincipal$.getNicknames().get(nickname);
                System.out.println("Su contrasenna es: " + valor);
                if (valor.equals(contrasenna)) {
                    System.out.println("Bienvenido!!!");
                    protocoloComunicacion.enviarMensaje("INFOR#LOGIN#CORREC#Bienvenido!!!");
                } else {
                    protocoloComunicacion.enviarMensaje("INFOR#LOGIN#INCOR#La contraseña no es válida. Por favor inténtalo de nuevo.");
                }
            } else {
                protocoloComunicacion.enviarMensaje("INFOR#LOGIN#INCOR#Al parecer no estás registrado");
            }
        }
    }

    public void setUsuarioEnCurso(String usuarioEnCurso) {
        this.usuarioEnCurso = usuarioEnCurso;
    }

    public String getUsuarioEnCurso() {
        return usuarioEnCurso;
    }
    
    public ArrayList<String> mostrarCategoriasRegistradas(){
        ArrayList<String> categoriasTotales = new ArrayList<String>();
        categoriasTotales = AdministradorPrincipal$.getListaCategorias();
        return categoriasTotales;
        
    }
    
    
}
