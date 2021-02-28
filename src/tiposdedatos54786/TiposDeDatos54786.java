/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos54786;

/**
 *
 * @author carol
 */
public class TiposDeDatos54786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Maximos y Minimos de los tipos de datos
        System.out.println("Dato int");
        int intminimo = -2147483648;
        int intmaximo = 2147483647;
         
        System.out.println("El minimo es:" + intminimo);
        System.out.println("El maximo es:" + intmaximo); 
        
        System.out.println("Dato byte");
        byte minimo = -128;
        byte maximo = 127;
        
        System.out.println("El minimo es:" + minimo);
        System.out.println("El maximo es:" + maximo);
        
        System.out.println("Dato short");
        short shortminimo = -32768;
        short shortmaximo = 32767;
        
        System.out.println("El minimo es:" + shortminimo);
        System.out.println("El maximo es:" + shortmaximo);
        
        System.out.println("Dato Long");
        long longminimo = -9223372036854775808L;
        long longmaximo = -9223372036854775807L;
        
        System.out.println("El minimo es:" + longminimo);
        System.out.println("El maximo es:" + longmaximo);
        
        System.out.println("Dato Double");
        double doubleminimo = 1.79769313486231570E+308;
        double doublemaximo = 4.94065645841246544E-324;
        
        System.out.println("El minimo es:" + doubleminimo);
        System.out.println("El maximo es:" + doublemaximo);
    }
    
}
