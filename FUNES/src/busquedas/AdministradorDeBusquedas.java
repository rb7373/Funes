package busquedas;

import java.util.ArrayList;

import datos.*;

/**
 * Estudiantes: Rubén Abarca : 201017259 Dennisse Rojas : 2013001522 Treicy
 * Sánchez : 2013001517 Fecha de Creación de la Clase: 22/05/2014 Fecha de la
 * última modificación de la clase:29/05/2014 La clase posee los métodos
 * necesarios para realizar las búsquedas.
 */
public class AdministradorDeBusquedas {

    //Constructor de la clase
    public AdministradorDeBusquedas() {

    }

    //Supone que existe una lista general de categorias, ya que ellas tienen un atributo tipo
    // que indica si se trata de una entidad o persona
    /**
     * Categorías*
     */
    public ArrayList<Categoria> categorias(ArrayList<Categoria> listaCategorias) {
        return listaCategorias;

    }

    /**
     * Busqueda de Personas F�sicas *
     */
    /**
     * TOTAL*
     */
    public ArrayList<PersonaDenunciada> buscarPersonaTotal(String pNombre, String pApellido1, String pApellido2, String pCedula, ArrayList<PersonaDenunciada> pListaPersonas) {

        /**
         * Busca personas cuando se ha indicado su nombre, primer apellido,
         * segundo apellido y n�mero de c�dula Entradas: -Nombre de la persona -
         * Apellidos de la persona - C�dula -Lista de personas registradas
         * Salidas: -Lista con personas que posean nombre,apellido y c�dula
         * indicada. Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pNombre = pNombre.trim();
        pApellido1 = pApellido1.trim();
        pApellido2 = pApellido2.trim();
        pCedula = pCedula.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String nombrePersonaTemporal = personaTemporal.getNombre();
            String apellido1PersonaTemporal = personaTemporal.getPrimerApellido();
            String apellido2PersonaTemporal = personaTemporal.getSegundoApellido();
            String cedulaPersonaTemporal = personaTemporal.getCedula();

            if (nombrePersonaTemporal.toUpperCase().contains(pNombre.toUpperCase())
                    && apellido1PersonaTemporal.toUpperCase().contains(pApellido1.toUpperCase()) && apellido2PersonaTemporal.toUpperCase().contains(pApellido2.toUpperCase()) && cedulaPersonaTemporal.equals(pCedula)) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }

        return listaResultadoPersonas;

    }

    /**
     * POR NOMBRE*
     */
    public ArrayList<PersonaDenunciada> buscarPersonaNombre(String pNombre, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca persona cuando se ha indicado unicamente su nombre. Entradas:
         * -Nombre de la persona - Lista de personas registradas Salidas: -Lista
         * de personas con el nombre indicado Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pNombre = pNombre.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String nombrePersonaTemporal = personaTemporal.getNombre();
            if (nombrePersonaTemporal.toUpperCase().contains(pNombre.toUpperCase())) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }

        System.out.println("TOTAL");
        System.out.println(listaResultadoPersonas.size());

        return listaResultadoPersonas;
    }

