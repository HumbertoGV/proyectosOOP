public class Main {
	public static void main(String[] args) {
		Invoker i = new Invoker();
		
		i.setCommand(new GarageDown(new Garage()));
		i.setCommand(new LightOn(new Light()));
		i.setCommand(new TVOn(new TV()));
		i.setCommand(new LightOff(new Light()));
		i.setCommand(new TVOff(new TV()));	
		i.setCommand(new GarageUp(new Garage()));		
		i.press(1);
		i.press(2);
		i.press(3);
		i.press(4);
		i.press(5);
		i.press(6);
		
		i.undo();
	
	}

}