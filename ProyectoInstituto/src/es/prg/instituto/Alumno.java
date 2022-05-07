package es.prg.instituto;

public class Alumno extends Persona{
	private int numMatricula;
	private String aula;
	
	public Alumno() {
		super();
		numMatricula = 0;
		aula = "";
	}

	public Alumno(String nombre, String apellido1, String apellido2, String dni, int numMatricula, String aula) {
		super(nombre, apellido1, apellido2, dni);
		this.numMatricula = numMatricula;
		this.aula = aula;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

		public String toString() {
		return super.toString()+" es alumno con número de matrícula " + numMatricula + ", y recibe clase en el aula " + aula+".";
	}
	
}
