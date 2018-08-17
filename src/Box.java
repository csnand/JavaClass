
public class Box {
	
	private Object item;
	
	public Box(Object o) {
		item = o;
	}
	
	public void set(Object o) {
		item = o;
	}
	
	public Object get() {
		return item;
	}

}
