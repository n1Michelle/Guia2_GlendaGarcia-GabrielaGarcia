/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUIA2;
import java.util.Scanner;
/**
 *CREE UNA APLICACION EN JAVA QUE A PARTIR DEL SUELDO DE UN 
 *EMPLEADO CALCULE EL DESCUENTO DE LA RENTA, VEREFICAR SI SE
 *PUEDE APLICAR DICHO DESCUENTO(SEGUN TABLA, SE ASUMIRA QUE 
 *EL SUELDO ES MENSUAL).MOSTRAR EN PANTALLA EL SUELDO TOTAL 
 *QUE RECIBIRA EL EMPLEADO
 * @author Michelle Garcia
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        double sueldo;
        double renta;
        double sueldototal;
        System.out.println("INGRESE EL SUELDO DEL EMPLEADO");
        sueldo = mila.nextDouble();
        
        if(sueldo <= 472){
            System.out.println("NO APLICA DESCUENTO DE RENTA");
            System.out.println("EL SUELDO ES DE" + sueldo);
        }else if(sueldo <= 895.24){
            renta = ((sueldo - 472.00)* 0.10)+17.67;
            sueldototal=sueldo - renta;
            System.out.println("LA RENTA ES DE " + renta);
            System.out.println("EL SUELDO ES DE " + sueldototal);
        }else if(sueldo <= 2038.10){
            renta = ((sueldo - 895.24)* 0.20)+60;
            sueldototal=sueldo - renta;
            System.out.println("LA RENTA ES DE " + renta);
            System.out.println("EL SUELDO ES DE " + sueldototal);
        }else{
            renta = ((sueldo - 2038.10) *0.30)+288.57;
            sueldototal=sueldo - renta;
            System.out.println("LA RENTA ES DE " + renta);
            System.out.println("EL SUELDO ES DE " + sueldototal);
        }
    }
    
}
