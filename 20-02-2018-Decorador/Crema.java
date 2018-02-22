public class Crema extends Ingredientes {

   private String size; 
   public Crema(Bebida ingredientesCafe, String size) {
      super(ingredientesCafe);	
      this.size = size;	
   }

  public double cost() { 
        return super.cost() + getSizePrice();
    }

    public double getSizePrice() {
      
         double priceSmall = 1;
         double priceMed = 1.5;
         double priceLar = 2;

         if(size == "small") { 
            return priceSmall * 5;
         } else {
            if (size == "medium" ) {
            return priceMed * 5;
          }
        }
         return priceLar * 5;
      }

    public String getIngredients() {
        return super.getIngredients() + ", Cremita";
    }
}

