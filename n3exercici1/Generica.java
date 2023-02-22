package n3exercici1;

public class Generica <K, T> {
	
	public <T extends Telefon> void telefonar (T telefon) {
		telefon.trucar();
	}
	public <K extends Smartphone> void fotografiar (K smartphone) {
		smartphone.ferFotos();
	}

}
