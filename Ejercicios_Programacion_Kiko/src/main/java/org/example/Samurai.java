package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        boolean repetir = false;
        final int POTENCIA_MAX = 30;

        int cont = 0;

        int equipo_cont=1;

        String equipo1[] = new String[7];

        String equipo2[] = new String[7];

        do {

            cont =0; //se reinicia contador a 0 cada vuelta al bucle
            System.out.println("Equipo "+equipo_cont);
            System.out.println("Introduce potencia de los samurais: ");
            String equipoo1 = entrada.nextLine();
            equipo1 = equipoo1.split(" ");

            for (int i = 0; i < equipo1.length; i++) {

                cont += Integer.parseInt(equipo1[i]);

            }

            System.out.println("El resultado es "+cont);

            if (cont != POTENCIA_MAX) {
                System.out.println("ERROR. La potencia total no suma 30");
                repetir = true;
            } else {
                System.out.println("EQUIPO COMPLETADO");
               equipo_cont++;


            }
        } while (repetir == true);


    }
}
