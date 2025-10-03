package org.example;

import java.util.Scanner;

public class embuclar {

    static void main(){

        Scanner entrada =  new Scanner(System.in);

        int num=0;

        boolean repetir = false;

        do {


            try {
                System.out.println("Introduce un numero: ");
                num = entrada.nextInt();
                repetir = false;
            } catch (Exception err) {
                System.out.println("El formato introducido no es el correcto");
                repetir=true;
            }
            entrada.nextLine();
        }while (repetir==true);

        System.out.println(num);


    }
}
