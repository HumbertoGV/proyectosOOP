public class student extends persona{
	
	private habMotriz mov;
	int matricula;
	
	public student(habMotriz mov) {
		super(mov);
		this.mov = mov;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
}