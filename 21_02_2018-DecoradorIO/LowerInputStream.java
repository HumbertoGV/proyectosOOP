import java.io.*;

public class LowerInputStream extends FilterInputStream{
	public LowerInputStream(InputStream in){
		super(in);
	}
	public int read() throws IOException{

		int i = super.read();
		if(i<0){
			return i;
		}
		return (Character.toLowerCase((char) i));
	}

}