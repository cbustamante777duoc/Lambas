/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamba3;


public class LambaTest3 {

   
    public static void main(String[] args) {
        // implementado el metodo lamba
        Motor((numero1,numero2) -> numero1+numero2);
        Motor((numero1,numero2) -> numero1/numero2);
        Motor((numero1,numero2) -> numero1-numero2);
        Motor((numero1,numero2) -> numero1*numero2);
        
    }
    
    public  static void Motor(Calculadora calculadora){
       // numeros los cuales van ser usado como parametros
        int numero1= 77;
        int numero2=36;
        // la suma de ambos numeros van a ser guardado en resultado
        int resultado = calculadora.Calcular(numero1, numero2);
        
        System.out.println("el resultado es"+resultado);
    }
    
}
