/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUIA2;
import java.util.Scanner;
/**
 *CREAR UNA CLASE QUE CALCULE LA HIPOTENUSA DE UN TRIANGULO
 *(INVESTIGUE LAS FUNCIONES PARA SACAR RAIZ CUADRADA Y PONENCIAS)
 * @author Michelle Garcia
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        System.out.println("INGRESE LA MEDIDA DEL CATETO 1");
        cateto1= mila.nextDouble();
        System.out.println("INGRESE LA MEDIDA DEL CATETO 2");
        cateto2= mila.nextDouble();
        
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("LA HIPOTENUSA ES DE: " +hipotenusa);
        
    }
    
}
