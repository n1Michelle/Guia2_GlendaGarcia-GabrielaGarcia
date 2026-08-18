/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;

/**
 *
 * @author HP 450 G5
 */
public class EJERCICIO11 {

    /**\
     *SE DESEA CALCULAR EL SUELDO DE UN TRABAJADOR, TENIENDO
     *LAS HORAS TRABAJADAS DURANTE LA SEMANA Y LA CLASE DE PUESTO
     *QUE DESEMPEÑA, DISEÑE LA SOLUCION QUE PERMITA DESPLEGAR
     *LOS DATOS DEL EMPLEADO Y SU SUELDO SEMANAL, SABIENDO QUE
     *EL TRABAJADOR CLASE A SE LE PAGA $7/HORA,
     *LA CLASE B $8.50, LA CLASE C $10 Y LA CLASE D $12.50
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mila = new Scanner(System.in);
        char opcion;
        int continuar = 1;
        String nombre;
        double horas;
        double pagohora;
        double sueldo;
        
        while(continuar==1){
            System.out.println("INGRESA EL NOMBRE DEL EMPLEADO");
            nombre=mila.nextLine();
            System.out.println("INGRESA LAS HORAS TRABAJADAS");
            horas=mila.nextDouble();
            System.out.println("EMPLEADO DE CLASE A(OPCION A)");
            System.out.println("EMPLEADO DE CLASE B(OPCION B)");
            System.out.println("EMPLEADO DE CLASE C(OPCION C)");
            System.out.println("EMPLEADO DE CLASE D(OPCION D)");
            opcion=mila.next().toUpperCase().charAt(0);
            
            switch(opcion){
                case 'A':
                    pagohora=7.00;
                    sueldo=horas*pagohora;
                    System.out.println("NOMBRE DEL EMPLEADO: " + nombre);
                    System.out.println("CLASE DEL PUESTO: " + opcion);
                    System.out.println("HORAS TRABAJADAS: " + horas);
                    System.out.println("SUELDO SEMANAL: $" + sueldo);
                    break;
                case 'B':
                    pagohora=8.50;
                    sueldo=horas*pagohora;
                    System.out.println("NOMBRE DEL EMPLEADO: " + nombre);
                    System.out.println("CLASE DEL PUESTO: " + opcion);
                    System.out.println("HORAS TRABAJADAS: " + horas);
                    System.out.println("SUELDO SEMANAL: $" + sueldo);
                    break;
                case 'C':
                    pagohora=10.00;
                    sueldo=horas*pagohora;
                    System.out.println("NOMBRE DEL EMPLEADO: " + nombre);
                    System.out.println("CLASE DEL PUESTO: " + opcion);
                    System.out.println("HORAS TRABAJADAS: " + horas);
                    System.out.println("SUELDO SEMANAL: $" + sueldo);
                    break;
                case 'D':
                    pagohora=12.50;
                    sueldo=horas*pagohora;
                    System.out.println("NOMBRE DEL EMPLEADO: " + nombre);
                    System.out.println("CLASE DEL PUESTO: " + opcion);
                    System.out.println("HORAS TRABAJADAS: " + horas);
                    System.out.println("SUELDO SEMANAL: $" + sueldo);
                    break;
                default:
                    System.out.println("CLASE NO VALIDA, POR FAVOR VUELVA A INTENTAR");
                    break;
            }
            
            System.out.println("DESEA INGRESAR OTRO EMPLEADO: 1=SI/ 0=NO");
            continuar = mila.nextInt();
            mila.nextLine();
        }
        System.out.println("PROGRAMA FINALIZADO");
    }
    
}
