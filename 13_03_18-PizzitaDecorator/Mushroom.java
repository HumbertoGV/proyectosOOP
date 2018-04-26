public class Mushroom extends Ingredient{

	Pizza pizza;

	public Mushroom(Pizza ingredientesPizza){
	super(ingredientesPizza);
	}

	
	public String prepare(){
		return pizza.prepare() + " " + "with mushroom";
	}

	public String bake(){
		return pizza.bake() + " " + "with mushroom";
	}

	public String cut(){
		return pizza.cut() + " " + "with mushroom";
	}

	public String box(){
		return pizza.box() + " " + "with mushroom";
	}

	public String getIngredients(){
		return super.getIngredients() + ", honguito";
	}

}