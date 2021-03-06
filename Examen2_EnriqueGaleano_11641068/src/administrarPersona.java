
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class administrarPersona implements Serializable {

	private ArrayList<Usuario> listaUsuarios = new ArrayList();
	private File archivo = null;

	
	public administrarPersona(String path){
		archivo = new File(path);
	}
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	public void setPersona(Usuario p) {
		this.listaUsuarios.add(p);
	}

	public void cargarArchivo() {
		try {
			listaUsuarios = new ArrayList();
			Usuario temp;
			if (archivo.exists()) {
				FileInputStream entrada = new FileInputStream(archivo);
				ObjectInputStream objeto = new ObjectInputStream(entrada);
				try {
					while ((temp = (Usuario) objeto.readObject()) != null) {
						listaUsuarios.add(temp);
					}
				} catch (EOFException e) {
					//Encontro final del archivo
				}
				objeto.close();
				entrada.close();
				//fin if
			}
		} catch (Exception e) {

		}

	}//Fin del metodo

	public void escribirArchivo() {
		FileOutputStream fw = null;
		ObjectOutputStream bw = null;

		try {
			fw = new FileOutputStream(archivo);
			bw = new ObjectOutputStream(fw);
			for (Usuario t : listaUsuarios) {
				bw.writeObject(t);
			}
		} catch (Exception ex) {
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (Exception e) {
			}
		}
	}
}
