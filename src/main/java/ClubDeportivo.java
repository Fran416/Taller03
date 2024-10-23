import java.util.*;

public class ClubDeportivo {

	private String nombre;
	private ArrayList<Equipo> equipos;
	private ArrayList<Cancha> canchas;


	public String reservarHora(String ubicacionCancha, int horaARegistrar, int minutoARegistrar){
		for (Cancha cancha : canchas){
			if (cancha.getUbicacion().equals(ubicacionCancha)){
				if (cancha.getHorario().isEmpty()){
					Hora hora = new Hora(horaARegistrar, minutoARegistrar);
				} else {
					for (Hora horaOcupada : cancha.getHorario()){
						int hora = horaOcupada.getHoraIncio();
						int minuto = horaOcupada.getMinutoInicio();
						if ((hora -1 == horaARegistrar && minuto > minutoARegistrar)||hora == horaARegistrar || (horaARegistrar == hora+1 && minuto < minutoARegistrar)){
							return "Hora ocupada";
						}
					}
					Hora hora = new Hora(horaARegistrar, minutoARegistrar);
					cancha.registrarHora(hora);
				}
			}
		}
		return "Error";
	}


	public String registrarCancha(String tipoSuperficie, String ubicacion, int cantidadEspectadores){
		for (Cancha cancha : canchas) {
			if (cancha.getUbicacion().equals(ubicacion)) {
				return "Error: La ubicacion ya esta ocupada";
			}
		}
		Cancha cancha = new Cancha(tipoSuperficie, ubicacion, cantidadEspectadores);
		canchas.add(cancha);
		return "Cancha Agregada";
	}


	public String registrarEquipo(String nombre, String deporte) {
		for (Equipo equipo : equipos) {
			if (equipo.getNombre().equals(nombre)) {
				return "El equipo ya existe";
			}
		}
		equipos.add(new Equipo(nombre, deporte));
		return "Equipo registrado";
	}

	public String registrarEntrenador (Equipo equipoEntrenador, String nombre, String experiencia, String deporte){
		for (Equipo equipo : equipos){
			if (equipo.getNombre().equals(equipoEntrenador.getNombre())){
				Entrenador entrenador = new Entrenador(nombre, experiencia, deporte);
				equipo.setEntrenador(entrenador);
				return "Entrenador registrado con exito";
			}
		}
		return "Error al registrar";
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

