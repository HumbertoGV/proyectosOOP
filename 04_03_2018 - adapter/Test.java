public class Test {
	
	public static void main(String args[]){
		Dog perron = new DoggeableC();
		perron.bite();
		perron.bark();
		System.out.println("");
		Dog perron1 = new DoggeableT();
		perron1.bite();
		perron1.bark();
	}
}