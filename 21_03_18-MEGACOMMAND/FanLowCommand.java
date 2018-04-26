public class FanLowCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public FanLowCommand(CeilingFan cf) {
		this.ceilingFan = cf;
	}
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}
	public void undo() {
		if(ceilingFan.getSpeed() == 3){
			ceilingFan.medium();
		}
		else if(ceilingFan.getSpeed() == 2){
			ceilingFan.low();
		}
		else if(ceilingFan.getSpeed() == 1){
			ceilingFan.off();
		}
		else{
			ceilingFan.off();
		}

		}
	}
