package es.prg.instituto;

public class AlumnoFp extends Alumno{
	
	public static enum Grado{
		medio, superior
	}
	
	private String curso;
	private Grado grado;
	private boolean repite;
	
	public AlumnoFp() {
		super();
		curso = "";
		grado = Grado.medio;
		repite = false;
	}

	public AlumnoFp(String nombre, String apellido1, String apellido2, String dni, int numMatricula, String aula,
			String curso, Grado grado, boolean repite) {
		super(nombre, apellido1, apellido2, dni, numMatricula, aula);
		this.curso = curso;
		this.grado = grado;
		this.repite = repite;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
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
		return super.toString()+" Cursa " + curso + " de FP de grado "+grado+" y " + repetir() + ".";
	}
	
}
