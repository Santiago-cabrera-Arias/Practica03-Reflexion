
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 *
 * @author santi
 */
public class ControladorTelefono<T> {

    //private C objeto; Indicando que es un objeto generico. vamos a decir mas adelante que tipo de dato va
    //a ser
    private List<T> listaDeTelefono;
    
    public ControladorTelefono() {

        listaDeTelefono = new ArrayList();

    }

    public void create(T datos) {

        listaDeTelefono.add(datos);

    }

    public Optional<T> read(Predicate<T> t) {

        return this.listaDeTelefono.stream().filter(t).findFirst();
    }

    public boolean update(T ob, T obN) {

        int posicion = listaDeTelefono.indexOf(ob);
        listaDeTelefono.set(posicion, obN);
        return false;

    }

    public boolean delete(T ob) {

        if (listaDeTelefono.contains(ob)) {
            listaDeTelefono.remove(ob);
            return true;
        }

        return false;

    }

    public List<T> findAll() {

        return listaDeTelefono;
        
    }
    
    
   
    
}
