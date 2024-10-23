public class Hora {

	Cancha horas;
	private int horaIncio;
	private int minutoInicio;

	public Hora(int horaIncio, int minutoInicio) {
		this.horaIncio = horaIncio;
		this.minutoInicio = minutoInicio;
	}

	public int getHoraIncio() {
		return this.horaIncio;
	}

	/**
	 * 
	 * @param horaIncio
	 */
	public void setHoraIncio(int horaIncio) {
		this.horaIncio = horaIncio;
	}

	public int getMinutoInicio() {
		return this.minutoInicio;
	}

	/**
	 * 
	 * @param minutoInicio
	 */
	public void setMinutoInicio(int minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

}