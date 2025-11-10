package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();


        final int POTENCIA_MAX = 30;

        int cont = 0;

        int equipo_cont=1;

        String equipo1[] = new String[7];

        String equipo2[] = new String[7];

        String equipo[] = new String[7];



        do {

            cont =0; //se reinicia contador a 0 cada vuelta al bucle
            System.out.println("Equipo "+equipo_cont);
            System.out.println("Introduce potencia de los samurais: ");
            String  equipos = entrada.nextLine();
            equipo = equipos.split(" ");

            for (int i = 0; i < equipo.length; i++) {


                cont += Integer.parseInt(equipo[i]);


            }



            System.out.println("El resultado es "+cont);


            if (cont != POTENCIA_MAX) {
                System.out.println("ERROR. La potencia total no suma 30");

            } else {
                System.out.println("EQUIPO COMPLETADO");
                if (equipo_cont != 1) {
                    equipo2 = equipo.clone();
                } else {
                    equipo1 = equipo.clone();
                }
                equipo_cont++;





            }





        } while (equipo_cont <= 2);

        int samurai_aleatorio = aleatorio.nextInt(6);
        System.out.println(samurai_aleatorio);
        System.out.println("EMPIEZA LA BATALLA");
        System.out.println("La batalla inicia con el Samurai "+samurai_aleatorio);
        for (int i = samurai_aleatorio; i < equipo1.length; i++) {



        }


    }
}
