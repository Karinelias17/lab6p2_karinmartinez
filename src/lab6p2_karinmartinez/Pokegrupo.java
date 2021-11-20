
package lab6p2_karinmartinez;

import java.util.ArrayList;
import java.util.Date;

public class Pokegrupo {
    public String nombre,lider,tipo;
    public ArrayList <Usuarios> miembros = new ArrayList();
    public Date creacion;

    public Pokegrupo() {
    }

    public Pokegrupo(String nombre, String lider, String tipo,ArrayList <Usuarios> miembros, Date creacion) {
        this.nombre = nombre;
        this.lider = lider;
        this.tipo = tipo;
        this.creacion = creacion;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Pokegrupo{" + "nombre=" + nombre + ", lider=" + lider + ", tipo=" + tipo + ", miembros=" + miembros + ", creacion=" + creacion + '}';
    }
    
    
}
