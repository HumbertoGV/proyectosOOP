public class Main {
    
	public static void main(String[] args){
        
		WeatherData wd = new WeatherData(20, 12, 30);
		Display display = new Display();
		
		wd.addObserver(display);
		
		wd.setTemp(15);
		wd.setHum(9);
		wd.setPress(40);
    }
}