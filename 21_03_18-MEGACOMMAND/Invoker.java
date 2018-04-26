import java.util.*;


public class Invoker {
	List<Command> slots = new ArrayList<Command>();
	Command slot;


	public void setCommand(Command command) {
		if(slots.size() > 8){
			System.out.println("Te pasaste");
		}
		else slots.add(command);
	}

	public void press(int s){
		slot = slots.get(s-1);
		slot.execute();
	}

	public void undo(){
		slot.undo();
	}
}