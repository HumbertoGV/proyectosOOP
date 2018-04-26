public abstract class Ingredient implements Pizza {
	protected Pizza ingredientesPizza;

	   public Ingredient(Pizza ingredientesPizza){
      this.ingredientesPizza= ingredientesPizza;
   }

    public String getIngredients() {
        return ingredientesPizza.getIngredients();
    }
}

	