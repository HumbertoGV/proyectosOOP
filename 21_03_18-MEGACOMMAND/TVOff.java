public class TVOff implements Command {
	TV tv;
	public TVOff(TV t) {
		this.tv = t;
	}
 
	public void execute() {
		tv.Off();
	}
 
	public void undo() {
		tv.On();
	}
}