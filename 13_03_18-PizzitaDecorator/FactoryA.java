public class FactoryA extends PizzaStore {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = new PizzaPeperoni();

		if(type.equals("Peperoni")) {
				pizza = new PizzaPeperoni();
		} else if(type.equals("Veggie")){
				pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}