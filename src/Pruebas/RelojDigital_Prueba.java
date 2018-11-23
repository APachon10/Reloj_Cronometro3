package Pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RelojDigital_Prueba extends JTextField implements ActionListener {
	private JFrame ventanaReloj;
	private JLabel label_reloj;
	
	public RelojDigital_Prueba() {
		ventanaReloj = new JFrame("Reloj Digital ");
		
		ventanaReloj.setVisible(true);
		ventanaReloj.setSize(400, 200);
	}
	public static void main(String[] args) {
		new RelojDigital_Prueba();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
