package Singleton;

public class SingletonHolderpapai {
	
	private static SingletonHolderpapai instancia;
	private static class Holder{
		public static SingletonHolderpapai instancia = new SingletonHolderpapai();
	}
	private SingletonHolderpapai() {
		super();
		
	}
	public static SingletonHolderpapai getInstancia() {
		if (instancia == null) {
				instancia = new SingletonHolderpapai();
		}
		return instancia;
	}

}
