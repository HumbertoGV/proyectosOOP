import java.util.*;

class Comandante implements Command{
	
	List<Command> commands = new ArrayList<Command>();

	public Comandante(ArrayList<Command> c){
		this.commands = c;
	}

	public void execute(){
		for(Command c:commands)
			c.execute();
	}
	public void undo(){
		for(Command c:commands)
			c.undo();
	}

	
}