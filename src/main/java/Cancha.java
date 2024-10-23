import java.util.*;

public class Cancha {

	ClubDeportivo club;
	Partido partido;
	private String tipoSuperficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private Collection<ArrayList<Hora>> horario;

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	/**
	 * 
	 * @param tipoSuperficie
	 */
	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	/**
	 * 
	 * @param capacidadEspectadores
	 */
	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public ArrayList<Hora> getHorario() {
		return this.horario;
	}

	/**
	 * 
	 * @param horario
	 */
	public void setHorario(ArrayList<Hora> horario) {
		this.horario = horario;
	}

}