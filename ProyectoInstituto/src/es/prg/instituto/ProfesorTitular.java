package es.prg.instituto;

public class ProfesorTitular extends Profesor{
	private String centroAsignado;
	private int año;
	
	public ProfesorTitular() {
		super();
		centroAsignado = "";
		año = 0;
	}

	public ProfesorTitular(String nombre, String apellido1, String apellido2, String dni, int id, String asignatura,
			String centroAsignado, int año) {
		super(nombre, apellido1, apellido2, dni, id, asignatura);
		this.centroAsignado = centroAsignado;
		this.año = año;
	}

	public String getCentroAsignado() {
		return centroAsignado;
	}

	public void setCentroAsignado(String centroAsignado) {
		this.centroAsignado = centroAsignado;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String toString() {
		return super.toString()+". Es profesor titular en el " + centroAsignado + " desde el año " + año + ".";
	}	

}
