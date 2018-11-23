package Cronometro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Cronometro extends JPanel implements ActionListener{
	private JTextField cronometro_textfield;
	int minutos = 0,segundos=0;
	public Cronometro() {
		cronometro_textfield = new JTextField();
		Timer t = new Timer(1000, this);
		t.start();
		Font fuente = new Font("Calibri", Font.BOLD, 40);
		this.setFont(fuente);
	}
	public static void main(String[] args) {
		new Cronometro();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean salir = false;
		do {
			minutos++;
			segundos++;
		}while(!salir);
		cronometro_textfield.setText(minutos+":"+segundos);
	}
}
