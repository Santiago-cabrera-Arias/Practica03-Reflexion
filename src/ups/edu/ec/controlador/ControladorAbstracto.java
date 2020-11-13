/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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

    public T read(T objeto) {

        try {

            return lista.stream().filter(t -> t.equals(objeto)).findFirst().get();

        } catch (NullPointerException ex) {

            ex.printStackTrace();
            System.out.println("Error de lectura y escritura");
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

    public abstract int generarId();

    public static void imprimirCualquierLista(List listar) {

        for (Object obj : listar) {

            Method[] metodos = obj.getClass().getMethods();
            for (Method metodo : metodos) {

                if (metodo.getName().equals("getId")) {

                    try {
                        int cadena = (Integer) metodo.invoke(obj, null);
                        System.out.println(cadena);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        java.util.logging.Logger.getLogger(ControladorAbstracto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }

                }

            }

        }

    }

    public abstract boolean validar(T objeto);

    public List<T> findAll() {

        return lista;

    }

}
