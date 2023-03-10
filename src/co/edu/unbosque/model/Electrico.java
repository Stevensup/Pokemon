package co.edu.unbosque.model;

public class Electrico extends Pokemon {
    private boolean puedeParalizar;

    public Electrico(String nombre, String tipo, String[] habilidades, int ataque, int defensa, String nombreEvolucion, boolean puedeParalizar) {
        super(nombre, tipo, habilidades, ataque, defensa, nombreEvolucion);
        this.puedeParalizar = puedeParalizar;
    }

    public boolean isPuedeParalizar() {
        return puedeParalizar;
    }

    public void setPuedeParalizar(boolean puedeParalizar) {
        this.puedeParalizar = puedeParalizar;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Puede paralizar: " + puedeParalizar;
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

