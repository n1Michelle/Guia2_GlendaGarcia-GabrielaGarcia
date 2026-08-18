/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;
/**
 *DISEÑE UNA SOLUCION QUE DADAS LAS NOTAS DE UN GRUPO
 *DE ALUMNOS(CUYA CANTIDAD ES CONOCIDA) CALCULE E IMPRIMA
 *LA NOTA PROMEDIO
 * @author HP 450 G5
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        int cantidadA;
        int cantidadN;
        int contadorA=1;
        int contadorN;
        double suma;
        double promedio;
        double nota;
        String nombre;
        
        System.out.println("INGRESA LA CANTIDAD DE ALUMNOS");
        cantidadA= mila.nextInt();
        mila.nextLine();
        
        System.out.println("INGRESA LA CANTIDAD DE NOTAS POR ALUMNOS");
        cantidadN= mila.nextInt();
        mila.nextLine();
        
        while(contadorA <= cantidadA){
            System.out.println("INGRESA EL NOMBRE DEL ALUMNO");
            nombre=mila.nextLine();
            
            suma=0;
            contadorN=1;
            
            while(contadorN <= cantidadN){
                System.out.println("INGRESA LA NOTA " +contadorN);
                nota=mila.nextDouble();
                
                suma = suma + nota;
                
                contadorN++;
            }
            
            promedio = suma / cantidadN;
            System.out.println("NOMBRE DEL ALUMNO: " + nombre);
            System.out.println("PROMEDIO DEL ALUMNO: " + promedio);
            
            mila.nextLine();
            
            contadorA++;
        }
        
         System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
