public class GarageUp implements Command {
	Garage garage;
	public GarageUp(Garage g) {
		this.garage = g;
	}
 
	public void execute() {
		garage.Up();

	}
 
	public void undo() {
		garage.Down();

	}
}