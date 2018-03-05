import java.util.ArrayList;
import java.util.List;

public class Provedor implements IProvedor {
	
	List<Paqueteria> ListaPaquetes;
	List<Cliente> ListaClientes;
	String Prov;
	int segProv; 
	int time;
	
	public Provedor(String prov, int seg){
		this.Prov = prov;
		ListaPaquetes = new ArrayList<Paqueteria>();
		ListaClientes = new ArrayList<Cliente>();
		this.segProv = seg;
	}
	
	public void AgregarPack(Cliente c, String id, String pack){
		Paqueteria addP = new Paqueteria(c, id, pack);
		ListaPaquetes.add(addP);
	}

	@Override
	public void AgregarCliente(Cliente c) {
		ListaClientes.add(c);
	}

	@Override
	public void RemoverCliente(Cliente c) {
		ListaClientes.remove(c);	
	}
	
	@Override
	public void notifyUsers() {
		for (Cliente user : ListaClientes){
			user.Actualizar(ListaPaquetes);
		}	
	}

	public void Estado(){
		time++;
		if(time >= segProv){
			notifyUsers();
			time=0;
		}
	}
}