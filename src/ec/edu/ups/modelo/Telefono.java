
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author santi
 */
public class Telefono {

    private String numero;
    private String operadora;
    private String tipo;

    public Telefono(String numero, String operadora, String tipo) {
        this.numero = numero;
        this.operadora = operadora;
        this.tipo = tipo;
    }

    public Telefono(String numero) {

        this.numero = numero;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", operadora=" + operadora + ", tipo=" + tipo + '}';
    }

}
