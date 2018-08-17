package exam2016;

public class KeyValuePair2016<K, V extends Number> {
	private K key;
	private V value;
	
	public KeyValuePair2016(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	

}
