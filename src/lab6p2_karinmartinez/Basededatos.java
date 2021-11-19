
package lab6p2_karinmartinez;

import java.util.ArrayList;
import java.util.Date;

public class Basededatos {
    public ArrayList <Usuarios> usuarios = new ArrayList();
    public ArrayList <Pokemon> pokemones = new ArrayList();
    public ArrayList <Pokegrupo> pokegrupos = new ArrayList();
    public String ingresado;

    public Basededatos() {
    }

    public String getIngresado() {
        return ingresado;
    }

    public void setIngresado(String ingresado) {
        this.ingresado = ingresado;
    }
    
    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public ArrayList<Pokegrupo> getPokegrupos() {
        return pokegrupos;
    }

    public void setPokegrupos(ArrayList<Pokegrupo> pokegrupos) {
        this.pokegrupos = pokegrupos;
    }
    
    public void setUsuario(Usuarios usuario){ 
        this.usuarios.add(usuario); 
    }
    public void setPokegrupos(Pokegrupo pokegrupos){ 
        this.pokegrupos.add(pokegrupos); 
    }    
    @Override
    public String toString() {
        return "Basededatos{" + "usuarios=" + usuarios + ", pokemones=" + pokemones + ", pokegrupos=" + pokegrupos + '}';
    }
    
    
}
