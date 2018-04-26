public class HomeTheaterFacade {

	DVDplayer dvd;
	Projector proyector;
	TheatherLights luz;
	CDplayer cd;
	Popcorns palomas;
	Screen pantalla;

	public HomeTheaterFacade(DVDplayer d, Projector p,TheatherLights t,CDplayer c,Popcorns pop,Screen s){
		this.dvd = d;
		this.proyector= p;
		this.luz = t;
		this.cd = c;
		this.palomas = pop;
		this.pantalla = s;
	}

	

	public void watchMovie(){
		dvd.On();
		dvd.Insert();
		dvd.Play();
		proyector.On();
		pantalla.Down();
		palomas.On();
		palomas.Pop();
		luz.Off();
	}


	public void endMovie(){
		luz.On();
		dvd.Eject();
		dvd.Off();
		proyector.Off();
		palomas.Off();
		pantalla.Up();
	}

	public void Cotorreo(){
		luz.On();
		palomas.On();
		palomas.Pop();
		cd.On();
		cd.Insert();
		cd.Play();
		pantalla.Down();
		proyector.On();
	
	}


}