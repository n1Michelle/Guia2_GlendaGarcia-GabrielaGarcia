/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Michelle Garcia
 */
public class EJERCICIO2 {

    /**
     * CREAR UNA CLASE QUE CALCULE EL AREA DE UN RECTANGULO,
     * IMPRIMIR RESULTADOS
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner mila = new Scanner(System.in);
       double base;
       double altura;
       double area;
       
       System.out.println("INGRESE LA BASE DEL RECTANGULO");
       base = mila.nextDouble();
       System.out.println("INGRESE LA ALTURA DEL RECTANGULO");
       altura = mila.nextDouble();
       
       area = base * altura;
       
       System.out.println("LA BASE ES DE: "+base);
       System.out.println("LA ALTURA ES DE: " +altura);
       System.out.println("EL AREA DEL RECTANGULO ES DE: " +area);
       
    }
    
}
