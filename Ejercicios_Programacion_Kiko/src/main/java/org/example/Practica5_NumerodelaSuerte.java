package org.example;

import java.util.Scanner;

public class Practica5_NumerodelaSuerte {

    static void main() {

        Scanner entrada = new Scanner(System.in); // Crea el Scanner para leer datos por teclado

        boolean repetir = false; // Variable para controlar si se repite el proceso
        String fecha_nacimiento = ""; // Variable para guardar la fecha introducida por el usuario

        final int TAMANYO_MAX = 10; // Variable constante, para guardar el tamaño maximo que tiene una fecha

        // Variables numéricas para las tres partes de la fecha
        int fecha_nacimiento_izq_entero = 0;    // Día
        int fecha_nacimiento_centro_entero = 0; // Mes
        int fecha_nacimiento_derecha_entero = 0; // Año

        // Variables para las cifras de la suma total
        int fecha_total_N1_entero = 0;
        int fecha_total_N2_entero = 0;
        int fecha_total_N3_entero = 0;
        int fecha_total_N4_entero = 0;

        int tamanyo = 0; // Variable para medir la longitud de la cadena introducida

        // Bucle principal del programa
        do {
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            fecha_nacimiento = entrada.next(); // Lee la fecha como texto
            tamanyo = fecha_nacimiento.length(); // Guardamos la longitud del texto

            //   Control de formato corto, si tiene menos de 10 caracteres
            if (tamanyo < TAMANYO_MAX) {
                System.out.println("ERROR. Formato de fecha incorrecto. Debes usar el formato dd/mm/aaaa");
                repetir = true;
            }
            //  Control de guiones negativos en las posiciones del día, mes o año
            else if (fecha_nacimiento.charAt(0) == '-' || fecha_nacimiento.charAt(3) == '-' || fecha_nacimiento.charAt(6) == '-') {
                System.out.println("ERROR. No existe fechas de nacimiento negativas. Vuelve a introducir una fecha de nacimiento");
                repetir = true;
            }
            //  Control de exceso de caracteres
            else if (tamanyo > TAMANYO_MAX) {
                System.out.println("ERROR. Exceso de caracteres. Vuelve a introducir una fecha de nacimiento...");
                repetir = true;
            }
            //   Si el formato es correcto, sigue el programa
            else {
                try {
                    // Extrae las posiciones de las tres partes de la fecha
                    String fecha_nacimiento_izq = fecha_nacimiento.substring(0, 2);
                    fecha_nacimiento_izq_entero = Integer.parseInt(fecha_nacimiento_izq);

                    String fecha_nacimiento_centro = fecha_nacimiento.substring(3, 5);
                    fecha_nacimiento_centro_entero = Integer.parseInt(fecha_nacimiento_centro);

                    String fecha_nacimiento_derecha = fecha_nacimiento.substring(6, 10);
                    fecha_nacimiento_derecha_entero = Integer.parseInt(fecha_nacimiento_derecha);

                    // Calcula la suma del dia, mes y año
                    int fecha_total = fecha_nacimiento_izq_entero + fecha_nacimiento_centro_entero + fecha_nacimiento_derecha_entero;

                    // Extrae las posiciones de las partes de la fecha total
                    String fecha_total2 = Integer.toString(fecha_total);

                    String fecha_total_N1 = fecha_total2.substring(0, 1);
                    fecha_total_N1_entero = Integer.parseInt(fecha_total_N1);

                    String fecha_total_N2 = fecha_total2.substring(1, 2);
                    fecha_total_N2_entero = Integer.parseInt(fecha_total_N2);

                    String fecha_total_N3 = fecha_total2.substring(2, 3);
                    fecha_total_N3_entero = Integer.parseInt(fecha_total_N3);

                    String fecha_total_N4 = fecha_total2.substring(3, 4);
                    fecha_total_N4_entero = Integer.parseInt(fecha_total_N4);

                    int numero_suerte = fecha_total_N1_entero + fecha_total_N2_entero + fecha_total_N3_entero + fecha_total_N4_entero;

                    //  Muestrar el proceso y el resultado
                    System.out.println(fecha_nacimiento);
                    System.out.println(fecha_nacimiento_izq_entero + "+" + fecha_nacimiento_centro_entero + "+" + fecha_nacimiento_derecha_entero + " = " + fecha_total);
                    System.out.println(fecha_total_N1_entero + "+" + fecha_total_N2_entero + "+" + fecha_total_N3_entero + "+" + fecha_total_N4_entero + " = " + numero_suerte);
                    System.out.println("Tu numero de la suerte es " + numero_suerte);


                } catch (NumberFormatException err1) {
                    // Si el usuario mete letras o simbolos, captura el error
                    System.out.println("ERROR. Formato incorrecto. Introduce solo numeros y separadores ");
                    return;
                }
            }

            entrada.nextLine();

        } while (repetir == true); // El bucle se repite si hubo algún error
    }
}
