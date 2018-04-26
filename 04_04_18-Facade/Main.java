public class Main{
	public static void main(String args[]){

		DVDplayer dvd = new DVDplayer();
		Projector proyector = new Projector();
		TheatherLights luz = new TheatherLights();
		CDplayer cd = new CDplayer();
		Popcorns palomas = new Popcorns();
		Screen pantalla = new Screen();

		HomeTheaterFacade facade = new HomeTheaterFacade(dvd,proyector,luz,cd,palomas,pantalla);
		


			System.out.println("Quiero wachar una movie");
			facade.watchMovie();
			System.out.println("");

			System.out.println("Ya se acabo, apagate");
			facade.endMovie();
			System.out.println("");

			System.out.println("No tengo ganas de ver una movie, mejor hay que ver videos musicales");
			facade.Cotorreo();
		}
} 