public class Main {
	public static void main(String[] args) {
		Invoker i = new Invoker();
		
		i.setCommand(new GarageDown(new Garage()));
		i.press();
		i.undo();
		i.setCommand(new TVOn(new TV()));
		i.press();
		i.undo();
	}

}