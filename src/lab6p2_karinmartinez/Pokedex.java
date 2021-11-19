
package lab6p2_karinmartinez;

import java.util.ArrayList;

class Pokedex {
    public double dañoprom;
    public ArrayList <Pokemon> pokemones = new ArrayList();

    public Pokedex() {
    }

    public Pokedex(double dañoprom, ArrayList<Pokemon> pokemones) {
        this.dañoprom = dañoprom;
        this.pokemones = pokemones;
    }

    public double getDañoprom() {
        return dañoprom;
    }

    public void setDañoprom(double dañoprom) {
        this.dañoprom = dañoprom;
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(ArrayList<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    @Override
    public String toString() {
        return "Pokedex{" + "da\u00f1oprom=" + dañoprom + ", pokemones=" + pokemones + '}';
    }
    
    
}
