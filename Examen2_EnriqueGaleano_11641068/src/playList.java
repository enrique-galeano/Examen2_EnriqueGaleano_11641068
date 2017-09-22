/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class playList {
	private Canciones cancion;

	public playList(Canciones cancion) {
		this.cancion = cancion;
	}

	public Canciones getCancion() {
		return cancion;
	}

	public void setCancion(Canciones cancion) {
		this.cancion = cancion;
	}

	@Override
	public String toString() {
		return  cancion + "";
	}
	
	
}
