package org.example;

import java.util.Scanner;

public class Practica4 {

    static void main() {

        Scanner entrada = new Scanner(System.in); // Crea el objeto Scanner para leer datos por teclado

        // Declaracion de las variables
        int multiplicando = 0;
        int multiplicador = 0;
        int multiplicador_izq_entero = 0;
        int multiplicador_centro_entero = 0;
        int multiplicador_derecha_entero = 0;
        boolean repetir = false;

        // Bucle principal que se repite si hay errores de entrada
        do {
            try {
                // Pide al usuario los dos numeros
                System.out.println("Introduce el multiplicando (3 cifras): ");
                multiplicando = entrada.nextInt();

                System.out.println("Introduce el multiplicador (3 cifras): ");
                multiplicador = entrada.nextInt();

                // Comprueba que ambos numeros tengan 3 cifras ya sea positivos o negativos
                if (((multiplicando >= 100 && multiplicando <= 999) || (multiplicando <= -100 && multiplicando >= -999)) &&
                        ((multiplicador >= 100 && multiplicador <= 999) || (multiplicador <= -100 && multiplicador >= -999))) {
                    // Si la condición se cumple, no hace nada (los datos son válidos)


                // Convierte el multiplicador a texto  para poder extraer sus cifras
                String multiplicador2 = Integer.toString(multiplicador);

                // Si el número es negativo, saltamos el signo "-" en los substring para que no cuente como una posicion
                if (multiplicador < 0) {
                    String multiplicador_izq = multiplicador2.substring(1, 2);  // Centenas (posición 1)
                    multiplicador_izq_entero = Integer.parseInt(multiplicador_izq);

                    String multiplicador_centro = multiplicador2.substring(2, 3); // Decenas (posición 2)
                    multiplicador_centro_entero = Integer.parseInt(multiplicador_centro);

                    String multiplicador_derecha = multiplicador2.substring(3, 4); // Unidades (posición 3)
                    multiplicador_derecha_entero = Integer.parseInt(multiplicador_derecha);
                } else {
                    // Si el número es positivo, las posiciones van normales
                    String multiplicador_izq = multiplicador2.substring(0, 1);
                    multiplicador_izq_entero = Integer.parseInt(multiplicador_izq);

                    String multiplicador_centro = multiplicador2.substring(1, 2);
                    multiplicador_centro_entero = Integer.parseInt(multiplicador_centro);

                    String multiplicador_derecha = multiplicador2.substring(2, 3);
                    multiplicador_derecha_entero = Integer.parseInt(multiplicador_derecha);
                }

                // Calcula los resultados
                int resultado_izquierda = multiplicador_izq_entero * multiplicando;   // Parcial de las centenas
                int resultado_centro = multiplicador_centro_entero * multiplicando;   // Parcial de las decenas
                int resultado_derecha = multiplicador_derecha_entero * multiplicando; // Parcial de las unidades

                // Calcula el resultado total
                int resultado_final = multiplicando * multiplicador;

                // Muestra el proceso paso a paso por pantalla
                System.out.println("El producto de la multiplicación es: " + resultado_final);
                System.out.println("El proceso es: ");
                System.out.println("  " + multiplicando);
                System.out.println("x " + multiplicador);
                System.out.println("--------");
                System.out.println("  " + resultado_derecha);
                System.out.println(resultado_centro + "x");
                System.out.println(resultado_izquierda + "xx");
                System.out.println("-------");
                System.out.println(resultado_final);

                repetir = false; // Si todo ha ido bien no se repite

                } else {
                    // Si no tienen tres cifras, muestra mensaje de error y se repite
                    System.out.println("ERROR. Debes introducir números de 3 cifras ");
                    repetir = true;
                }

            } catch (Exception err1) {
                // Si el usuario introduce letras u otro tipo de dato, salta el error
                System.out.println("ERROR. Formato no válido");
                entrada.nextLine();
                repetir = true; // Indica que debe repetirse el proceso
            }

        } while (repetir == true); // Mientras repetir sea verdadero, el programa pedira los numeros otra vez
    }
}
