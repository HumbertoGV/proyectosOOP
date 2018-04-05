import java.util.*;

public class Adapter implements Iterator<Object>{

	Enumeration<Object> adaptee;
 
	public Adapter(Enumeration<Object> enumeration) {
		this.adaptee = enumeration;
	}
 
	public boolean hasNext() {
		return adaptee.hasMoreElements();
	}
 
	public Object next() {
		return adaptee.nextElement();
	}
 
	public void remove() {

	}
}