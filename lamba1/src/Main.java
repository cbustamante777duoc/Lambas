
public class Main {

	public static void main(String[] args) {
	
		/* imaginate que tiene dos metodos que se llaman igual que son practicamente iguales
		 * entonce lo que se puede hacer es referenciarlos como se comtumbre
		 *
		 **/
		
		
		
		// implementacion de los metodos 
		  CalculadoraInt calculadoraInt = (numero1 , numero2) -> numero1+numero2;
		  
		  Calculadoradouble calculadoradouble = (numero1, numero2) -> numero1*numero2;
		  
		  // uso de los metodos anque ambos de llamen igual
		  calculate(calculadoradouble);
		  calculate(calculadoraInt);

	}
	
	// metodo que recibe una interface que de CalculadorDouble
	public static void calculate (Calculadoradouble cal) {
		
	}
	
	// metodo que recibe una interface que de CalculadorInt
	public static void calculate (CalculadoraInt cal) {
		
	}
	
	

}
