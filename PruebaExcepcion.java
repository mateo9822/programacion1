/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepcion;

/**
 *
 * @author Mateo
 */
public class PruebaExcepcion{  
	
public static void main(String args[]){
//formatoNumero();
desborde();
//aritmetico();
}   

//excepción sin tratar 
//excepción tratada
public static void formatoNumero(){
 
 int numero;   
 String cadena="  1";   
    try{   
        numero = Integer.parseInt(cadena);   
    }catch(NumberFormatException ex){   
        System.out.println("No es un número, es una cadena de texto."+ex.getMessage());   
 	}   
   }
public static void desborde(){
int v[]= new int[3];
    try{
        for(int i =0; i<5;i++){
        v[i]=i;
        }                  
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Desbordad el valor del arreglo "+e.getMessage());
    }
}
public static void aritmetico(){
 
int numero=5, resultado;
    try{
     resultado= numero/0;   
    }catch(ArithmeticException ex){
        System.out.println("NO SE PUEDE DIVIR EN 0 "+ex.getMessage());   
    }
    }

}
