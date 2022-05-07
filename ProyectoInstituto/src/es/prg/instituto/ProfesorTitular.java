package es.prg.instituto;

public class ProfesorTitular extends Profesor{
	private String centroAsignado;
	private int a�o;
	
	public ProfesorTitular() {
		super();
		centroAsignado = "";
		a�o = 0;
	}

	public ProfesorTitular(String nombre, String apellido1, String apellido2, String dni, int id, String asignatura,
			String centroAsignado, int a�o) {
		super(nombre, apellido1, apellido2, dni, id, asignatura);
		this.centroAsignado = centroAsignado;
		this.a�o = a�o;
	}

	public String getCentroAsignado() {
		return centroAsignado;
	}

	public void setCentroAsignado(String centroAsignado) {
		this.centroAsignado = centroAsignado;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String toString() {
		return super.toString()+". Es profesor titular en el " + centroAsignado + " desde el a�o " + a�o + ".";
	}	

}
