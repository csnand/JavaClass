
public class Utils {
	
	public static boolean compare(Pair p1, Pair p2) {
		return p1.getKey().equals(p2.getKey()) &&
			   p2.getValue().equals(p2.getValue());
	}
	
	public static <K, V> boolean compareGenerics(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) &&
			   p2.getValue().equals(p2.getValue());
	}

}
