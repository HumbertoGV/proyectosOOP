public class LightOn implements Command {

	Light light;
	
	public LightOn(Light l) {
		this.light = l;
	}
 
	public void execute() {
		light.On();
	}
 
	public void undo() {
		light.Off();
	}
}