package Pruebas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;

import javax.swing.JTextField;
import javax.swing.Timer;

public class Reloj extends JTextField implements ActionListener{
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
		Calendar calendario = Calendar.getInstance();
		
		int hora = calendario.get(Calendar.HOUR);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		
		DecimalFormat df = new DecimalFormat("00");
		
		String hora_dia = hora+":"+df.format(minutos)+":"+df.format(segundos);
		this.setText(hora_dia);
	}
}
