package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Ejercicio4 {

    static  void main () {

        Scanner entrada = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int num3=0;

        try{

            System.out.println("Introduce el primer numero:");
             num1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero: ");
             num2 = entrada.nextInt();
            System.out.println("Introduce el tercer numero: ");
             num3 = entrada.nextInt();


        } catch (Exception err) {
            System.out.println("ERROR. Debe introducir numeros");
        }


        if (num1 == num2 || num1 == num3 || num2 == num3 ){
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else {

            int minimo = num1;
            if (num2 < minimo) {
                minimo = num2;
                System.out.println("El numero " + num2 + " es el minimo ");
            } else if (num3 < minimo) {
                minimo = num3;
                System.out.println("El numero " + num3 + " es el minimo ");
            } else {
                System.out.println("El numero " + minimo + " es el minimo ");
            }


        }

    }
}
