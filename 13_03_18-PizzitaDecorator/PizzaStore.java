public abstract class PizzaStore {

	
public Pizza orderPizza(String nombre) {
		
		Pizza pizza = createPizza(nombre);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		pizza.getIngredients();
		
		return pizza;
	}

	public abstract Pizza createPizza(String type);	


}