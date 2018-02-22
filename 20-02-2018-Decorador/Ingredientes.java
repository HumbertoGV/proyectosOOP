public abstract class Ingredientes implements Bebida {
	   protected Bebida ingredientesCafe;


     public Ingredientes(Bebida ingredientesCafe){
      this.ingredientesCafe = ingredientesCafe;
   }
    public double cost() { 
        return ingredientesCafe.cost();
    }

    public String getIngredients() {
        return ingredientesCafe.getIngredients();
    }

    	/*public Size getSize() {
		return ingredientesCafe.size;
	}*/
}
	
