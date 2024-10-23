import java.util.*;

public class Equipo {

	Partido partido;
	private String nombre;
	private String deporte;
	private ArrayList<Deportista> deportistas;
	private Entrenador entrenador;

	public void agregarDeportista(Deportista deportista) {
		this.deportistas.add(deportista);
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDeporte() {
		return this.deporte;
	}

	/**
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public ArrayList<Deportista> getDeportistas() {
		return this.deportistas;
	}

	/**
	 * 
	 * @param deportistas
	 */
	public void setDeportistas(ArrayList<Deportista> deportistas) {
		this.deportistas = deportistas;
	}

	public Entrenador getEntrenador() {
		return this.entrenador;
	}

	/**
	 * 
	 * @param entrenador
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

}