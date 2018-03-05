public interface IProvedor {
	public void AgregarPack(Cliente c,String id,String pack);
	public void AgregarCliente(Cliente c);
	public void RemoverCliente(Cliente c);
	public void notifyUsers();
}
