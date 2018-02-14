import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Display> observers = new ArrayList<Display>();
	float temperature;
	float humidity;
	float pressure;
	
	public float getTemp(){
		return this.temperature;
	}
	
	public float getHum(){
		return this.humidity;
	}

	public float getPress(){
		return this.pressure;
	}
	
	public float setTemp(float t){
		return this.temperature = t;
	}
	
	public float setHum(float h){
		return this.humidity = h;
	}
	
	public float setPress(float p){
		return this.pressure = p;	
	}
	
	public void addObserver(Display d) {
		      observers.add(d);
	}
	public void removeObserver(Display d) {
		observers.remove(d);
		
	}
	public void advise() {
		for (Display observer : observers) {
	         observer.update(temperature, humidity,pressure);
	      }
	}
	
	public void  MChanges(float temp, float hum, float press){
		this.temperature = temp;
		this.humidity = hum;
		this.pressure = press;
	
		advise();	
	}
}