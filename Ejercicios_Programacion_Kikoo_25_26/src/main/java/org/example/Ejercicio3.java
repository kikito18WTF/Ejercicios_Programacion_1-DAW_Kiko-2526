package org.example;

import java.util.Scanner;

public class Ejercicio3 {

    static void main(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime un numero: ");

        int num= entrada.nextInt();

        if (num>0){
            System.out.println("El "+ num + " es positivo");
        } else if (num<0) {
            System.out.println("El "+ num + " es negativo");
        }else {
            System.out.println("El " +num+ " es natural");
        }


    }
}
