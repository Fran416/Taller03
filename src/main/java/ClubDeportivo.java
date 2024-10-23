import java.util.*;

public class ClubDeportivo {

	private String nombre;
	private Collection<ArrayList<Equipo>> equipos;
	private Collection<ArrayList<Cancha>> canchas;

	public ArrayList<Equipo> getEquipos() {
		return this.equipos;
	}

	/**
	 * 
	 * @param equipos
	 */
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public ArrayList<Cancha> getCanchas() {
		return this.canchas;
	}

	/**
	 * 
	 * @param canchas
	 */
	public void setCanchas(ArrayList<Cancha> canchas) {
		this.canchas = canchas;
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

}