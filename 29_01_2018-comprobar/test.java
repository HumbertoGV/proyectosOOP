import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		comprobar email = new campoEmail();
		comprobar nombre = new campoNombre();
		comprobar tel = new campoTel();
		comprobar matricula = new campoEmail();
		comprobar escuela = new campoEscuela();
		
		@SuppressWarnings("resource")

		
		Scanner skanni = new Scanner(System.in);
		
		
		System.out.print("Dame EMAIL: ");
		String input = skanni.nextLine();
		email.validar(input);

		 

		

		
		
		
		
		/* 
		System.out.println();
		
		System.out.print("Dame NOMBRE: ");
		input = skanni.nextLine();
		nombre.validar(input);
		
		System.out.println();
		
		System.out.print("Dame TEL: ");
		input = skanni.nextLine();
		tel.validar(input);
		
		System.out.println();
		
		System.out.print("Dame MATRICULA: ");
		input = skanni.nextLine();
		matricula.validar(input);
		
		System.out.println();
		
		System.out.print("Dame ESCUELA: ");
		input = skanni.nextLine();
		escuela.validar(input);
		*/ 
	}

	
}