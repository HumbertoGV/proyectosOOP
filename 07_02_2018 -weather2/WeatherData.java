import java.util.Observable;

public class WeatherData extends Observable {
	float temperature, humidity, pressure;

	public WeatherData(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.printf("Display: " + "\n" + "Temperature: "+ temperature + "\n" + "Humidity: " +  humidity + "\n"+ "Pressure: "+pressure +"\n");
	}
	
	public float getTemp(){
		return temperature;
	}
	
	public float getHum(){
		return humidity;
	}

	public float getPress(){
		return pressure;
	}
	
	public void setTemp(float t){
		this.temperature = t;
		setChanged();
		measureChanged(this);
	}
	
	public void setHum(float h){
		this.humidity = h;
		setChanged();
		measureChanged(this);
	}
	
	public void setPress(float p){
		this.pressure = p;
		setChanged();
		measureChanged(this);	
	}

	private void measureChanged(Observable observador){
			notifyObservers(observador);
		}
}