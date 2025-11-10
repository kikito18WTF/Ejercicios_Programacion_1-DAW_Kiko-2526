package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    static void main (){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el numero de horas: ");
        int horas = entrada.nextInt();

        System.out.println("Dime la tarifa: ");
        double tarifa = entrada.nextDouble();

        double salario = horas * tarifa;

        System.out.println("El salario bruto es: "+ salario);
    }
}
