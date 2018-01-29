public abstract class character {
	
	private IWeaponBehavior weapon;
	
	
	public void setWeapon(IWeaponBehavior weapon){
		this.weapon = weapon;
	}

	public IWeaponBehavior getWeapon(){
		return weapon;
	}

	
	public void fight(){
		
	}
	
	
	
}