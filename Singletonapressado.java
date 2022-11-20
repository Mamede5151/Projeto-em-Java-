package Singleton;

// Apressado aprendido na dio

public class Singletonapressado {

	
	// Apressado aprendido na dio
	
	private static Singletonapressado instancia = new Singletonapressado();
	
	private Singletonapressado() {
		super();
		
	}
	public static Singletonapressado getInstancia() {
			return instancia;
	}



}
