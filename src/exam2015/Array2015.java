package exam2015;

import java.util.ArrayList;

public class Array2015<T> {
	private ArrayList<T> values;
	private int counter;
	
	public Array2015(int size) {
		values = new ArrayList<T>();
		counter = 0;
	}
	
	public void add(T o) {
		values.add(o);
		counter++;
	}
	
	public T get(int i) {
		return values.get(i);
	}


}
