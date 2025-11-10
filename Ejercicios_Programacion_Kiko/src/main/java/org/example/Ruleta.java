package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

       final String colores[] = {"rojo", "negro"};

       Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=i;
        }

        final String par_impar [] = {"par", "impar"};


        System.out.println("Introduce un numero. (0-36): ");
        int numero = entrada.nextInt();

        if (!Arrays.asList(numeros).contains(numero)){
            System.out.println("ERROR. No vales para esto");
            return;
        }

        String color_apuesta = entrada.next();
        String par_impar_apuesta = entrada.next();
        if (numero!=0){
            System.out.println("Introduce color");


            if (Arrays.asList(colores).contains(color_apuesta.toLowerCase())){
                System.out.println("ERROR. El color debe ser rojo o negro");
                return;
            }
            System.out.println("Introduce par/impar: ");


            if (Arrays.asList(par_impar).contains(par_impar_apuesta.toLowerCase())){
                System.out.println("ERROR. La opcion debe ser par o impar");
                return;
            }
        }

        String color_sorteo = colores[aleatorio.nextInt(2)];
        int num_sorteo = aleatorio.nextInt(37);

        String par_impar_sorteo;

        if (num_sorteo % 2 ==0){
            par_impar_sorteo="par";
        }else {
            par_impar_sorteo="impar";
        }

        System.out.println("Ha salido" + numero + " "+ color_sorteo+ " "+ par_impar_sorteo);

            if (numero==num_sorteo && color_apuesta.equals(color_sorteo) && par_impar_apuesta.equals(par_impar_sorteo)){
                System.out.println("HAS GANADO");
            }else if (numero==num_sorteo){
                if (num_sorteo==0){
                    System.out.println("Has ganado y toda la mesa ha perdido");
                }else {
                    System.out.println("Has acertado el numero");
                }
            } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
                System.out.println("Has acertasdo "+ par_impar_apuesta);
            }else {
                System.out.println("HAS PERDIDO");
            }


    }
}
