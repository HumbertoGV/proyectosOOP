
public class pruebaPiloto {

	public static void main(String[] args) {
		
		//Persona normal - estudiante
		persona student = new student(new MotrizMov());
		
		student.setEdad(20);
		student.setNombre("Beto");
		student.setGenero("Hombre");

		System.out.println(student.getNombre());
		System.out.println(student.getEdad());
		System.out.println(student.getGenero());
		
		System.out.println(student.motrizManos());
		System.out.println(student.motrizPies());
		System.out.println(student.motrizNulo());




		
		// movimiento nulo - handicap	
		persona hc = new handicap(new MotrizNull());
		
		hc.setEdad(19);
		hc.setNombre("Chambers");
		hc.setGenero("Mujer");
		
		System.out.println();
		
		System.out.println(hc.getNombre());
		System.out.println(hc.getEdad());
		System.out.println(hc.getGenero());

		System.out.println(hc.motrizPies());
		System.out.println(hc.motrizManos());
		System.out.println(hc.motrizNulo());

	}

}