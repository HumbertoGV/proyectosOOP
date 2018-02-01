import java.util.Scanner;
import java.util.regex.*;

public class campoEmail extends comprobar{
	
	public campoEmail(){
		setComprobacion(new comprobarEmail());
	}
	
	@Override
	public void validar(String s){
		if(getComprobacion().validar(s)){
			System.out.println("Campo validado");
		}
		else{
			System.out.println("Campo invalido");
		}
	}
	
}