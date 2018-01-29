public class knight extends character{
	
	public knight(){
		setWeapon(new swordBehavior());
	}

	@Override
	public void fight(){
		System.out.println("Caballero usa: " + getWeapon().useWeapon());
	}
}