import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;


public class Main {
	public static void main(String[] args){
		
		Datos c1 = new Datos("Beto");
		Datos c2 = new Datos("Pepe");
		Provedor correosMexico = new Provedor("correos",5);
		Provedor dhl = new Provedor("dhl",3);
		Provedor fedex = new Provedor("fedex",4);
	
		c1.Registrar(fedex,"Fedex "+generateID(),"Laptop");
		c1.Registrar(correosMexico,"CorreosMX "+generateID(), "TV");
		c2.Registrar(dhl,"DHL "+generateID(),"PlayStation IV");

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		    @Override
		    public void run() {
		    	correosMexico.Estado();
		    	dhl.Estado();
				fedex.Estado();
				}
		    }, 0, 2000);
		}

		public static String generateID() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
