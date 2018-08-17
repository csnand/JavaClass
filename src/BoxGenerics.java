
public class BoxGenerics<T> {
	
	private T item;
	
	public BoxGenerics(T o) {
		item = o;
	}
	
	public void set(T o) {
		item = o;
	}
	
	public T get() {
		return item;
	}

}
