package Cronometro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Cronometro extends JPanel implements ActionListener{
	private Timer t;
	private JButton Boton_Comenzar;
	int minutos = 0,segundos=0;
	public Cronometro() {
		t = new Timer(1000, this);
		
		Font fuente = new Font("Calibri", Font.BOLD, 40);
		t.start();
		this.setFont(fuente);
		
		Boton_Comenzar = new JButton("Iniciar");
		Boton_Comenzar.addActionListener(this);
		JButton btnNewButton = new JButton("New button");
		JButton btnNewButton_1 = new JButton("New button");
		
		JTextField textField_prueba = new JTextField();
		textField_prueba.setColumns(10);
		textField_prueba.setText("00:00");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(Boton_Comenzar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addContainerGap(15, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(25, Short.MAX_VALUE)
					.addComponent(textField_prueba, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(textField_prueba, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(Boton_Comenzar)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(34))
		);
		setLayout(groupLayout);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Cronometro();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Boton_Comenzar) {
			System.out.println("Funciona");
		}
		
	}
}
