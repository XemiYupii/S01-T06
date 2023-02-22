package n2exercici2;

public class GenericMethods < K> {
	
	
	@SafeVarargs
	public static<K> void metodeGeneric (K... element) {
		for (K k : element) {
			System.out.println(k);
		}
		
	}

}
