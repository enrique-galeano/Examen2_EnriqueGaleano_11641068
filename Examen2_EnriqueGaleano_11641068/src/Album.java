
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
public class Album {
	private String nombre;
	private String artista;
	private ArrayList<Canciones> cancion = new ArrayList();

	public Album(String nombre, String artista) {
		this.nombre = nombre;
		this.artista = artista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public ArrayList<Canciones> getCancion() {
		return cancion;
	}

	public void setCancion(ArrayList<Canciones> cancion) {
		this.cancion = cancion;
	}

	@Override
	public String toString() {
		return  nombre + "";
	}
	
	
	
}
