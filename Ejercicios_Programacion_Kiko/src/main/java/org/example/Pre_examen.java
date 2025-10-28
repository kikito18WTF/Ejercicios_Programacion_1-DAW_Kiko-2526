package org.example;

import java.util.Scanner;

public class Pre_examen {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        int num;

        int num2 = 0;

        int cont_may_0=0;
        int cont_min_0=0;
        int cont_igual_0=0;

        System.out.println("Dime una cantidad de numero: ");
        num = entrada.nextInt();

        for (int i = 0; i <num ; i++) {

            System.out.println("Dime un numero: ");
            num2 = entrada.nextInt();


            if (num2 > 0){
                cont_may_0++;

            } else if (num2 < 0) {
                cont_min_0++;
            }else {
                cont_igual_0++;
            }


        }

        System.out.println("Estos son la cantidad de numeros mayores que 0: "+ cont_may_0);
        System.out.println("Estos son la cantidad de numeros menores que 0: "+ cont_min_0);
        System.out.println("Estos son la cantidad de numeros iguales que 0: "+ cont_igual_0);




        

    }


}
