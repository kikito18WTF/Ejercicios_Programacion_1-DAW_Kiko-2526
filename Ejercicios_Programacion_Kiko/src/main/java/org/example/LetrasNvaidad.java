package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class LetrasNvaidad {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introudce un apalabra");
        String palabra = entrada.next();

        System.out.println("Cantidad de letras");

        String letras = entrada.next();

        String palabra_vector[] = palabra.split("");
        String letras_vector[] = letras.split("-");

        System.out.println(Arrays.toString(palabra_vector));
        System.out.println(Arrays.toString(letras_vector));

        if (palabra_vector.length== letras_vector.length){

            for (int i = 0; i < letras_vector.length ; i++) {
                for (int j = 0; j < Integer.parseInt(letras_vector[i]); j++) {

                    System.out.print(palabra_vector[i]);
                }

            }

        }else {
            System.out.println("Datos incorectos. No hay numero para cada letra");
        }
    }
}
