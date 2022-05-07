package es.prg.instituto;

import es.prg.instituto.AlumnoFp.Grado;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Andrea","Gonz�lez","Fern�ndez","71467295Q");
		System.out.println(persona1.toString());
		System.out.println();
		
		Profesor profesor1 = new Profesor("Andrea","Gonz�lez","Fern�ndez","71467295Q", 1710, "matem�ticas");
		System.out.println(profesor1.toString());
		System.out.println();
		
		ProfesorInterino profesorInt1 = new ProfesorInterino("Andrea","Gonz�lez","Fern�ndez","71467295Q", 1710, "matem�ticas", "19/03/2022", "26/06/2022");
		System.out.println(profesorInt1.toString());
		System.out.println();
		
		ProfesorTitular profesorTit1 = new ProfesorTitular("Andrea","Gonz�lez","Fern�ndez","71467295Q", 1710, "matem�ticas", "Ies San Andr�s", 2022);
		System.out.println(profesorTit1.toString());
		System.out.println();
		
		Alumno alumno1 = new Alumno("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A");
		System.out.println(alumno1.toString());
		System.out.println();
		
		AlumnoBachiller alumnoBach1 = new AlumnoBachiller("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "primero", false);
		System.out.println(alumnoBach1.toString());
		System.out.println();
		
		AlumnoBachillerInt alumnoBachInt1 = new AlumnoBachillerInt("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "primero", false, "Estonia", 6);
		System.out.println(alumnoBachInt1.toString());
		System.out.println();
		
		AlumnoEso alumnoEso1 = new AlumnoEso("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "tercero", true);
		System.out.println(alumnoEso1.toString());
		System.out.println();
		
		AlumnoBachillerInt alumnoEsoInt1 = new AlumnoBachillerInt("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "tercero", true, "Francia", 9);
		System.out.println(alumnoEsoInt1.toString());
		System.out.println();
		
		AlumnoFp AlumnoFp1 = new AlumnoFp("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "segundo", Grado.medio, false);
		System.out.println(AlumnoFp1.toString());
		System.out.println();
		
		AlumnoFpInt AlumnoFpInt1 = new AlumnoFpInt("Andrea","Gonz�lez","Fern�ndez","71467295Q", 12345, "21A", "segundo", Grado.medio, false, "Portugal", 3);
		System.out.println(AlumnoFpInt1.toString());
	}

}
