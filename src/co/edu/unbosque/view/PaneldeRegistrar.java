package co.edu.unbosque.view;

import co.edu.unbosque.view.*;
import co.edu.unbosque.model.*;
import co.edu.unbosque.controller.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PaneldeRegistrar extends JFrame {

	private JLabel lnombre, ltipo, foto1, lataque, ldefensa, foto2, foto3;
	private JTextField cnombre, ctipo, tataque, tdefensa;
	private JButton bBuscar, bregistrar, bEliminar, boton2, bvolver;
	private Icon icon1, icon4;
	private Image imagen1, imagen4, imagen3, imagen5, imagen6;
	private Icon icon, icon3, icon6;

	Pokedex pokedexInstance = new Pokedex();

	private int hex(String color_hex) {
		return Integer.parseInt(color_hex, 16);
	}

	public PaneldeRegistrar() {

		setSize(1000, 700);
		setBounds(0, 0, 1000, 700);
		setBackground(new Color(hex("C48DEB")));
		setResizable(false);
		setLocationRelativeTo(null);
		setForeground(getBackground());
		setUndecorated(true);

		// FONT
		Font letra = new Font("arial", 3, 18);
		setFont(letra);

		// REGISTRAR
		Point point = new Point(0, 0);
		Toolkit tkit = Toolkit.getDefaultToolkit();
		Image img1 = tkit.getImage("src/co/edu/unbosque/view/imagenes/cursorpoke.png");
		Cursor cursor1 = tkit.createCustomCursor(img1, point, "src/co/edu/unbosque/view/imagenes/cursorpoke.png");

		// LABEL

		imagen6 = new ImageIcon("src/co/edu/unbosque/view/imagenes/registrartittle.png").getImage();
		icon6 = new ImageIcon(imagen6.getScaledInstance(280, 70, Image.SCALE_DEFAULT));
		foto3 = new JLabel();
		foto3.setBounds(150, 20, 280, 70);
		foto3.setIcon(icon6);

		lnombre = new JLabel("Nombre: ");
		lnombre.setBounds(20, 100, 200, 200);
		lnombre.setForeground(Color.BLACK);
		lnombre.setFont(letra);

		ltipo = new JLabel("Tipo: ");
		ltipo.setBounds(20, 170, 200, 200);
		ltipo.setForeground(Color.BLACK);
		ltipo.setFont(letra);

		lataque = new JLabel("Ataque: ");
		lataque.setBounds(20, 310, 100, 200);
		lataque.setForeground(Color.BLACK);
		lataque.setFont(letra);

		ldefensa = new JLabel("Defensa: ");
		ldefensa.setBounds(250, 310, 100, 200);
		ldefensa.setForeground(Color.BLACK);
		ldefensa.setFont(letra);

		// Cuadro de Texto
		cnombre = new JTextField();
		cnombre.setBounds(150, 180, 250, 30);

		ctipo = new JTextField();
		ctipo.setBounds(150, 250, 250, 30);

		tataque = new JTextField();
		tataque.setBounds(100, 395, 80, 30);

		tdefensa = new JTextField();
		tdefensa.setBounds(340, 395, 80, 30);

		// BOTONES

		imagen4 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonregistrar.png").getImage();
		icon = new ImageIcon(imagen4.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
		bregistrar = new JButton(icon);
		bregistrar.setBounds(117, 500, 265, 65);
		bregistrar.setBorderPainted(false);
		bregistrar.setContentAreaFilled(false);
		bregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Recopilar los datos ingresados por el usuario
				String nombre = cnombre.getText();
				String tipo = ctipo.getText();
				int ataque = Integer.parseInt(tataque.getText());
				int defensa = Integer.parseInt(tdefensa.getText());

				// Crear un nuevo objeto Pokemon con los datos ingresados
				Pokemon nuevoPokemon = new Pokemon(nombre, tipo, ataque, defensa);

				// Registrar el nuevo Pokemon en la Pokedex mediante la instancia de Pokedex
				// creada previamente
				pokedexInstance.registrarPokemon(nuevoPokemon);

				// Mostrar un mensaje de éxito
				JOptionPane.showMessageDialog(null, "Pokemon registrado exitosamente.");
			}
		});

		imagen3 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonsalir.png").getImage();
		icon3 = new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		boton2 = new JButton(icon3);
		boton2.setBounds(950, 10, 50, 50);
		boton2.setBorderPainted(false);
		boton2.setContentAreaFilled(false);

		imagen5 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botonvolver1.png").getImage();
		icon4 = new ImageIcon(imagen5.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
		bvolver = new JButton(icon4);
		bvolver.setBounds(117, 600, 265, 65);
		bvolver.setBorderPainted(false);
		bvolver.setContentAreaFilled(false);

		// FONDO
		imagen1 = new ImageIcon("src/co/edu/unbosque/view/imagenes/pokeabierta.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1000, 700, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1000, 700);
		foto1.setIcon(icon1);

		// ADD
		foto1.setCursor(cursor1);
		add(foto3);
		add(bvolver);
		add(boton2);
		add(bregistrar);
		add(lataque);
		add(ldefensa);
		add(tataque);
		add(tdefensa);
		add(ltipo);
		add(lnombre);
		add(cnombre);
		add(ctipo);
		add(foto1);

		setVisible(false);
	}

	public JLabel getLnombre() {
		return lnombre;
	}

	public void setLnombre(JLabel lnombre) {
		this.lnombre = lnombre;
	}

	public JLabel getLtipo() {
		return ltipo;
	}

	public void setLtipo(JLabel ltipo) {
		this.ltipo = ltipo;
	}

	public JLabel getFoto1() {
		return foto1;
	}

	public void setFoto1(JLabel foto1) {
		this.foto1 = foto1;
	}

	public JLabel getLataque() {
		return lataque;
	}

	public void setLataque(JLabel lataque) {
		this.lataque = lataque;
	}

	public JLabel getLdefensa() {
		return ldefensa;
	}

	public void setLdefensa(JLabel ldefensa) {
		this.ldefensa = ldefensa;
	}

	public JTextField getCnombre() {
		return cnombre;
	}

	public void setCnombre(JTextField cnombre) {
		this.cnombre = cnombre;
	}

	public JTextField getctipo() {
		return ctipo;
	}

	public void setctipo(JTextField ctipo) {
		this.ctipo = ctipo;
	}

	public JTextField getTataque() {
		return tataque;
	}

	public void setTataque(JTextField tataque) {
		this.tataque = tataque;
	}

	public JTextField getTdefensa() {
		return tdefensa;
	}

	public void setTdefensa(JTextField tdefensa) {
		this.tdefensa = tdefensa;
	}

	public JButton getbBuscar() {
		return bBuscar;
	}

	public void setbBuscar(JButton bBuscar) {
		this.bBuscar = bBuscar;
	}

	public JButton getBregistrar() {
		return bregistrar;
	}

	public void setBregistrar(JButton bregistrar) {
		this.bregistrar = bregistrar;
	}

	public JButton getbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(JButton bEliminar) {
		this.bEliminar = bEliminar;
	}

	public Image getImagen1() {
		return imagen1;
	}

	public void setImagen1(Image imagen1) {
		this.imagen1 = imagen1;
	}

	public Icon getIcon1() {
		return icon1;
	}

	public void setIcon1(Icon icon1) {
		this.icon1 = icon1;
	}

	public Image getImagen4() {
		return imagen4;
	}

	public void setImagen4(Image imagen4) {
		this.imagen4 = imagen4;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	public JLabel getFoto2() {
		return foto2;
	}

	public void setFoto2(JLabel foto2) {
		this.foto2 = foto2;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public void setBoton2(JButton boton2) {
		this.boton2 = boton2;
	}

	public Image getImagen3() {
		return imagen3;
	}

	public void setImagen3(Image imagen3) {
		this.imagen3 = imagen3;
	}

	public Icon getIcon3() {
		return icon3;
	}

	public void setIcon3(Icon icon3) {
		this.icon3 = icon3;
	}

	public JButton getBvolver() {
		return bvolver;
	}

	public void setBvolver(JButton bvolver) {
		this.bvolver = bvolver;
	}

	public Icon getIcon4() {
		return icon4;
	}

	public void setIcon4(Icon icon4) {
		this.icon4 = icon4;
	}

	public Image getImagen5() {
		return imagen5;
	}

	public void setImagen5(Image imagen5) {
		this.imagen5 = imagen5;
	}

}
