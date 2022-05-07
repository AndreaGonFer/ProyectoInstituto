package es.prg.instituto;

public class Profesor extends Persona{
	private int id;
	private String asignatura;
	
	public Profesor() {
		super();
		id = 0;
		asignatura = "";
	}

	public Profesor(String nombre, String apellido1, String apellido2, String dni, int id, String asignatura) {
		super(nombre, apellido1, apellido2, dni);
		this.id = id;
		this.asignatura = asignatura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String toString() {
		return super.toString()+" es profesor de "+asignatura+ " con número personal " + id;
	}

}
