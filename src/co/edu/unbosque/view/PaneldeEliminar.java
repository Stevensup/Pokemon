package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PaneldeEliminar extends JFrame {
	

		private JLabel lnombre, ltipo, foto1, foto2;
		private JTextField cnombre;
		private JButton bvolver, boton2, bbuscar;
		private Image imagen1;
		private Icon icon1, icon3, icon4, icon2;
		private JComboBox ctipo;
		private Image imagen4, imagen3, imagen5, imagen2;
		private Icon icon;

		private int hex(String color_hex) {
			return Integer.parseInt(color_hex, 16);
		}

		public PaneldeEliminar() {

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

			// LABEL
			
			imagen2 = new ImageIcon("src/co/edu/unbosque/view/imagenes/eliminartittle.png").getImage();
			icon2 = new ImageIcon(imagen2.getScaledInstance(280, 70, Image.SCALE_DEFAULT));
			foto2 = new JLabel();
			foto2.setBounds(150, 20, 280, 70);
			foto2.setIcon(icon2);
			
			lnombre = new JLabel("Nombre: ");
			lnombre.setBounds(20, 100, 200, 200);
			lnombre.setForeground(Color.BLACK);
			lnombre.setFont(letra);

			ltipo = new JLabel("Tipo: ");
			ltipo.setBounds(20, 170, 200, 200);
			ltipo.setForeground(Color.BLACK);
			ltipo.setFont(letra);

			// Cuadro de Texto
			cnombre = new JTextField();
			cnombre.setBounds(150, 180, 250, 30);

			// ComoBox

			ctipo = new JComboBox();
			ctipo.setBounds(150, 250, 250, 30);

			// FONDO
			imagen1 = new ImageIcon("src/co/edu/unbosque/view/imagenes/pokeabierta.png").getImage();
			icon1 = new ImageIcon(imagen1.getScaledInstance(1000, 700, Image.SCALE_DEFAULT));
			foto1 = new JLabel();
			foto1.setBounds(0, 0, 1000, 700);
			foto1.setIcon(icon1);

			// BOTONES

			imagen4 = new ImageIcon("src/co/edu/unbosque/view/imagenes/botoneliminar.png").getImage();
			icon = new ImageIcon(imagen4.getScaledInstance(265, 65, Image.SCALE_SMOOTH));
			bbuscar = new JButton(icon);
			bbuscar.setBounds(117, 400, 265, 65);
			bbuscar.setBorderPainted(false);
			bbuscar.setContentAreaFilled(false);

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

			// ADD

			add(bbuscar);
			add(foto2);
			add(ltipo);
			add(bvolver);
			add(boton2);
			add(ctipo);
			add(lnombre);
			add(cnombre);
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

		public JLabel getFoto2() {
			return foto2;
		}

		public void setFoto2(JLabel foto2) {
			this.foto2 = foto2;
		}

		public JTextField getCnombre() {
			return cnombre;
		}

		public void setCnombre(JTextField cnombre) {
			this.cnombre = cnombre;
		}

		public JButton getBvolver() {
			return bvolver;
		}

		public void setBvolver(JButton bvolver) {
			this.bvolver = bvolver;
		}

		public JButton getBoton2() {
			return boton2;
		}

		public void setBoton2(JButton boton2) {
			this.boton2 = boton2;
		}

		public JButton getBbuscar() {
			return bbuscar;
		}

		public void setBbuscar(JButton bbuscar) {
			this.bbuscar = bbuscar;
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

		public Icon getIcon3() {
			return icon3;
		}

		public void setIcon3(Icon icon3) {
			this.icon3 = icon3;
		}

		public Icon getIcon4() {
			return icon4;
		}

		public void setIcon4(Icon icon4) {
			this.icon4 = icon4;
		}

		public Icon getIcon2() {
			return icon2;
		}

		public void setIcon2(Icon icon2) {
			this.icon2 = icon2;
		}

		public JComboBox getCtipo() {
			return ctipo;
		}

		public void setCtipo(JComboBox ctipo) {
			this.ctipo = ctipo;
		}

		public Image getImagen4() {
			return imagen4;
		}

		public void setImagen4(Image imagen4) {
			this.imagen4 = imagen4;
		}

		public Image getImagen3() {
			return imagen3;
		}

		public void setImagen3(Image imagen3) {
			this.imagen3 = imagen3;
		}

		public Image getImagen5() {
			return imagen5;
		}

		public void setImagen5(Image imagen5) {
			this.imagen5 = imagen5;
		}

		public Image getImagen2() {
			return imagen2;
		}

		public void setImagen2(Image imagen2) {
			this.imagen2 = imagen2;
		}

		public Icon getIcon() {
			return icon;
		}

		public void setIcon(Icon icon) {
			this.icon = icon;
		}

}
