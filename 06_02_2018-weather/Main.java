public class Main {

	public static void main(String[] args) {

		WeatherData wd = new WeatherData();
		DisplayA displayA = new DisplayA();
		DisplayB displayB = new DisplayB();
		DisplayC displayC = new DisplayC();

		
		wd.setHum(10);
		wd.setTemp(10);
		wd.setPress(12);
		
		displayA.update(10, 12, 10);
		displayA.show();

		displayB.update(5,6, 9);
		displayB.show();

		displayC.update(8, 3, 11);
		displayC.show();
	}
}