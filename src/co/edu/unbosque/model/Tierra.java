package co.edu.unbosque.model;

public class Tierra extends Pokemon {
    private String tipo = "Tierra";
    private String[] ventajaContra = { "Fuego", "Electricidad" };

    public Tierra(String nombre, String habilidades, int ataque, int defensa, String nombreEvolucion) {
        super(nombre, habilidades, null, ataque, defensa, nombreEvolucion);
    }

    public String getTipo() {
        return tipo;
    }

    public String[] getVentajaContra() {
        return ventajaContra;
    }

    @Override
    public void atacar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void evolucionar() {
        // TODO Auto-generated method stub

    }
}
