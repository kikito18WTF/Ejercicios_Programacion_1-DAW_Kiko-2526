package org.example;

import java.util.Scanner;

public class PracticaISBN {


    static void main() {

        Scanner entrada = new Scanner(System.in);


        String isbn="";

        int opcion=0;

        int resultado=0;

        final int TAMANYO_ISBN=10;

        int tamanyo =0;


        System.out.println("Introduzca ISBN: ");
        isbn = entrada.next();
        tamanyo = isbn.length();

        if (tamanyo > TAMANYO_ISBN){
            System.out.println("ERROR. ISBN no valido por exceso de caracteres");

        }else if (tamanyo < TAMANYO_ISBN){
            System.out.println("ERROR. Falta de caracteres");
        }




        System.out.println("VALIDADOR ISBN");
        System.out.println("--------------");
        System.out.println("1.- Validar ISBN");
        System.out.println("2.- Reparar ISBN");
        System.out.println("3.- Salir");

        opcion = entrada.nextInt();

        switch (opcion){

            case 1:
                System.out.println("Introduzca ISBN: ");




        }


    }


}
