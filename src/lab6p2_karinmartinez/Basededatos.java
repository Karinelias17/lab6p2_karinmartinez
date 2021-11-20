
package lab6p2_karinmartinez;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Basededatos {
    public ArrayList <Usuarios> usuarios = new ArrayList();
    public ArrayList <Pokemon> pokemones = new ArrayList();
    public ArrayList <Pokegrupo> pokegrupos = new ArrayList();
    public ArrayList <Pokedex> pokedex=new ArrayList();
    public ArrayList <Usuarios> miembros=new ArrayList();
    public String ingresado;

    
    public Basededatos() {
        
    }
    public void pordefecto(){
        String nombre= "pikachu",velocidad="Media",apellido="Martinez",usuario="karin17",contraseña="elias";
        Color color= Color.BLUE;
        int daño =20, vida=100;

        pokemones.add(new Electrico(nombre,velocidad,daño,vida));
        
        nombre= "Mewtwo";
        velocidad="Alta";
        daño =40; 
        vida=190;

        pokemones.add(new Psiquico(nombre,velocidad,daño,vida));
        double dañoprom =55;
        pokedex.add(new Pokedex(dañoprom,pokemones));
        
        nombre = "Karin";
        Date nacimiento=new Date();
        
        usuarios.add(new Usuarios(nombre,apellido,usuario,contraseña,color,nacimiento,pokedex));
        pokedex.remove(0);
        ArrayList <Pokemon> pokedex2=new ArrayList();
        nombre= "Bulbasur";
        velocidad="Baja";
        daño =30; 
        vida=110;
        pokemones.add(new Psiquico(nombre,velocidad,daño,vida));
        pokedex2.add(new Venenoso(nombre,velocidad,daño,vida));
        
        nombre= "Haunter";
        velocidad="Media";
        daño =50; 
        vida=170;
        
        pokemones.add(new Psiquico(nombre,velocidad,daño,vida));
        pokedex2.add(new Venenoso(nombre,velocidad,daño,vida));
        dañoprom = 40;
        pokedex.add(new Pokedex(dañoprom,pokedex2));
        
        nombre = "Elias";
        apellido ="Valeriano";
        usuario = "elias17";
        contraseña = "karin";
        color = Color.RED;
        nacimiento=new Date();
        usuarios.add(new Usuarios(nombre,apellido,usuario,contraseña,color,nacimiento,pokedex));
        Date creacion =new Date();
        pokegrupos.add(new Pokegrupo("alpha","karin17","Novato",usuarios,creacion));
    }

    public ArrayList<Usuarios> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuarios> miembros) {
        this.miembros = miembros;
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
