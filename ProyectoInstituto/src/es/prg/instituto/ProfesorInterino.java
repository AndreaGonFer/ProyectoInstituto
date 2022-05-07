package es.prg.instituto;

public class ProfesorInterino extends Profesor{
	private String fechaInicio;
	private String fechaFin;
	
	public ProfesorInterino() {
		super();
		fechaInicio = "";
		fechaFin = "";
	}

	public ProfesorInterino(String nombre, String apellido1, String apellido2, String dni, int id, String asignatura,
			String fechaInicio, String fechaFin) {
		super(nombre, apellido1, apellido2, dni, id, asignatura);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String toString() {
		return super.toString()+". Es profesor interino desde el día " + fechaInicio + " hasta el día " + fechaFin+".";
	}
	
}
