/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author HP 450 G5
 */
public class EJERCICIO8 {

    /**
     *DADAS LAS COORDENADAS DE UN PUNTO EN EL PLANO CARTESIANO,
     *DESPLIEGA UN MENSAJE INDICNDO EN QUE CUADRANTE SE 
     *ENCUENTRA, SI ESTA EN EL EHE DE LAS X, DE LAS Y, 
     *O EN EL ORIGEN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        
        double x;
        double y;
        
        System.out.println("INGRESE LA COORDENADA X");
        x= mila.nextDouble();
        
        System.out.println("INGRESE LA COORDENADA Y");
        y= mila.nextDouble();
        
        if(x == 0 && y==0){
            System.out.println("EL PUNTO ESTA EN EL ORIGEN");
        }else if(y==0){
            System.out.println("EL PUNTO ESTA EN EL EJE X");
        }else if(x==0){
            System.out.println("EL PUNTO ESTA EN EL EJE Y");
        }else if(x > 0 && y > 0){
            System.out.println("EL PUNTO ESTA EN EL PRIMER CUADRANTE");
        }else if(x < 0 && y > 0){
            System.out.println("EL PUNTO ESTA EN EL SEGUNDO CUADRANTE");
        }else if(x < 0 && y < 0){
            System.out.println("EL PUNTO ESTA EN EL TERCER CUADRANTE");
        }else{
            System.out.println("EL PUNTO ESTA EN EL CUARTO CUADRANTE");
        }
    }
    
}
