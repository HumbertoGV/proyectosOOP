import java.util.List;

public abstract class Cliente {
	String nombre;
	
	public void Registrar(IProvedor provedor,String id, String pack){
		provedor.AgregarPack(this,id,pack);
		provedor.AgregarCliente(this);
	}
	
	public Cliente(String nombre){
		this.nombre = nombre;
	}

	public void Actualizar(List<Paqueteria> listaPack) {
	}	
}