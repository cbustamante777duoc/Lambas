package Practica;

public class Main {

	public static void main(String[] args) {
		// ft es la interfaz
		OperacionesP ft = () -> System.out.println("metodo saludo");
		// ft.Saludar();
	    
		Main m = new Main();
		m.Saludar(ft);

	}
	
	public void Saludar(OperacionesP parametro) {
		parametro.Saludar();
	}

}
