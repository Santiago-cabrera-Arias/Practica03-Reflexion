/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Persona;

/**
 *
 * @author santi
 */
public class ControladorPersona extends ControladorAbstracto<Persona> {

    @Override
    public boolean validar(Persona objeto) {

        if (objeto.getNombre().equals(objeto.getApellido())) {

            return false;

        } else {

            return true;

        }

    }

    @Override
    public int generarId() {

        List<Persona> lista = findAll();
        System.out.println(lista);
        int cont = 0;
        if (lista.size() > 0) {

            for (Persona persona : lista) {

                int cent = persona.getId();

                if (cent > cont) {

                    cont = cent;
                }
            }   
            return cont + 1;

        } else {

            return 1;

        }
    }
}
