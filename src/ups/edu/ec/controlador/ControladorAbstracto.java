/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author santi
 */
public abstract class ControladorAbstracto<T> {

    private List<T> lista;

    public ControladorAbstracto() {

        lista = new ArrayList();

    }

    public boolean create(T objeto) {

        if (validar(objeto)) {

            lista.add(objeto);

        }

        return false;

    }

    public T read(T comp) {

        if (validar(comp)) {

            return lista.stream().filter(objeto -> objeto.equals(comp)).findFirst().get();

        }
        return null;

    }

    public boolean update(T objeto) {

        int posicion = lista.indexOf(objeto);
        if (validar(objeto)) {
            lista.set(posicion, objeto);
            return true;
        }
        return false;
    }

    public boolean delete(T objeto) {

        if (lista.contains(objeto)) {
            lista.remove(objeto);
            return true;
        }
        return false;
    }

    public abstract boolean validar(T objeto);

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

}
