/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Canciones {
	private String nombre;
	private String artista;
	private long segundos;
	private String genero;

	public Canciones(String nombre, String artista, long segundos, String genero) {
		this.nombre = nombre;
		this.artista = artista;
		this.segundos = segundos;
		this.genero = genero;
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

	public long getSegundos() {
		return segundos;
	}

	public void setSegundos(long segundos) {
		this.segundos = segundos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
