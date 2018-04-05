import java.util.*;
public class Test{
	public static void main (String args[]) {
		Vector<Object> v = new Vector<Object>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

		Enumeration<Object> enumerator = v.elements();
		Iterator<Object> iterator = new Adapter(enumerator);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
