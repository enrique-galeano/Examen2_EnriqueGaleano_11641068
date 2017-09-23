
import java.util.ArrayList;

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
	private ArrayList<Canciones> con = new ArrayList();
	private String nombre;

	public playList(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Canciones> getCon() {
		return con;
	}

	public void setCon(ArrayList<Canciones> con) {
		this.con = con;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return  nombre + "";
	}

	
}
