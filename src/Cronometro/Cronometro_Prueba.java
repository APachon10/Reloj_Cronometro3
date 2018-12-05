package Cronometro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import RelojDigital.Reloj;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;

public class Cronometro_Prueba extends JFrame{
	private JFrame ventanaCronometro;
	
	private Cronometro panel_Cronometro;
	public Cronometro_Prueba() {
		ventanaCronometro  = new JFrame();
		panel_Cronometro = new Cronometro();
		GroupLayout groupLayout = new GroupLayout(ventanaCronometro.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(panel_Cronometro, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(panel_Cronometro, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(227, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		
		ventanaCronometro.setVisible(true);
		ventanaCronometro.setSize(400, 200);
		ventanaCronometro.setDefaultCloseOperation(ventanaCronometro.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Cronometro_Prueba();
	}
}
