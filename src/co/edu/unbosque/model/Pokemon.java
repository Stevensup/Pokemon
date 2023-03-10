package co.edu.unbosque.model;

import java.util.Arrays;

public abstract class Pokemon {

    private String nombre;
    private String tipo;
    private String[] habilidades;
    private int ataque;
    private int defensa;
    private String nombreEvolucion;

    public Pokemon(String nombre, String tipo, String[] habilidades, int ataque, int defensa, String nombreEvolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidades = habilidades;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nombreEvolucion = nombreEvolucion;
    }

    public abstract void atacar();

    public abstract void evolucionar();
    // Métodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombreEvolucion() {
        return nombreEvolucion;
    }

    public void setNombreEvolucion(String nombreEvolucion) {
        this.nombreEvolucion = nombreEvolucion;
    }

    // Métodos adicionales

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", nombreEvolucion='" + nombreEvolucion + '\'' +
                '}';
    }
}
