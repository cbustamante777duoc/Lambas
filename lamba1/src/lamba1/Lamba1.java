
package lamba1;

public class Lamba1 {

   
    public static void main(String[] args) {
        // implementacion del metodo saludar de la interface 
        FuncionTest ft = () -> System.out.println("prueba desde lamba ");
        
        //uso del metodo saludar
       // ft.Saludar();
        
        //llamada de la clase main
        Lamba1 objeto = new Lamba1();
        //uso de metodo miMetodo()
        objeto.miMetodo(ft);
        
        
    }
    
    public void miMetodo(FuncionTest parametro){
     parametro.Saludar();
    }
    
}
