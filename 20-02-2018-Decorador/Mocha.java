public class Mocha extends Ingredientes {

   private String size; 
   public Mocha(Bebida ingredientesCafe, String size) {
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
            return priceSmall * 8;
         } else {
            if (size == "medium" ) {
            return priceMed * 8;
          }
        }
         return priceLar * 8;
      }

    public String getIngredients() {
        return super.getIngredients() + ", Mocha";
    }
}

