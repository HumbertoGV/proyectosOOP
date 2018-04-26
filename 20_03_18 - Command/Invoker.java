public class Invoker {
	Command command;

	public void setCommand(Command c){
		this.command = c;
	}

	public void press(){
		command.execute();
	}

	public void undo(){
		command.undo();
	}
}