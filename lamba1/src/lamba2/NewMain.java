
package lamba2;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones operaciones = (numero1, numero2)  -> System.out.println( "el parametro es : "+numero1+" el parametro dos es: "+numero2);
        
     //   operaciones.Suma(7, 8);
          
        NewMain main = new NewMain();
        
        main.miMetodo(operaciones, 69, 77);
    }
    
    public  void miMetodo(Operaciones operaciones, int numero1, int numero2){
        operaciones.Suma(numero1, numero2);
    }
}
