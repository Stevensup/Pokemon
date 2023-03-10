package co.edu.unbosque.model;

public class Agua extends Pokemon {
    private boolean puedeNadar;

    public Agua(String nombre, String tipo, String[] habilidades, int ataque, int defensa, String nombreEvolucion, boolean puedeNadar) {
        super(nombre, tipo, habilidades, ataque, defensa, nombreEvolucion);
        this.puedeNadar = puedeNadar;
    }

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Puede nadar: " + puedeNadar;
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
