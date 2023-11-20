package PokeDex;

import Pokemon.Pokemon;
import java.util.ArrayList;
import java.util.Random;


public class PokeDex {

    public static ArrayList <Pokemon> listaPokemons = new ArrayList <Pokemon> ();
    
    public static void main (String[] args) {
        /* --v1.0
        // Hacer mi lista de pokemons
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta/Veneno", "Kanto", "Pokemon Semilla", 0, 001, 6.9, 0.7);
        Pokemon charmander = new Pokemon("Charmander", "Fuego", "Kanto", "Pokemon Lagartija", 0, 004, 8.5, 0.6);
        Pokemon squirtle = new Pokemon("Squirtle", "Agua", "Kanto", "Pokemon Tortuguita", 0, 007, 9.0, 0.5);
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", "Kanto", "Pokemon Ratón", 0, 025, 6.0, 0.4);
        Pokemon arceus = new Pokemon("Arceus", "Hada", "Kanto", "Pokemon Alfa", 100, 493, 320.0, 3.2);

        //Generar un nivel aleatorio para c/ pokemon
        Random random = new Random();
        int nivelAleatorio1 = random.nextInt(100) + 1;
        int nivelAleatorio2 = random.nextInt(100) + 1;
        int nivelAleatorio3 = random.nextInt(100) + 1;
        int nivelAleatorio4 = random.nextInt(100) + 1;
        
        bulbasaur.setNivel(nivelAleatorio1);
        charmander.setNivel(nivelAleatorio2);
        squirtle.setNivel(nivelAleatorio3);
        pikachu.setNivel(nivelAleatorio4);

        //Añadir a la lista los pokemons
        listaPokemons.add(bulbasaur);
        listaPokemons.add(charmander);
        listaPokemons.add(squirtle);
        listaPokemons.add(pikachu);
        listaPokemons.add(arceus);

        //Mostrar los datos en la pokedex
        System.out.println("\t\tPOKEDEX");
        for (Pokemon pokemon : listaPokemons) {
            System.out.println("\n" + "Nombre: " + pokemon.getNombre() + "\n" + "Tipo: " + pokemon.getTipo() + "\n" + "Región: " + pokemon.getRegion() + "\n" + "Clasificación: " + pokemon.getClasificacion() + "\n" + "Nivel: " + pokemon.getNivel() + "\n" + "Numeración: #" + pokemon.getNumeracion() + "\n" + "Peso: " + pokemon.getPeso() + " kg" + "\n" + "Altura: " + pokemon.getAltura() + " m");
        }
        */

        /* --v2.0 */
        // Hacer lista de pokemons con arrays
        String[] nombres = {"Bulbasaur", "Charmander", "Squirtle", "Pikachu", "Arceus"};
        String[] tipos = {"Planta/Veneno", "Fuego", "Agua", "Eléctrico", "Hada"};
        String[] regiones = {"Kanto", "Kanto", "Kanto", "Kanto", "Kanto"};
        String[] clasificaciones = {"Pokemon Semilla", "Pokemon Lagartija", "Pokemon Tortuguita", "Pokemon Ratón", "Pokemon Alfa"};
        String[] numeraciones = {"001", "004", "007", "025", "493"};
        double[] pesos = {6.9, 8.5, 9.0, 6.0, 320.0};
        double[] alturas = {0.7, 0.6, 0.5, 0.4, 3.2};


        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            Pokemon pokemon = new Pokemon(nombres[i], tipos[i], regiones[i], clasificaciones[i], random.nextInt(100) + 1, numeraciones[i], pesos[i], alturas[i]);
            listaPokemons.add(pokemon);
        }

        System.out.println("\t\tPOKEDEX");
        for (Pokemon pokemon : listaPokemons) {
            System.out.println("\n" + "Nombre: " + pokemon.getNombre() + "\n" + "Tipo: " + pokemon.getTipo() + "\n" + "Región: " + pokemon.getRegion() + "\n" + "Clasificación: " + pokemon.getClasificacion() + "\n" + "Nivel: " + pokemon.getNivel() + "\n" + "Numeración: #" + pokemon.getNumeracion() + "\n" + "Peso: " + pokemon.getPeso() + " kg" + "\n" + "Altura: " + pokemon.getAltura() + " m");
        }
    }
}