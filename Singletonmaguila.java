package Singleton;

// Singleton do curso da Dio
public class Singletonmaguila {
	
	private static Singletonmaguila instancia;
	
	private Singletonmaguila() {
		super();
		
	}
	public static Singletonmaguila getInstancia() {
		if (instancia == null) {
				instancia = new Singletonmaguila();
		}
		return instancia;
	}

}
