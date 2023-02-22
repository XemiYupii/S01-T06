package n3exercici1;

public class App {

	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone();
		Generica generica = new Generica<> ();
		
		generica.telefonar(smartphone);
		generica.fotografiar(smartphone);
	}

}
/*El mètode limitat per la interfície Telefon, de la classe Generica, no pot cridar al mètode ferFotos(), ja que la interfície Telefon no defineix aquest mètode.
Els mètodes definits en una interfície són els únics mètodes que les classes que la implementen han de proporcionar.*/
