public class GarageDown implements Command {

	Garage garage;

	public GarageDown(Garage g){
		this.garage = g;
	}

	public void execute(){
		garage.Down();
	}

	public void undo(){
		garage.Up();
	}
}