/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUIA2;
import java.util.Scanner;
/**
 *CREAR UNA CLASE QUE IMPRIMA LA SUMA DE DOS
 *NUMEROS SI SON IGUALES Y QUE CALCULE EL PRODUCTO
 *DE AMBOS SI SON DIFERENTES
 * @author Michelle Garcia
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        double a;
        double b;
        double suma;
        double producto;
        System.out.println("INGRESE EL PRIMER NUMERO ");
        a = mila.nextDouble();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        b = mila.nextDouble();
        
        if( a==b ){
            suma= a+b;
            System.out.println("LOS NUMEROS SON IGUALES. LA SUMA ES: " +suma);
        }else{
            producto= a*b;
            System.out.println("LOS NUMEROS SON DIFERENTES. EL PRODUCTO ES: " +producto);
        }
        
        
    }
    
}
