/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
/**
 *REALICE UNA SOLUCION QUE IMPRIMA "PAR" O "IMPAR" DESPUES
 *DE HABER LEIDO Y VERIFICADO UN NUMERO ENTERO
 * @author HP 450 G5
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        
        int numero;
        
        System.out.println("INGRESE UN NUMERO ENTERO");
        numero = mila.nextInt();
        
        if(numero % 2 ==0){
            System.out.println("EL NUMERO ES: "+numero+ " ES PAR");
        }else{
            System.out.println("EL NUMERO ES: "+numero+ " ES IMPAR");
        }
    }
    
}
