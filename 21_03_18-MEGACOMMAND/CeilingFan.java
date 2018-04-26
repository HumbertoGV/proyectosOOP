
public class CeilingFan {
	int level;
	
 
	public CeilingFan() {
		this.level=0;
	}
  
	public void high() {
		level = 3;
		System.out.println("CeilingFan esta FUERTE");
 
	} 

	public void medium() {
		level = 2;
		System.out.println("CeilingFan esta en Medio");
	}

	public void low() {
		level = 1;
		System.out.println("CeilingFan esta bajo");
	}
 
	public void off() {
		level = 0;
		System.out.println("CeilingFan apagado");
	}
 
	public int getSpeed() {
		return level;
	}
}