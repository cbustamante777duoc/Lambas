
public class Principal {

	public static void main(String[] args) {
		System.out.println(resolver().calcular(70.0, 5.2));
		System.out.println(resolver2().calcular(10,2));

	}
	
	
	// implementacion de la interfaz metodo que recibe double
	private static Calculadoradouble resolver() {
		return (numero1,numero2) -> numero1/numero2; 
	}
    
	// implementacion de la interfaz metodo que recibe int
	private static CalculadoraInt resolver2() {
		return (numero1,numero2) -> numero1/numero2; 
	}
}
