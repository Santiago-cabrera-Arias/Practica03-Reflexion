/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.datosDeUsuario;

/**
 *
 * @author santi
 */
public class ControladorInicioSesion {

    private static ControladorInicioSesion instancia = new ControladorInicioSesion();

    private List lista = new ArrayList();

    private ControladorInicioSesion() {

    }

    public static ControladorInicioSesion getIntancia() {

        return instancia;

    }

    public boolean registrar(datosDeUsuario objeto) {

        if (objeto != null) {
            return lista.add(objeto);
        }

        return false;

    }

    public datosDeUsuario validacion(datosDeUsuario objeto1) {

        if (lista.size() > 0) {

            for (Object object : lista) {

                if (object.equals(objeto1)) {

                    return objeto1;

                }

            }

        }

        return null;

    }

}
