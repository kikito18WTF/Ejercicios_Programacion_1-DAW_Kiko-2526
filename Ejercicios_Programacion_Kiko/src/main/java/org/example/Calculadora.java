package org.example;

import java.util.Scanner;

public class Calculadora {

    static void main() {
        Scanner entrada = new Scanner(System.in);


        int operando=0;
        int operando2=0;

        double resultado_sumar=0;
        double resultado_resta=0;
        double resultado_multi=0;

        System.out.println("******* BIENVENIDO A LA CALCULADORA RAPIDA ********");
        System.out.println("> Introduce operando: ");
         operando=entrada.nextInt();

        System.out.println("-----------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raiz cuadrado");
        System.out.println("-----------------");

        System.out.println("Elige una operacion: ");

        String operacion = entrada.next();

        if (operacion.equals("+")  || operacion.equals("-") || operacion.equals("x") || operacion.equals("/")){
            System.out.println("> Introduce el segundo operando: ");
            operando2 = entrada.nextInt();
        }

        switch (operacion){
            case "+":
                 resultado_sumar= operando+operando2;
                System.out.println("El resultado de"+ operando+ operacion+ operando2+ "es"+ resultado_sumar );
                break;
            case "-":
                resultado_resta= operando-operando2;
                System.out.println("El resultado de"+ operando+ operacion+ operando2+ "es"+ resultado_resta );
                break;
            case "x":
                resultado_multi= operando*operando2;
                System.out.println("El resultado de"+ operando+ operacion+ operando2+ "es"+ resultado_multi );
                break;



        }

    }

}
