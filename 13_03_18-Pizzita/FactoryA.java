public class FactoryA extends PizzaStore {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = new PizziPeperoni();

		if(type.equals("Peperoni")) {
				pizza = new PizziPeperoni();
		} else if(type.equals("Veggie")){
				pizza = new VeggiePizza();
		}
		
		return pizza;
	}

}