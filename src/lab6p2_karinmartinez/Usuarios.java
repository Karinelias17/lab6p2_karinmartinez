
package lab6p2_karinmartinez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    public String nombre,apellido, usuario, contraseña;
    public Date nacimiento = new Date();
    public Color color;
    public ArrayList <Pokedex> pokedex=new ArrayList();;
    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String usuario, String contraseña, Color color, Date nacimiento,ArrayList <Pokedex> pokedex) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.color = color;
        this.nacimiento = nacimiento;
        this.pokedex = pokedex;
    }

    public ArrayList<Pokedex> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokedex> pokedex) {
        this.pokedex = pokedex;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nacimiento=" + nacimiento + ", color=" + color + ", pokedex=" + pokedex + '}';
    }

}
