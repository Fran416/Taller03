import java.util.*;

public class Deportista {

	Equipo equipo;
	private String nombre;
	private String apellido;
	private ArrayList<String> contacto;
	private String deporte;
	Collection<ClubDeportivo> club;

	public Deportista(Equipo equipo, String nombre, String apellido, ArrayList<String> contacto) {
		this.equipo = equipo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contacto = contacto;
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

	public String getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<String> getContacto() {
		return this.contacto;
	}

	/**
	 * 
	 * @param contacto
	 */
	public void setContacto(ArrayList<String> contacto) {
		this.contacto = contacto;
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

}