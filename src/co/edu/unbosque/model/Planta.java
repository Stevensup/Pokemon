package co.edu.unbosque.model;

public class Planta extends Pokemon {
    private boolean puedeRegenerar;

    public Planta(String nombre, String tipo, String[] habilidades, int ataque, int defensa, String nombreEvolucion, boolean puedeRegenerar) {
        super(nombre, tipo, habilidades, ataque, defensa, nombreEvolucion);
        this.puedeRegenerar = puedeRegenerar;
    }

    public boolean isPuedeRegenerar() {
        return puedeRegenerar;
    }

    public void setPuedeRegenerar(boolean puedeRegenerar) {
        this.puedeRegenerar = puedeRegenerar;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Puede regenerar: " + puedeRegenerar;
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

