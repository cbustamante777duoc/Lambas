package Practica3;



public class Main {

	public static void main(String[] args) {
		// ejecucion del metodo Calcular estableciendo lo que va a hacer
		Calcular((numero1,numero2)->numero1+numero2);
		Calcular((numero1,numero2)->numero1-numero2);
		Calcular((numero1,numero2)->numero1/numero2);
		Calcular((numero1,numero2)->numero1*numero2);
		
		
	}
	
	public static void Calcular(Ioperable3 ioperable3) {
		
		int numero1 = 999;
		int numero2 = 99;
	   	int resultado = ioperable3.Calculadora(numero1, numero2); 
		
		System.out.println("total es"+ resultado);
	}

}
