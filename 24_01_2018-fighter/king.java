public class king extends character{
	
	public king(){
		setWeapon(new swordBehavior());
	}
	
	@Override
	public void fight(){
		System.out.println("El rey usa: " + getWeapon().useWeapon());
	}
	
}