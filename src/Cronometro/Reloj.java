package Cronometro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Reloj extends JPanel implements ActionListener{
	private JTextField minutos_text;
	private JTextField segundos_text;
	public Reloj() {
		Timer t = new Timer(1000, this);
		t.start();
		Font fuente = new Font("Calibri", Font.BOLD, 40);
		this.setFont(fuente);
	}
	public static void main(String[] args) {
		new Reloj();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
