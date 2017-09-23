
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Hilo extends Thread{
	private JLabel l;
	private Canciones cancion;

	public Hilo(JLabel l, Canciones cancion) {
		this.l = l;
		this.cancion = cancion;
	}

	public JLabel getL() {
		return l;
	}

	public void setL(JLabel l) {
		this.l = l;
	}

	public Canciones getCancion() {
		return cancion;
	}

	public void setCancion(Canciones cancion) {
		this.cancion = cancion;
	}
	@Override
	public void run() {
            l.setText(cancion.getSegundos() + "");
            while (cancion.getSegundos() > 0) {
                cancion.setSegundos(cancion.getSegundos() - 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                }
                l.setText(cancion.getSegundos() + "");
            }
        JOptionPane.showMessageDialog(null, "se ha terminado la rola");
    }
	
	
}
