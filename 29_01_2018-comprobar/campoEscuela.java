public class campoEscuela extends comprobar{
	
	public campoEscuela(){
		setComprobacion(new comprobarLetras());
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