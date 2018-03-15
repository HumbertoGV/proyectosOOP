public class Main {

	public static void main(String[] args) {

		FactoryA dominos = new FactoryA();
		dominos.orderPizza("Veggie");
		System.out.println("");
		dominos.orderPizza("peperoni");
	}
}