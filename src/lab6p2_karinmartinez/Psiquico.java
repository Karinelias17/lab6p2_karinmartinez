
package lab6p2_karinmartinez;

public class Psiquico extends Pokemon{
    public Psiquico psiquico = new Psiquico();

    public Psiquico() {
    }

    public Psiquico(String nombre, String velocidad, int daño, int vida) {
        super(nombre, velocidad, daño, vida);
    }

    public Psiquico getPsiquico() {
        return psiquico;
    }

    public void setPsiquico(Psiquico psiquico) {
        this.psiquico = psiquico;
    }

    @Override
    public String toString() {
        return "Psiquico{" + "psiquico=" + psiquico + '}';
    }
    
    
}
