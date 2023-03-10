package co.edu.unbosque.model;

public class Fuego extends Pokemon {
    private boolean puedeQuemar;

    public Fuego(String nombre, String tipo, String[] habilidades, int ataque, int defensa, String nombreEvolucion, boolean puedeQuemar) {
        super(nombre, tipo, habilidades, ataque, defensa, nombreEvolucion);
        this.puedeQuemar = puedeQuemar;
    }

    public boolean isPuedeQuemar() {
        return puedeQuemar;
    }

    public void setPuedeQuemar(boolean puedeQuemar) {
        this.puedeQuemar = puedeQuemar;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Puede quemar: " + puedeQuemar;
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
