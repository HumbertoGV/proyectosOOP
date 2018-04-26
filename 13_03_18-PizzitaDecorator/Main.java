public class Main {

	public static void main(String[] args) {

		PizzaStore dominos = new FactoryA();
		Pizza pizzita = dominos.createPizza("peperoni");
		pizzita.getIngredients();

	
	}
	

}
