public class TVOn implements Command {

	TV tv;

	public TVOn(TV t){
		this.tv = t;
	}

	public void execute(){
		tv.On();
	}

	public void undo(){
		tv.Off();
	}
}