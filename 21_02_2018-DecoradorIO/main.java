import java.io.*;

public class main {
   public static void main(String[] args) {	
   	int c;
		try{
			InputStream in = new LowerInputStream(new BufferedInputStream(new FileInputStream("C://Users//HGV//Desktop//21_02_2018-DecoradorIO//test.txt")));

			
			while((c=in.read()) >= 0){

				System.out.print((char)c);
			}
			in.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}