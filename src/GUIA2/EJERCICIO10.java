/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author HP 450 G5
 */
public class EJERCICIO10 {

    /**
     *DATOS DEL NOMBRE DEL CLIENTE, Y EL VALOR DE LA COMPRA, 
     *CALCULE EL MONTO A PAGAR CONSIDERANDO LO SIGUIENTE:
     * 
     *SI LA COMPRA ES MENOR O IGUAL A $75 NO TIENE DESCUENTO
     *SI LA COMPRA ES MAYOR DE $75 TIENE EL DESCUENTO DEL 5%
     *SI LA COMPRA ES MAYOR DE $150 TIENE UN DESCUENTO DEL 10%
     * 
     *SE DEBERA IMPRIMIR EL NOMBRE DEL CLINETE, EL VALOR DE
     *LA COMPRA Y EL MONTO REAL A PAGAR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        String nombre;
        double descuento;
        double compra;
        double montopago;
        int continuar = 1;
        
        while(continuar == 1 ){
            
            System.out.println("INGRESA EL NOMBRE DEL CLIENTE");
            nombre=mila.nextLine();
            System.out.println("INGRESA EL VALOR TOTAL DE LA COMPRA");
            compra=mila.nextDouble();
            
            if(compra <=75){
                System.out.println("NO APLICA DESCUENTO");
                System.out.println("EL TOTAL DE LA COMPRA ES DE: " +compra);
                System.out.println("NOMBRE CLIENTE: " +nombre);
                System.out.println("VALOR DE LA COMPRA: " +compra);
            }else if(compra > 150){
                descuento= compra*0.1;
                montopago=compra - descuento;
                System.out.println("EL TOTAL DE LA COMPRA ES DE: " +montopago);
                System.out.println("NOMBRE CLIENTE: " +nombre);
                System.out.println("VALOR DE LA COMPRA: " +compra);
            }else{
                descuento= compra*0.05;
                montopago=compra - descuento;
                System.out.println("EL TOTAL DE LA COMPRA ES DE: " +montopago);
                System.out.println("NOMBRE CLIENTE: " +nombre);
                System.out.println("VALOR DE LA COMPRA: " +compra);
            }
            
            System.out.println("DESEA INGRESAR OTRA PERSONA? 1=SI/ 0=NO");
            continuar = mila.nextInt();
            mila.nextLine();
            
        }
        
        System.out.println("PROGRAMA FINALIZADO");
        
    }
    
}
