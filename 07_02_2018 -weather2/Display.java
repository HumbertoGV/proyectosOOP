import java.util.Observable;
import java.util.Observer;

public class Display implements Observer{

	private float temperature, humidity, pressure;
	
	@Override
	public void update(Observable observador, Object o) {
		if(observador instanceof WeatherData){
			
			 temperature = ((WeatherData) o).getTemp();
			 humidity = ((WeatherData) o).getHum();
			 pressure = ((WeatherData) o).getPress();
			 
			System.out.printf("\n"+"New Display: " + "\n" + "Temperature: "+ temperature + "\n" + "Humidity: " +  humidity + "\n"+ "Pressure: "+pressure +"\n");
		}
		else
			System.out.println("Same display");	
	}
}