package org.example;

import java.util.Scanner;

public class Calculadora {

    static void main() {
        Scanner entrada = new Scanner(System.in);


        int operando = 0;
        int operando2 = 0;

        double resultado_sumar=0;
        double resultado_resta=0;
        double resultado_multi=0;
        double resultado_division=0;

        double resultado_raizcuadrada=0;

        String operacion = "";

        boolean repetir = false;



        System.out.println("******* BIENVENIDO A LA CALCULADORA RAPIDA *******");

        do {

            try {
                System.out.println("> Introduce operando: ");
                operando=entrada.nextInt();
            }catch (Exception err1){
                System.out.println("ERROR. Formato incorrecto");
                return;
            }

            System.out.println("-----------------");
            System.out.println("[+] -> sumar");
            System.out.println("[-] -> restar");
            System.out.println("[x] -> multiplicar");
            System.out.println("[/] -> dividir");
            System.out.println("[R] -> raiz cuadrado");
            System.out.println("-----------------");

            System.out.println("Elige una operacion: ");

            operacion = entrada.next();
            operacion = operacion.toUpperCase();



            if (operacion.equals("+")  || operacion.equals("-") || operacion.equals("X") || operacion.equals("/")){
                try {
                    System.out.println("> Introduce el segundo operando: ");
                    operando2 = entrada.nextInt();
                }catch (Exception err2){
                    System.out.println("ERROR. Formato incorrecto");
                    return;
                }

            }

            switch (operacion){
                case "+":
                    resultado_sumar= operando+operando2;
                    System.out.println("El resultado de "+ operando + " " + operacion + " " + operando2+ " es "+ resultado_sumar );
                    repetir=false;
                    break;
                case "-":
                    resultado_resta= operando-operando2;
                    System.out.println("El resultado de "+ operando+ " " + operacion + " "+ operando2+ " es "+ resultado_resta );
                    repetir=false;
                    break;
                case "X":
                    resultado_multi= operando*operando2;
                    System.out.println("El resultado de "+ operando+ " " + operacion + " " + operando2 + " es "+ resultado_multi );
                    repetir=false;
                    break;
                case "/":
                    if (operando2==0){
                        System.out.println("ERROR. No se puede dividir entre 0");
                        repetir=true;
                        break;

                    }else {
                        resultado_division= operando/operando2;
                        System.out.println("El resultado de "+ operando+ " " + operacion + " " +  operando2+ " es " + resultado_division );
                        repetir=false;
                        break;
                    }
                case "R":
                    if (operando < 0){
                        System.out.println("ERROR. No se puede calcular la raíz cuadrada de un número negativo");
                        repetir=true;
                        break;
                    }else {
                        resultado_raizcuadrada = Math.sqrt(operando);
                        System.out.println("El resultado de la raiz cuadrada es: " + resultado_raizcuadrada );
                        repetir=false;
                        break;
                    }
                default:
                    System.out.println("ERROR. No existe esa operacion. Vuelve a hacer la operacion... ");
                    repetir=true;
                    break;
            }

            entrada.nextLine();

        }while (repetir==true);


    }

}
