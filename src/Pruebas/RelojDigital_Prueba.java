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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class RelojDigital_Prueba extends JTextField implements ActionListener {
	private JFrame ventanaReloj;
	private JLabel label_reloj;
	private Reloj Reloj_text;
	
	public RelojDigital_Prueba() {
		ventanaReloj = new JFrame("Reloj Digital ");
		ventanaReloj.getContentPane().setForeground(Color.BLACK);
		ventanaReloj.getContentPane().setBackground(Color.WHITE);
		
		ventanaReloj.setVisible(true);
		ventanaReloj.setSize(400, 441);
		
		Reloj_text = new Reloj();
		Reloj_text.setForeground(new Color(0, 0, 0));
		Reloj_text.setColumns(10);
		
		JLabel lblRelojDigital = new JLabel("Reloj Digital");
		
		JLabel lblCronometro = new JLabel("Cronometro");
		GroupLayout groupLayout = new GroupLayout(ventanaReloj.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCronometro)
						.addComponent(Reloj_text, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRelojDigital))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(216, Short.MAX_VALUE)
					.addComponent(lblRelojDigital)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Reloj_text, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblCronometro)
					.addGap(79))
		);
		ventanaReloj.getContentPane().setLayout(groupLayout);
	}
	public static void main(String[] args) {
		new RelojDigital_Prueba();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
