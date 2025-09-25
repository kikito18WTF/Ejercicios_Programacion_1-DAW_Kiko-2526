package org.example;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Como te llamas: ");

        String nombre = entrada.nextLine();

        System.out.println("A que curso vas: ");

        String curso = entrada.nextLine();

        System.out.println("Hola "+ nombre + ", bienvenido a " + curso);

        System.out.println("Dime un numero: ");

        int num1= entrada.nextInt();

        System.out.println("Dime otro numero; ");

        int num2= entrada.nextInt();

        int resultado = num1+num2;

        System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + resultado);


    }
}
