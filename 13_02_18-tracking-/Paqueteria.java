public class Paqueteria {
	private String id;
	private Cliente nombreC;
	private String pack;
	
	public Paqueteria(Cliente nombreC,String id, String pack){
		
		this.id = id;
		this.nombreC = nombreC;
		this.pack = pack;
	}

	public String getId(){
		return id;
	}
	
	public String getPack(){
		return pack;
	}
	
	public Cliente getNombreC(){
		return nombreC;
	}
}