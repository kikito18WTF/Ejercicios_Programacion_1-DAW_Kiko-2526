package org.example;

import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

    static void main() {


        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
//
//        int numero = aleatorio.nextInt(10)+1;
//
//        double numero3 = aleatorio.nextDouble()*100+1;
//
//        System.out.println(numero);


        // EJERCICIO 1

//        int dado1 = aleatorio.nextInt(5)+1;
//        System.out.println("Dado 1: "+ dado1);
//
//        int dado2 = aleatorio.nextInt(5)+1;
//        System.out.println("Dado 2: "+ dado2);
//
//        int resultado_dado = dado1 + dado2;
//        System.out.println("El resultdo de los dos dados:"+ resultado_dado);


        // EJERCICIO2

//         String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//
//         String contra ="";
//
//         for (int i = 0; i<12; i++){
//
//             contra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
//
//         }
//
//         System.out.println(contra);


        //Ejercicio 3


//        int min;
//        int max;
//
//        int num;
//
//        System.out.println("Dime el rango minimo");
//        min = entrada.nextInt();
//        System.out.println("Dime el rango maximo");
//        max = entrada.nextInt();
//
//        if (min > max){
//            System.out.println("ERROR. Me estas vacilando");
//        }else {
//            System.out.println("Cuantos numeros aleatorios quieres");
//            num = entrada.nextInt();
//
//            for (int i = 0; i < num ; i++){
//
//                int rango_aleatorio = aleatorio.nextInt(max-min+1)+ min;
//
//                System.out.println(rango_aleatorio);
//
//            }
//        }
//
        // Ejercicio4


        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";


        int longitud = 8 + aleatorio.nextInt(5);

        String contra = "";
        boolean mayus = false;
        boolean minu = false;
        boolean numero = false;


        do {
            contra = "";
            mayus = false;
            minu = false;
            numero = false;

            for (int i = 0; i < longitud; i++) {
                char contra_unico = caracteres.charAt(aleatorio.nextInt(caracteres.length()));
                contra += contra_unico;

                if (contra_unico >= 'A' && contra_unico <= 'Z') {
                    mayus = true;
                } else if (contra_unico >= 'a' && contra_unico <= 'z') {
                    minu = true;
                } else if (contra_unico >= '0' && contra_unico <= '9') {
                    numero = true;
                }

            }

        } while (!mayus || !minu || !numero); // repetir hasta que cumpla

        System.out.println("Longitud: " + longitud);
        System.out.println("Contraseña generada: " + contra);
    }






}
