import java.util.List;

public class Datos extends Cliente {
	public Datos(String nom){
		super(nom);
	}
	
	public void Actualizar(List<Paqueteria> paquetes){
		for (Paqueteria p : paquetes){
			if (p.getNombreC() == this){
				System.out.println("ID pack: " + p.getId()+", Dueño: " + p.getNombreC().nombre + ", Contenido: " + p.getPack());
				System.out.println("-Refresh-\n");
			}
		}
	}
}