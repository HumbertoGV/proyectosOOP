import java.util.Scanner;
import java.util.regex.*;

public class comprobarEmail implements IComprobar{
	@Override
	public boolean validar(String s) {
    
        Scanner skanni = new Scanner(System.in);
        s = skanni.nextLine();

       
        Pattern p = Pattern.compile("^[A-Za-z0-9-]+(\\-[A-Za-z0-9])*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9])");
        Matcher m = p.matcher(s);

        if (m.find()){
			return true;
	    }
        else{
            return false;
        }
    }
}
        
    










