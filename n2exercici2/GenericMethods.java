package n2exercici2;

public class GenericMethods < K, U> {
	
	
	@SafeVarargs
	public static<K, U> void metodeGeneric (int element, U element2, K... element3) {
		System.out.println(element +"  "+ element2 +"  ");
		for (K e : element3) {
			System.out.println(e + " ");
		}
	}

}
