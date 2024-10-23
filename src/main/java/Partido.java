import java.util.*;

public class Partido {

	private ArrayList<Equipo> equipos;
	private Cancha cancha;
	private String resultado;
	private String fecha;

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

	public Cancha getCancha() {
		return this.cancha;
	}

	/**
	 * 
	 * @param cancha
	 */
	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public String getResultado() {
		return this.resultado;
	}

	/**
	 * 
	 * @param resultado
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}