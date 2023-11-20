package PokemonPOO;
class Pokemon {

    String nombre;
    String region;
    String tipo;
    int enumeracion;

    Pokemon(String nombre, String region, String tipo, int enumeracion) {
        this.nombre = nombre;
        this.region = region;
        this.tipo = tipo;
        this.enumeracion = enumeracion;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Region: " + this.region);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Enumeracion nacional: " + "#" + String.format("%03d", this.enumeracion));
    }

}

class PokeDex {

    Pokemon[] pokemons;
    
    PokeDex (Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    void mostrarIniciales() {
        for (Pokemon pokemon : this.pokemons) {
            pokemon.mostrarInfo();
            System.out.println();
        }
    }

}

public class PokemonPOO {
    public static void main(String[] args) {
        
        //Creamos los pokémon y les asignamos sus valores con el metodo
        
        /* Iniciales de Kanto */
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Kanto", "Planta/Veneno", 001);
        Pokemon charmander = new Pokemon("Charmander", "Kanto", "Fuego", 004);
        Pokemon squirtle = new Pokemon("Squirtle", "Kanto", "Agua", 007);
        
        /* Iniciales de Johto */
        Pokemon chikorita = new Pokemon("Chikorita", "Johto", "Planta", 152);
        Pokemon cyndaquil = new Pokemon("Cyndaquil", "Johto", "Fuego", 155);
        Pokemon totodile = new Pokemon("Totodile", "Johto", "Agua", 158);
        
        /* Iniciales de Hoenn */
        Pokemon treecko = new Pokemon("Treecko", "Hoenn", "Planta", 252);
        Pokemon torchic = new Pokemon("Torchic", "Hoenn", "Fuego", 255);
        Pokemon mudkip = new Pokemon("Mudkip", "Hoenn", "Agua", 258);
        
        /* Iniciales de Sinnoh */
        Pokemon turtwig = new Pokemon("Turtwig", "Sinnoh", "Planta", 387);
        Pokemon chimchar = new Pokemon("Chimchar", "Sinnoh", "Fuego", 390);
        Pokemon piplup = new Pokemon("Piplup", "Sinnoh", "Agua", 393);
        
        /* Inciales de Teselia */
        Pokemon snivy = new Pokemon("Snivy", "Teselia", "Planta", 495);
        Pokemon tepig = new Pokemon("Tepig", "Teselia", "Fuego", 498);
        Pokemon oshawott = new Pokemon("Oshawott", "Teselia", "Agua", 501);

        /* Inciales de Kalos */
        Pokemon chespin = new Pokemon("Chespin", "Kalos", "Planta", 650);
        Pokemon fennekin = new Pokemon("Fennekin", "Kalos", "Fuego", 653);
        Pokemon froakie = new Pokemon("Froakie", "Kalos", "Agua", 656);

        Pokemon[] iniciales = {
            
            bulbasaur, 
            charmander, 
            squirtle, 
            chikorita, 
            cyndaquil, 
            totodile, 
            treecko, 
            torchic, 
            mudkip,
            turtwig,
            chimchar,
            piplup,
            snivy,
            tepig,
            oshawott,
            chespin,
            fennekin,   
            froakie
        };

        PokeDex pokedex = new PokeDex(iniciales);
        pokedex.mostrarIniciales();
    }
}