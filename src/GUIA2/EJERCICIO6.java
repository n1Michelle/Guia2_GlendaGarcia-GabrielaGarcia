/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUIA2;
import java.util.Scanner;
/**
 *CREE UNA APLICACION EN JAVA QUE IMPRIMA LOS PRIMEROS
 *NUMEROS PRIMOS
 * @author Michelle Garcia
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean primo;
        int cantidad = 100;
        int contador = 0;
        int numero = 2;
        int i;
        while (contador < cantidad ){
            primo = true;
            
            for (i = 2; i < numero; i++){
                if(numero % i ==0){
                    primo = false;
                    break;
                }
            }
            
            if(primo){
                System.out.println(numero);
                contador++;
            }
            
            numero ++;
        }
    }
    
}
