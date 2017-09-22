
import java.io.Serializable;
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
public class Usuario implements Serializable{
	private String nombre;
	private int edad;
	private String username;
	private String password;
	private ArrayList <playList> playlist = new ArrayList();
	private ArrayList <Favoritos> favoritos = new ArrayList();

	public Usuario(String nombre, int edad, String username, String password) {
		this.nombre = nombre;
		this.edad = edad;
		this.username = username;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<playList> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<playList> playlist) {
		this.playlist = playlist;
	}

	public ArrayList<Favoritos> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(ArrayList<Favoritos> favoritos) {
		this.favoritos = favoritos;
	}

	@Override
	public String toString() {
		return nombre + " ";
	}
	
}
