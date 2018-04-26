public class VeggiePizza implements Pizza {

	public String prepare() {
		return "Preparing Veggie Pizza";
	}

	public String  bake() {
		return "Baking Veggie Pizza";
	}	

	public String cut() {
	 return "Cutting Veggie Pizza";
	}	

	public String box() {
		return "Boxing Veggie Pizza";
	}

	 public String getIngredients() {
        return "Veggie";
    }


}