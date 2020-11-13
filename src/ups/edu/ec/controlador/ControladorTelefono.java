/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Telefono;

/**
 *
 * @author santi
 */
public class ControladorTelefono extends ControladorAbstracto<Telefono> {

    @Override
    public boolean validar(Telefono objeto) {

        return true;

    }

    @Override
    public int generarId() {

        List<Telefono> lista = findAll();
        System.out.println(lista);

        int cont = 0;

        if (lista.size() > 0) {

            for (Telefono telefono : lista) {

                int cent = telefono.getId();

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
