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

    public Pokemon buscarPokemonPorNombre(String nombre) {
        for (Pokemon pokemon : this.pokemones) {
            if (pokemon.getNombre().equalsIgnoreCase(nombre)) {
                return pokemon;
            }
        }
        return null;
    }

    public List<Pokemon> filtrarPorTipo(String tipo) {
        List<Pokemon> resultado = new ArrayList<>();
        for (Pokemon pokemon : this.pokemones) {
            if (pokemon.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(pokemon);
            }
        }
        return resultado;
    }

    public boolean eliminarPokemon(String nombre) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getNombre().equalsIgnoreCase(nombre)) {
                pokemonList.remove(pokemon);
                return true;
            }
        }
        return false;
    }

}
