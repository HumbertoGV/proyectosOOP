public class Cafe implements Bebida {

	private String size;

   	public Cafe(String size) {
      this.size = size;	
   }

    public double cost() {
        return getSizePrice();
    }

    public double getSizePrice() {
      
         double priceSmall = 1;
         double priceMed = 1.5;
         double priceLar = 2;

         if(size == "small") { 
            return priceSmall * 20;
         } else {
            if (size == "medium" ) {
            return priceMed * 20;
          }
        }
         return priceLar * 20;
      }

    public String getIngredients() {
        return "Cafesito";
    }
}