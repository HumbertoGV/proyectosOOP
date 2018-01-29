public class queen extends character{
	
	public queen(){
		setWeapon(new axeBehavior());
	}
	
	@Override
	public void fight(){
		System.out.println("La reina usa: " + getWeapon().useWeapon());
	}
	
}