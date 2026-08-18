/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author HP 450 G5
 */
public class EJERCICIO9 {

    /**
     *EN UN CINE SE HACE UN 50% DE DESCUENTO EN EL VALOR DE LA
     *ENTRADA A LAS PERSONAS MAYORES DE 60 AÑOS Y A LOS MENORES
     *DE 18 AÑOS, EL RESTO DE LAS PERSONAS PAGA EL MONTO SIN 
     *DESCUENTO. DADAS LA EDAD DE LAS PERSONA Y EL PRECIO,
     *CALCULE CUANTO PAGARA UNA PERSONA POR SU ENTRADA.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        
        int edad;
        double precio;
        double descuento=0.50;
        double pagototal;
        String nombre;
        int continuar = 1;
        
        
        
        while(continuar == 1){
            
            System.out.println("INGRESA EL NOMBRE DEL CLIENTE");
            nombre = mila.nextLine();
            System.out.println("INGRESA LA EDAD DEL CLIENTE");
            edad = mila.nextInt();
            System.out.println("INGRESA EL PRECIO DEL BOLETO");
            precio = mila.nextDouble();
            
            if(edad < 18 || edad > 60){
            pagototal=precio * descuento;
            System.out.println("NOMBRE CLIENTE: " +nombre);
            System.out.println("EDAD DEL CLIENTE: " +edad);
            System.out.println("EL TOTAL A PAGAR ES DE: " +pagototal);
            
            }else{
            pagototal= precio;
            System.out.println("NOMBRE CLIENTE: " +nombre);
            System.out.println("EDAD DEL CLIENTE: " +edad);
            System.out.println("EL TOTAL A PAGAR ES DE: " +pagototal);
            }
            
            System.out.println("DESEA INGRESAR OTRA PERSONA? 1=SI/ 0=NO");
            continuar = mila.nextInt();
            mila.nextLine();
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
    
}
