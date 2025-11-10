package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    static void main (){

        Scanner entrada = new Scanner(System.in);
        final int  HORAS_SIN_EXTRAS = 40;
        final double PLUS_TARIFA_EXTRA= 1.5;

        System.out.println("Dime el numero de horas: ");
        int horas = entrada.nextInt();

        System.out.println("Dime la tarifa: ");
        double tarifa = entrada.nextDouble();

        double salario = horas * tarifa;

        if (horas>HORAS_SIN_EXTRAS){

            double extras = horas - HORAS_SIN_EXTRAS;
            double tarifa_extra = tarifa * PLUS_TARIFA_EXTRA;
            double salario_extra = extras*tarifa_extra;

            System.out.println("Salario (con extra): " + (salario_extra + (HORAS_SIN_EXTRAS * tarifa)));

        }else {
            System.out.println("El salario bruto es: "+ salario);
        }


    }
}
