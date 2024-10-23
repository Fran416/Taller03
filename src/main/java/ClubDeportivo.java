import java.util.*;

public class ClubDeportivo {

	private String nombre;
	private ArrayList<Equipo> equipos;
	private ArrayList<Cancha> canchas;

	public String registrarEntrenador (Equipo equipoEntrenador, String nombre, String experiencia, String deporte){
		for (Equipo equipo : equipos){
			if (equipo.getNombre().equals(equipoEntrenador.getNombre())){
				Entrenador entrenador = new Entrenador(nombre, experiencia, deporte);
				equipo.setEntrenador(entrenador);
			}
		}
	}

	public String registrarDeportista (Equipo equipoDeportista, String nombre, String apellido, ArrayList<String> contacto) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre().equals(equipoDeportista.getNombre())) {
				ArrayList<Deportista> deportistas = equipo.getDeportistas();
				for (Deportista deportista : deportistas) {
					if (deportista.getNombre().equals(nombre) && deportista.getApellido().equals(apellido)) {
						return "El deportista ya existe";
					}
				}
				Deportista deportista = new Deportista(equipoDeportista, nombre, apellido, contacto);
				equipo.agregarDeportista(deportista);
				return "Agregado correctamente";
			}
		}

		return "Equipo no encontrado";
	}

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

