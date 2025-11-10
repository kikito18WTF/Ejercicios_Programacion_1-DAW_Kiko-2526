package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    static void main (){

        Scanner entrada = new Scanner(System.in);

        int dividendo ;
        int divisor ;
        int resultado ;

        try {

            System.out.println("Introduce el primer numero para dividir: ");
            dividendo = entrada.nextInt();
            System.out.println("Introduce el segundo numero para dividir: ");
            divisor = entrada.nextInt();

            resultado = dividendo/divisor;
            System.out.println("El resultado de la division es: " +resultado);

        } catch (ArithmeticException er1) {
            System.out.println("ERROR. No se puede dividir entre 0");
        }catch (InputMismatchException er2){
            System.out.println("ERROR. Debe introducir numeros, no letras");
        }



    }
}
