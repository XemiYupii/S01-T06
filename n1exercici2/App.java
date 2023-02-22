package n1exercici2;

public class App {

	public static void main(String[] args) {
		
		Persona persona = new Persona ("Gemma", "Zamora", 36);
		Persona persona2 = new Persona ("Jordi", "Torrent", 6);
		
		GenericMethods.metodeGeneric(persona, "hola", 3);
		GenericMethods.metodeGeneric(16, persona2, "flor");
	}

}
