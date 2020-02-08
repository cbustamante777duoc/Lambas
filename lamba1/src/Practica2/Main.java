package Practica2;

public class Main {

	public static void main(String[] args) {
	  //implemetacion del metodo
		IOperable iop = (int n1, int n2) -> System.out.println(" numero: "+n1+" "+" numero : "+n2);
		
		//iop.OperacionDosParametros(20, 5);
		
		Main main = new Main();
		main.Mimetodo(iop, 5, 3);
	}

	
	
	public void Mimetodo(IOperable iOperable, int n1, int n2) {
		iOperable.OperacionDosParametros(n1, n2);
	}

}
