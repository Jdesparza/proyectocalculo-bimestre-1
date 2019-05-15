/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculo;
import java.util.Scanner;
import importacion.*;
/**
 *
 * @author Usuario
 */
public class ProyectoCalculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        boolean bandera = true;
        int opcion;
        // Método Scanner para ingreso de datos
        Scanner entrada = new Scanner(System.in);
        // Inicialización de estructura condicional para el Menú
        while (bandera = true) {
            // Mensajes de entrada del Menú
            System.out.println("---------------- Menú -----------------------");
            System.out.println("| 0. Salir                                  |");
            System.out.printf("| 1.   f(x) = %s           |\n", Mensajes.fx);
            System.out.printf("| 2.   g(x) = %s       |\n", Mensajes.gx);
            System.out.printf("| 3.   h(x) = %s                  |\n",
                    Mensajes.hx);
            System.out.printf("| 4.   i(x) = %s                |\n",
                    Mensajes.ix);
            System.out.printf("| 5.   j(x) = %s                  |\n",
                    Mensajes.jx);
            System.out.printf("| 6.   k(x) = %s            |\n", Mensajes.kx);
            System.out.printf("| 7.   k(x) = %s                |\n",
                    Mensajes.lx);
            System.out.printf("| 8.   k(x) = %s                |\n",
                    Mensajes.mx);
            System.out.printf("| 9.   k(x) = %s                |\n",
                    Mensajes.nx);
            System.out.printf("| 10.  k(x) = %s             |\n",
                    Mensajes.ox);
            System.out.println("---------------------------------------------");

            System.out.println("=========================================");
            System.out.printf("%s\n", Mensajes.mensaje_opcion);
            opcion = entrada.nextInt();
            // Estructura lógica condicional para importar las funciones
            if (opcion == 1) {
                Funciones.funcion1();
            }

            if (opcion == 2) {
                Funciones.funcion2();
            }

            if (opcion == 3) {
                Funciones.funcion3();
            }

            if (opcion == 4) {
                Funciones.funcion4();
            }

            if (opcion == 5) {
                Funciones.funcion5();
            }

            if (opcion == 6) {
                Funciones.funcion6();
            }

            if (opcion == 7) {
                Funciones.funcion7();
            }

            if (opcion == 8) {
                Funciones.funcion8();
            }

            if (opcion == 9) {
                Funciones.funcion9();
            }

            if (opcion == 10) {
                Funciones.funcion10();
            }

            if (opcion > 10 || opcion < 0) {
                 // Presentación de mensajes de error con selección incorrecta
                System.out.println("=========================================");
                System.out.printf("%s\n", Mensajes.mensaje_opcioninvalida);
                System.out.println("=========================================");
            }

            if (opcion == 0) {
                 // Mensaje de salida del Menú al seleccionar 0
                System.out.println("=========================================");
                System.out.printf("%s\n", Mensajes.mensaje_g);
                System.out.println("=========================================");
                bandera = false;
                break;
            }
        }
    }
    
}
