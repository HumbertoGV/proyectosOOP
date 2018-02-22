public class Main {
   public static void main(String[] args) {

      Bebida cafesito = new Cafe("small");
      cafesito = new Crema(cafesito,"small");

      //Bebida cafeTaco = new Cafe("large");
      //cafeTaco = new Mocha(cafeTaco,"large");

      Bebida mochaCafe = new Mocha(new Cafe("small"),"small");

      System.out.println("COSTAMOS");
      
      System.out.println("Ingredientes: "+ cafesito.getIngredients() + ". Precio: $"+cafesito.cost());

     // System.out.println("Ingredientes: "+ cafeTaco.getIngredients() + ". Precio: $"+cafeTaco.cost());

      System.out.println("Ingredientes: "+ mochaCafe.getIngredients() + ". Precio: $"+ mochaCafe.cost());

   }
}