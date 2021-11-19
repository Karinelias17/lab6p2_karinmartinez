
package lab6p2_karinmartinez;

public class Venenoso extends Pokemon {
    public Venenoso venenoso = new Venenoso();

    public Venenoso() {
    }

    public Venenoso(String nombre, String velocidad, int daño, int vida) {
        super(nombre, velocidad, daño, vida);
    }

    public Venenoso getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Venenoso venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "Venenoso{" + "venenoso=" + venenoso + '}';
    }
    
    
}
