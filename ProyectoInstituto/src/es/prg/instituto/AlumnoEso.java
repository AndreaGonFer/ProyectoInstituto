package es.prg.instituto;

public class AlumnoEso extends Alumno{
	
	private String curso;
	private boolean repite;
	
	public AlumnoEso() {
		super();
		curso = "";
		repite = false;
	}
	
	public AlumnoEso(String nombre, String apellido1, String apellido2, String dni, int numMatricula, String aula,String curso, boolean repite) {
		super(nombre, apellido1, apellido2, dni, numMatricula, aula);
		this.curso = curso;
		this.repite = repite;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isRepite() {
		return repite;
	}

	public void setRepite(boolean repite) {
		this.repite = repite;
	}
	
	public String repetir() {
		String repetidor = "";
		if (repite == true) {
			repetidor = "es repetidor";
		}else {
			repetidor = "no es repetidor";
		}
		return repetidor;
	}

	public String toString() {
		return super.toString()+"S Cursa " + curso + " de ESO y " + repetir() + ".";
	}
	
}
