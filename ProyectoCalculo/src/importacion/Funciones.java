/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importacion;
import java.util.Scanner;
import importacion.*;
/**
 *
 * @author PC
 */
public class Funciones {
    // Declaración de variables estáticas
    static Scanner entrada = new Scanner(System.in);
    static int x = 0;
    static int a;
    static int n;
    static int lim_n;
    static int lim_a;

    // Declaración y resolución de funciones
    public static void funcion1() {
        double fx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        // Estructura condicional anidada para evaluar los límites de la función 
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            fx = (((- 4 * x) + (Math.pow(x, 3))) / (Math.pow(x, 2)));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, fx);
        }
        System.out.println("=========================================");
    }

    public static void funcion2() {
        double gx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de datos
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            gx = ((5 * Math.pow(x, 3)) - (3 * x) + (3) / (Math.pow(x, 3)));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, gx);
        }
        System.out.println("=========================================");
    }

    public static void funcion3() {
        double hx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            hx = ((8 * x) - (Math.pow(x, 2)) + (5));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, hx);
        }
        System.out.println("=========================================");
    }

    public static void funcion4() {
        double ix;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            ix = ((5 * x) - (Math.pow(x, 3)) - (Math.pow(2, x)));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, ix);
        }
        System.out.println("=========================================");
    }

    public static void funcion5() {
        double jx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            jx = ((Math.pow(3, x)) - (5 * x) + (4));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, jx);
        }
        System.out.println("=========================================");
    }

    public static void funcion6() {
        double kx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            kx = ((Math.sqrt((Math.pow(x, 2)) - (6 * x))) / (2 * x));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, kx);
        }
        System.out.println("=========================================");
    }

    public static void funcion7() {
        double lx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            lx = ((Math.pow(2, x)) + (4 * x) - (Math.pow(x, 3)));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, lx);
        }
        System.out.println("=========================================");
    }

    public static void funcion8() {
        double mx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para encontrar la raíz del número
            mx = ((7 * x) - (Math.sqrt(2 * x)) + (5));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, mx);
        }
        System.out.println("=========================================");
    }

    public static void funcion9() {
        double nx;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            nx = ((4 * (Math.pow(x, 2))) - (Math.pow(3, x)) - (8));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, nx);
        }
        System.out.println("=========================================");
    }

    public static void funcion10() {
        double ox;
        // Ingreso de datos
        System.out.printf("%s\n", Mensajes.mensaje_valorlimite);
        n = entrada.nextInt();
        System.out.printf("%s\n", Mensajes.mensaje_valorinicial);
        a = entrada.nextInt();
        /* Estructura condicional anidada para evular los límites de
        la función
         */
        if (n < a) {
            lim_n = a;
        } else {
            lim_n = n;
        }
        if (a < n) {
            lim_a = a;
        } else {
            lim_a = n;
        }
        // Resolución y presentación de resultados
        System.out.println("x | y");
        // Estructura lógica repetitiva para resolver y presentar la función
        for (x = lim_a; x <= lim_n; x++) {
            // Uso de Math.pow para elevar en potencia al número
            ox = ((2 * (Math.pow(4, x))) + (Math.pow(x, -4)) - (7));
            // Presentación de resultados
            System.out.printf("%s | %.1f\n", x, ox);
        }
        System.out.println("=========================================");
    }
}
