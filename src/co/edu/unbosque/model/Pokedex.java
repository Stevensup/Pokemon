package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    private List<Pokemon> pokemones;

    public void registrarPokemon(String nombre, String tipo, int ataque, int defensa) {
        Pokemon nuevoPokemon;
        switch (tipo) {
            case "Agua":
                nuevoPokemon = new Agua(nombre, tipo, null, ataque, defensa, tipo, false);
                break;
            case "Tierra":
                nuevoPokemon = new Tierra(nombre, tipo, ataque, defensa, tipo);
                break;
            case "Fuego":
                nuevoPokemon = new Fuego(nombre, tipo, null, ataque, defensa, tipo, false);
                break;
            case "Eléctrico":
                nuevoPokemon = new Electrico(nombre, tipo, null, ataque, defensa, tipo, false);
                break;
            case "Planta":
                nuevoPokemon = new Planta(nombre, tipo, null, ataque, defensa, tipo, false);
                break;
            default:
                // Si el tipo no es válido, no se crea ningún Pokemon
                System.out.println("Error: tipo de Pokemon inválido.");
                return;
        }
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
        for (Pokemon pokemon : pokemones) {
            if (pokemon.getNombre().equalsIgnoreCase(nombre)) {
                pokemones.remove(pokemon);
                return true;
            }
        }
        return false;
    }

}
