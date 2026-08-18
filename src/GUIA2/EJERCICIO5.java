/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUIA2;
import java.util.Scanner;
/**
 *CREE UNA APLICACION EN JAVA QUE PERMITA CALCULAR 
 *LA FACTORIAL DE UN NUMERO ENTERO
 * @author Michelle Garcia
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        int numero;
        
        System.out.println("INGRESE UN NUMERO ENTERO POSITIVO: ");
        numero= mila.nextInt();
        
        if(numero < 0){
            System.out.println("EL FACTORIAL NO ESTA DEFINIDO PARA NUMERO NEGATIVOS");
        }else{
            long factorial = 1;
            
            for(int i = 1; i<= numero; i++){
                factorial *=i;
            }
            
            System.out.println("EL FACTORIAL DE " +numero+ " ES: "+factorial);
        }
    }
    
}
