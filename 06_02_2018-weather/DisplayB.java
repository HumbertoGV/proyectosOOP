public class DisplayB implements Display{
	
	private float temperature;
	private float humidity;
	private float pressure;

	@Override
	public void update(float t, float h, float p) {
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
	}
	
	public void show(){
		System.out.print("Display B:\n Temperature: " + temperature + "\n Humidity: " + humidity + "\n Pressure: " + pressure +"\n" );
	}
}