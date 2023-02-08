package exercici1;

public class App {

	public static void main(String[] args) {
		
		String nom = "Gemma";
		String primerCognom = "Zamora";
		String segonCognom = "Vilalta";
		
		NoGenericMethods persona = new NoGenericMethods ("Gemma","Zamora","Vilalta");
		NoGenericMethods persona2 = new NoGenericMethods("Zamora","Gemma","Vilalta");
		NoGenericMethods persona3 = new NoGenericMethods("Vilalta","Gemma","Zamora");
		NoGenericMethods persona4 = new NoGenericMethods(primerCognom, nom, segonCognom);
		NoGenericMethods persona5 = new NoGenericMethods(segonCognom, primerCognom, nom);
		
		System.out.println(persona5);
		System.out.println(persona2);
	}

}