    /**
     * POR APELLIDO 1 *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaApellido1(String pApellido1, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca persona cuando se ha indicado su primer apellido. Entradas:
         * -Apellido1 de la persona -Lista de personas registradas Salidas:
         * -Lista de personas con apellido1 indicado Restricciones:
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pApellido1 = pApellido1.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String Papellido1PersonaTemporal = personaTemporal.getPrimerApellido();

            if (Papellido1PersonaTemporal.toUpperCase().contains(pApellido1.toUpperCase())) {

                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * POR APELLIDO 2 *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaApellido2(String pApellido2, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca persona cuando se ha indicado su primer apellido. Entradas:
         * -Apellido1 de la persona -Lista de personas registradas Salidas:
         * -Lista de personas con apellido1 indicado Restricciones:
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pApellido2 = pApellido2.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String Papellido2PersonaTemporal = personaTemporal.getSegundoApellido();

            if (Papellido2PersonaTemporal.toUpperCase().contains(pApellido2.toUpperCase())) {

                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * POR APELLIDOS *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaApellidos(String pApellido, ArrayList<PersonaDenunciada> pListaPacientes) {
        /**
         * Busca persona cuando se ha indicado alguno de sus apellidos.
         * Entradas: -Apellido de la persona -Lista de personas registrados
         * Salidas: -Lista de personas con apellido indicado Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPacientes.size();
        PersonaDenunciada personaTemporal;

        pApellido = pApellido.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPacientes.get(i);
            String PapellidoPersonaTemporal = personaTemporal.getPrimerApellido();
            String SapellidoPersonaTemporal = personaTemporal.getSegundoApellido();
            if (PapellidoPersonaTemporal.toUpperCase().contains(pApellido.toUpperCase()) || SapellidoPersonaTemporal.toUpperCase().contains(pApellido.toUpperCase())) {

                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * POR CEDULA*
     */
    public ArrayList<PersonaDenunciada> buscarPersonaCedula(String pCedula, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca personas cuando se ha indicado su numero de cedula. Entradas:
         * -N�mero de c�dula de la persona -Lista de personas registradas
         * Salidas: -Lista con personas con el n�mero de c�dula indicado.
         * Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pCedula = pCedula.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String PcedulaPersonaTemporal = personaTemporal.getCedula();
            pCedula = pCedula.trim();
            if (PcedulaPersonaTemporal.contains(pCedula)) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * POR NOMBRE Y APELLIDO *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaNombreyApellido1(String pNombre, String pApellido1, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca personas cuando se ha indicado su nombre y primer apellido.
         * Entradas: -Nombre del paciente -Primer apellido del paciente -Lista
         * de personas registrados Salidas: -Lista de personas con nombre y
         * apellido indicado. Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pNombre = pNombre.trim();
        pApellido1 = pApellido1.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String nombrePersonaTemporal = personaTemporal.getNombre();
            String apellidoPersonaTemporal = personaTemporal.getPrimerApellido();

            if (nombrePersonaTemporal.toUpperCase().contains(pNombre.toUpperCase()) && apellidoPersonaTemporal.toUpperCase().contains(pApellido1.toUpperCase())) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * NOMBRE Y C�DULA *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaNombreyCedula(String pNombre, String pCedula, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca personas cuando se ha indicado su nombre y cedula. Entradas:
         * -Nombre de la persona - N�mero de c�dula de la persona -Lista de
         * personas registrados Salidas: -Lista con personas con nombre y c�dula
         * indicado. Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pNombre = pNombre.trim();
        pCedula = pCedula.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String nombrePersonaTemporal = personaTemporal.getNombre();
            String cedulaPersonaTemporal = personaTemporal.getCedula();

            if (nombrePersonaTemporal.toUpperCase().contains(pNombre.toUpperCase()) && cedulaPersonaTemporal.contains(pCedula)) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * APELLIDO1 Y C�DULA *
     */
    public ArrayList<PersonaDenunciada> buscarPersonaApellidoyCedula(String pApellido, String pCedula, ArrayList<PersonaDenunciada> pListaPersonas) {
        /**
         * Busca personas cuando se ha indicado su primer apellido y c�dula.
         * Entradas: -Primer apellido y c�dula - N�mero de c�dula -Lista de
         * personas registradas Salidas: - Lista de personas con apellido y
         * n�mero de c�dula indicado Restricciones:
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();
        int largoLista = pListaPersonas.size();
        PersonaDenunciada personaTemporal;

        pApellido = pApellido.trim();
        pCedula = pCedula.trim();

        for (int i = 0; i < largoLista; i++) {
            personaTemporal = pListaPersonas.get(i);
            String apellidoPersonaTemporal = personaTemporal.getPrimerApellido();
            String cedulaPersonaTemporal = personaTemporal.getCedula();

            if (apellidoPersonaTemporal.toUpperCase().contains(pApellido.toUpperCase()) && cedulaPersonaTemporal.contains(pCedula)) {
                listaResultadoPersonas.add(personaTemporal);
            }
        }
        return listaResultadoPersonas;
    }

    /**
     * BUSQUEDA DE PERSONAS JUR�DICAS (ENTIDADES) *
     */
    /**
     * POR NOMBRE*
     */
    public ArrayList<EntidadDenunciada> buscarEntidadNombre(String pNombre, ArrayList<EntidadDenunciada> pListaEntidades) {
        /**
         * Busca Entidades cuando se ha indicado unicamente su nombre. Entradas:
         * -Nombre de la entidad - Lista de entidades registradas Salidas:
         * -Lista de entidades con el nombre indicado Restricciones
         *
         */
        ArrayList<EntidadDenunciada> listaResultadoEntidades = new ArrayList<EntidadDenunciada>();
        int largoLista = pListaEntidades.size();
        EntidadDenunciada entidadTemporal;

        pNombre = pNombre.trim();

        for (int i = 0; i < largoLista; i++) {
            entidadTemporal = pListaEntidades.get(i);
            String nombreEntidadTemporal = entidadTemporal.getNombre();
            if (nombreEntidadTemporal.toUpperCase().contains(pNombre.toUpperCase())) {
                listaResultadoEntidades.add(entidadTemporal);
            }
        }

        return listaResultadoEntidades;
    }

    /**
     * POR C�DULA JUR�DICA *
     */
    public ArrayList<EntidadDenunciada> buscarEntidadCedulaJ(String pCedulaJuridica, ArrayList<EntidadDenunciada> pListaEntidades) {
        /**
         * Busca Entidades cuando se ha indicado unicamente su c�dula jur�dica.
         * Entradas: -C�dula jur�dica de la entidad - Lista de entidades
         * registradas Salidas: -Lista de entidades con c�dula indicada
         * Restricciones
         *
         */
        ArrayList<EntidadDenunciada> listaResultadoEntidades = new ArrayList<EntidadDenunciada>();
        int largoLista = pListaEntidades.size();
        EntidadDenunciada entidadTemporal;

        pCedulaJuridica = pCedulaJuridica.trim();

        for (int i = 0; i < largoLista; i++) {
            entidadTemporal = pListaEntidades.get(i);
            String cedulaEntidadTemporal = entidadTemporal.getCedulaJuridica();
            if (cedulaEntidadTemporal.toUpperCase().contains(pCedulaJuridica.toUpperCase())) {
                listaResultadoEntidades.add(entidadTemporal);
            }
        }

        return listaResultadoEntidades;
    }

    /**
     * TOTAL (C�DULA JUR�DICA Y NOMBRE) *
     */
    public ArrayList<EntidadDenunciada> buscarEntidadNombreyCedula(String pNombre, String pCedulaJuridica, ArrayList<EntidadDenunciada> pListaEntidades) {
        /**
         * Busca entidades cuando se ha indicado su nombre y c�dula jur�dica.
         * Entradas: -Nombre de la entidad - C�dula jur�dica de la entidad
         * -Lista de entidades registradas Salidas: -Lista con entidades con
         * nombre y c�dula jur�dica indicado. Restricciones
         *
         */
        ArrayList<EntidadDenunciada> listaResultadoEntidades = new ArrayList<EntidadDenunciada>();
        int largoLista = pListaEntidades.size();
        EntidadDenunciada entidadTemporal;

        pNombre = pNombre.trim();
        pCedulaJuridica = pCedulaJuridica.trim();

        for (int i = 0; i < largoLista; i++) {
            entidadTemporal = pListaEntidades.get(i);
            String nombreEntidadTemporal = entidadTemporal.getNombre();
            String cedulaEntidadTemporal = entidadTemporal.getCedulaJuridica();

            if (nombreEntidadTemporal.toUpperCase().contains(pNombre.toUpperCase()) && cedulaEntidadTemporal.equals(pCedulaJuridica)) {
                listaResultadoEntidades.add(entidadTemporal);
            }
        }
        return listaResultadoEntidades;
    }

    /**
     * BUSQUEDA POR TIPO DE CATEGORIA *
     */
    public ArrayList<PersonaDenunciada> buscarXTipoCategoriaPersona(String ptipoCategoria, ArrayList<PersonaDenunciada> pListaPersonas) {

        /**
         * Busca personas o entidades basado en el tipo de categor�a que estas
         * posean , * Entradas: -Tipo de Categor�a - Lista de personas
         * registradas -Lista de entidades registradas Salidas: -Lista personas
         * o entidades con ese tipo de categor�a Restricciones
         *
         */
        ArrayList<PersonaDenunciada> listaResultadoPersonas = new ArrayList<PersonaDenunciada>();

        int largoListaPersonas = pListaPersonas.size();

        PersonaDenunciada personaTemporal;

        ptipoCategoria = ptipoCategoria.trim();

        if (!ptipoCategoria.isEmpty()) {
            for (int i = 0; i < largoListaPersonas; i++) {
                personaTemporal = pListaPersonas.get(i);

                ArrayList<Categoria> listaCategorias = personaTemporal.getCategorias();

                int largoListaCategorias = listaCategorias.size();

                for (int j = 0; j < largoListaCategorias; j++) {

                    String tipotemporal = listaCategorias.get(j).getNombre();
                    if (ptipoCategoria.toUpperCase().contains(tipotemporal.toUpperCase())) {

                        listaResultadoPersonas.add(personaTemporal);

                    }

                }

            }

        }

        return listaResultadoPersonas;

    }

    public ArrayList<EntidadDenunciada> buscarXTipoCategoriaEntidad(String ptipoCategoria, ArrayList<EntidadDenunciada> pListaEntidades) {

        /**
         * Busca personas o entidades basado en el tipo de categor�a que estas
         * posean , * Entradas: -Tipo de Categor�a - Lista de personas
         * registradas -Lista de entidades registradas Salidas: -Lista personas
         * o entidades con ese tipo de categor�a Restricciones
         *
         */
        ArrayList<EntidadDenunciada> listaResultadoEntidades = new ArrayList<EntidadDenunciada>();
        int largoListaEntidades = pListaEntidades.size();

        EntidadDenunciada entidadTemporal;

        ptipoCategoria = ptipoCategoria.trim();

        if (!ptipoCategoria.isEmpty()) {

            for (int i = 0; i < largoListaEntidades; i++) {
                entidadTemporal = pListaEntidades.get(i);

                ArrayList<Categoria> listaCategorias = entidadTemporal.getCategorias();

                int largoListaCategorias = listaCategorias.size();

                for (int j = 0; j < largoListaCategorias; j++) {

                    String tipotemporal = listaCategorias.get(j).getNombre();
                    if (ptipoCategoria.toUpperCase().contains(tipotemporal.toUpperCase())) {

                        listaResultadoEntidades.add(entidadTemporal);

                    }

                }

            }

        }

        return listaResultadoEntidades;

    }

}
