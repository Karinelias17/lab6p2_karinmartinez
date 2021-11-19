
package lab6p2_karinmartinez;

public class Fantasma extends Pokemon{
    private Fantasma fantasma = new Fantasma();

    public Fantasma() {
    }

    public Fantasma(String nombre, String velocidad, int daño, int vida) {
        super(nombre, velocidad, daño, vida);
    }

    public Fantasma getFantasma() {
        return fantasma;
    }

    public void setFantasma(Fantasma fantasma) {
        this.fantasma = fantasma;
    }

    @Override
    public String toString() {
        return "Fantasma{" + "fantasma=" + fantasma + '}';
    }

}
