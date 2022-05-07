package es.prg.instituto;

public class AlumnoFpInt extends AlumnoFp{
	
	private String pais;
	private int duracion;
	
	public AlumnoFpInt(String nombre, String apellido1, String apellido2, String dni, int numMatricula, String aula, String curso, Grado grado, boolean repite, String pais, int duracion) {
		super(nombre, apellido1, apellido2, dni, numMatricula, aula, curso, grado, repite);
		this.pais = pais;
		this.duracion = duracion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return super.toString()+" El alumno procede de " + pais + ", y el intercambio tendrá una duracion de " + duracion + " meses.";
	}	

}
