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

         String contra ="";

         for (int i = 0; i<12; i++){

             contra += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));

         }

         System.out.println(contra);




    }


}
