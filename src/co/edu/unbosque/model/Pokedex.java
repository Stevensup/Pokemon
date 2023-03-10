package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemones;

    public void registrarPokemon(String nombre, String tipo, int ataque, int defensa) {
        Pokemon nuevoPokemon = new Pokemon(nombre, tipo, ataque, defensa);
        pokemones.add(nuevoPokemon);
        System.out.println("Pokemon registrado exitosamente.");
    }

}
