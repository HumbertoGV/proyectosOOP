public class campoTel extends comprobar{
	
	public campoTel(){
		setComprobacion(new comprobarNums());
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