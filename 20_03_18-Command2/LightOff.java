public class LightOff implements Command {
	Light light;
	public LightOff(Light l) {
		this.light = l;
	}
 
	public void execute() {
		light.Off();
	}
 
	public void undo() {
		light.On();
	}
}