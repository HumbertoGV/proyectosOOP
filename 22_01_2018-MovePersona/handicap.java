public class handicap extends persona{
	
	public habMotriz mov;
	private String descripcion;
	
	public handicap(habMotriz mov) {
		super(mov);
		this.mov = mov;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
}