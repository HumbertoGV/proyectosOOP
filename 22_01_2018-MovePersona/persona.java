public abstract class persona {
	private String nombre;
	private String genero;
	private int edad;
	
	private habMotriz mov;
	
	public persona(habMotriz mov){
		this.mov = mov;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	
	public void setEdad(int edad) {
		this.edad = edad;	
	}


	public int getEdad() {
		return this.edad;
	}

	
	public void setGenero(String genero) {
		this.genero = genero;	
	}
	
	public String getGenero() {
		return genero;
	}

	
	public String hablar(String coto) {
		return coto;
	}

	
	public void respirar() {
		System.out.println("Breathe");
	}

	
	public void brincar() {
		System.out.println("Brinca");
	}

public String motrizPies(){
		return this.mov.motrizPies();
	}

	public String motrizManos(){
		return this.mov.motrizManos();
	}
	
	
	public String motrizNulo(){
		return this.mov.motrizNulo();
	}
}