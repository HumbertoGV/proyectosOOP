
public class comprobarNums implements IComprobar{
	
	private final String regex = "[0-9]+";
	
	@Override
	public boolean validar(String s) {
		return s.matches(regex);
	}

}