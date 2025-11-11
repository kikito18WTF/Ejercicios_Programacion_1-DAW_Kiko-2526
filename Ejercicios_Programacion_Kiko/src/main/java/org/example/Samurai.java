package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurai {

    static void main() {


        Scanner entrada = new Scanner(System.in);

        Random aleatorio = new Random();

        // La potencia total que debe tener cada equipo
        final int POTENCIA_MAX = 30;

        // Contadores y variables que usaremos
        int cont = 0;
        int equipo_cont = 1;

        int muertes_equipo1 = 0;
        int muertes_equipo2 = 0;

        int posicion;

        // Creamos los arrays  donde se guardan las potencias
        String equipo1[] = new String[7];
        String equipo2[] = new String[7];

        String equipo[]  = new String[7];



        do {
            cont = 0; // Se reinicia el contador cada vez que pedimos un equipo

            System.out.println("Equipo " + equipo_cont);

            System.out.println("Introduce potencia de los samurais: ");

            // El usuario mete las 7 potencias separadas por espacios
            String equipos = entrada.nextLine();
            equipo = equipos.split(" "); // las mete dentro del array

            // Suma las potencias para ver si llegan a 30
            for (int i = 0; i < equipo.length; i++) {
                try {
                    cont += Integer.parseInt(equipo[i]);
                }catch (NumberFormatException err1){
                    System.out.println("ERROR. Formato no valido"); //Controla que se ponga numeros. Si se introduce una letra salta el mensaje

                }

            }



            // Si no suma 30, error y se vuelve a pedir
            if (cont != POTENCIA_MAX) {
                System.out.println("ERROR. La potencia total no suma 30");

            } else {
                System.out.println("EQUIPO COMPLETADO");

                // Si es el primero, lo guarda como equipo1, si no, como equipo2
                if (equipo_cont != 1) {
                    equipo2 = equipo.clone(); // clona para no pisar datos
                } else {
                    equipo1 = equipo.clone();
                }

                equipo_cont++; // pasa al siguiente equipo
            }

        } while (equipo_cont <= 2); // se repite hasta tener los 2 equipos listos



    // Elige un samurai al azar para empezar
        int samurai_aleatorio = aleatorio.nextInt(7);


        System.out.println("EMPIEZA LA BATALLA");
        System.out.println("La batalla inicia con el Samurai " + (samurai_aleatorio + 1));

    // Recorre todos los samurais empezando desde el aleatorio
        for (int i = 0; i < equipo1.length; i++) {

            // Calcula cual es el samurái que pelea ahora
            posicion = (samurai_aleatorio + i) % equipo1.length;

            // Compara las potencias de ambos equipos
            if (Integer.parseInt(equipo1[posicion]) > Integer.parseInt(equipo2[posicion])) {
                System.out.println("Samurai " + (posicion + 1) + " Gana Equipo 1 " + equipo1[posicion] + " vs " + equipo2[posicion]);
                muertes_equipo2++; // pierde un samurai del equipo 2
            } else if (Integer.parseInt(equipo1[posicion]) < Integer.parseInt(equipo2[posicion])) {
                System.out.println("Samurai " + (posicion + 1) + " Gana Equipo 2 " + equipo1[posicion] + " vs" + equipo2[posicion]);
                muertes_equipo1++; // pierde un samurai del equipo 1
            } else {
                // Si tienen la misma potencia, mueren los dos
                System.out.println("EMPATE. Mueren los dos");
                muertes_equipo1++;
                muertes_equipo2++;
            }

            // Si uno de los dos equipos ya tiene 4 bajas, se acaba la pelea
            if (muertes_equipo1 == 4 || muertes_equipo2 == 4) {
                break;
            }
        }


        // Se comparan la cantidad de bajas que ha tenido cada equipo y se muestra el resultado
        if (muertes_equipo1 > muertes_equipo2) {
            System.out.println("GANA EL EQUIPO 2. El equipo 1 ha tenido " + muertes_equipo1 + " bajas");
        } else if (muertes_equipo2 > muertes_equipo1) {
            System.out.println("GANA EL EQUIPO 1. El equipo 2 tuvo " + muertes_equipo2 + " bajas");
        } else {
            System.out.println("EMPATE. Ambos equipos quedaron igualados con " + muertes_equipo1 + " bajas cada uno");
        }





    }
}
