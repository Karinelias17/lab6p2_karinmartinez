
package lab6p2_karinmartinez;

public class Electrico extends Pokemon {
    public Electrico electrico = new Electrico();

    public Electrico() {
    }

    public Electrico(String nombre, String velocidad, int daño, int vida) {
        super(nombre, velocidad, daño, vida);
    }

    public Electrico getElectrico() {
        return electrico;
    }

    public void setElectrico(Electrico electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return "Electrico{" + "electrico=" + electrico + '}';
    }
    
    
}
