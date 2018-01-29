public class troll extends character{
	
	public troll(){
		setWeapon(new bowAndArrowBehavior());
	}
	
	@Override
	public void fight(){
		System.out.println("El troll usa: " + getWeapon().useWeapon());
	}
}