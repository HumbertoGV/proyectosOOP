public class PizzaPeperoni implements Pizza {

	public String prepare() {
		return "Preparing Peperoni Pizza";
	}

	public String  bake() {
		return "Baking Peperoni Pizza";
	}	

	public String cut() {
	 return "Cutting Peperoni Pizza";
	}	

	public String box() {
		return "Boxing Peperoni Pizza";
	}

	 public String getIngredients() {
        return "Peperoni";
    }


}