public class PizziPeperoni extends Pizza{

	@Override
	public void prepare() {
		System.out.println("Preparing Peperoni Pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking peperoni pizza");
	}	

	@Override
	public void cut() {
		System.out.println("Cutting Veggie Pizza");
	}

	@Override
	public void box() {
		System.out.println("Boxing Veggie Pizza");
	}

}