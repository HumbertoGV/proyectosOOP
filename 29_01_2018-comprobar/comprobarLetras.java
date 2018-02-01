import java.util.regex.Pattern;

public class comprobarLetras implements IComprobar{

	@Override
	public boolean validar(String s) {
		if(Pattern.matches("[a-zA-Z]+", s)) {
			return true;
		} 
			else
				return false;
	}
}


