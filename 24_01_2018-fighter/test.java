public class test {

	public static void main(String[] args) {

		character king = new king();
		king.fight();

		System.out.println();

		character queen = new queen();
		queen.fight();
		
		System.out.println();


		character knight = new knight();
		knight.fight();
		System.out.println("Caballero cambia de arma");
		knight.setWeapon(new bowAndArrowBehavior());
		knight.fight();	
		
		System.out.println();
		
		character troll = new troll();
		troll.fight();
		
		System.out.println();
		
		
	}

}