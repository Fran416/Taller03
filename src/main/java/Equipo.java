import java.util.*;

public class Equipo {

	ClubDeportivo club;
	Partido partido;
	private String nombre;
	private String deporte;
	private Collection<ArraList<Deportista>> deportistas;
	private Entrenador entrenador;

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

	public ArraList<Deportista> getDeportistas() {
		return this.deportistas;
	}

	/**
	 * 
	 * @param deportistas
	 */
	public void setDeportistas(ArraList<Deportista> deportistas) {
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