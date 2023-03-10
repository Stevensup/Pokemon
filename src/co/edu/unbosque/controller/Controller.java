package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MenuPrincipal;
import co.edu.unbosque.view.PaneldeBuscar;
import co.edu.unbosque.view.PaneldeEliminar;
import co.edu.unbosque.view.PaneldeRegistrar;
import co.edu.unbosque.view.VentanaInicial;

public class Controller implements ActionListener {

	private VentanaInicial vista1;
	private MenuPrincipal vista2;
	private SoundHandler sonido1;
	private PaneldeBuscar vista3;
	private PaneldeRegistrar vista4;
	private PaneldeEliminar vista5;

	public Controller() {
		vista1 = new VentanaInicial();
		vista2 = new MenuPrincipal();
		vista3 = new PaneldeBuscar();
		vista4 = new PaneldeRegistrar();
		vista5 = new PaneldeEliminar();
		// sonido1 = new SoundHandler("src/co/edu/unbosque/view/music/X2Download.wav");
		asignarOyentes();
	}

	public void asignarOyentes() {
		// BOTONES VENTANA INICIAL

		vista1.getBoton().addActionListener(this);
		vista1.getBoton().setActionCommand("botoniniciar");

		vista1.getBoton2().addActionListener(this);
		vista1.getBoton2().setActionCommand("botonsalir");

		// BOTONES VENTANA MENU

		vista2.getBoton().addActionListener(this);
		vista2.getBoton().setActionCommand("botonbuscar");

		vista2.getBoton2().addActionListener(this);
		vista2.getBoton2().setActionCommand("botonsalir");

		vista2.getBoton3().addActionListener(this);
		vista2.getBoton3().setActionCommand("botonregistrar");

		vista2.getBoton4().addActionListener(this);
		vista2.getBoton4().setActionCommand("botoneliminar");

		// BOTONES VENTANA REGISTRAR
		vista4.getBregistrar().addActionListener(this);
		vista4.getBregistrar().setActionCommand("botonregistrar2");

		vista4.getBoton2().addActionListener(this);
		vista4.getBoton2().setActionCommand("botonsalir2");
		vista4.getBvolver().addActionListener(this);
		vista4.getBvolver().setActionCommand("botonvolver");

		// BOTONES VENTANA BUSCAR
		vista3.getBoton2().addActionListener(this);
		vista3.getBoton2().setActionCommand("botonsalir2");

		vista3.getBbuscar().addActionListener(this);
		vista3.getBbuscar().setActionCommand("botonbuscar");

		vista3.getBvolver().addActionListener(this);
		vista3.getBvolver().setActionCommand("botonvolver2");

		// BOTONES VENTANA ELIMINAR

		vista5.getBbuscar().addActionListener(this);
		vista5.getBbuscar().setActionCommand("botoneliminar");

		vista5.getBvolver().addActionListener(this);
		vista5.getBbuscar().setActionCommand("botonvolver3");

		vista5.getBoton2().addActionListener(this);
		vista5.getBoton2().setActionCommand("botonsalir3");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		switch (e.getActionCommand()) {

			// BOTONES VENTANA INICIAL
			case "botoniniciar": {
				vista1.setVisible(false);
				vista2.setVisible(true);
				sonido1.play();
				break;
			}
			case "botonsalir": {
				System.exit(0);
				sonido1.stop();
				break;
			}
			case "botonbuscar": {
				vista2.setVisible(false);
				vista3.setVisible(true);
				sonido1.play();
				break;
			}
			case "botonregistrar": {
				vista2.setVisible(false);
				vista4.setVisible(true);
				sonido1.play();
				break;

			}
			case "botoneliminar": {
				vista2.setVisible(false);
				vista5.setVisible(true);
				break;

			}
			case "botonregistrar2": {
				vista2.setVisible(false);
				vista3.setVisible(true);
				break;

			}
			case "botonsalir2": {
				System.exit(0);
				sonido1.stop();
				break;

			}
			case "botonvolver": {
				vista2.setVisible(true);
				vista4.setVisible(false);
				break;

			}
			case "botonvolver2": {
				vista2.setVisible(true);
				vista3.setVisible(false);

				break;

			}
			case "botonvolver3": {
				vista2.setVisible(true);
				vista5.setVisible(false);

				break;

			}
			case "botonsalir3": {
				System.exit(0);
				sonido1.stop();
				break;

			}
		}
	}
}
