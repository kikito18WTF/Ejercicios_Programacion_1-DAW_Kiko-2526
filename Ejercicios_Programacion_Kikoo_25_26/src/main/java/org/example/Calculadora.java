package org.example;

import java.util.Scanner;

public class Calculadora {

    static void main() {

        // Crea el Scanner para leer datos por teclado
        Scanner entrada = new Scanner(System.in);

        // Declara los operandos como double para poder trabajar con números decimales
        double operando = 0;
        double operando2 = 0;

        // Variables donde guardar los resultados de las diferentes operaciones
        double resultado_sumar = 0;
        double resultado_resta = 0;
        double resultado_multi = 0;
        double resultado_division = 0;
        double resultado_raizcuadrada = 0;

        // Variable para guardar el tipo de operacion introducido por el usuario
        String operacion = "";

        // Variable booleano para repetir el programa si ocurre un error
        boolean repetir = false;

        // Mensaje de bienvenida
        System.out.println("******* BIENVENIDO A LA CALCULADORA RAPIDA *******");

        // Bucle principal del programa
        do {

            // Pide el primer operando con control de error
            try {
                System.out.println("> Introduce operando: ");
                operando = entrada.nextDouble(); // Permite introducir numeros con decimales
            } catch (Exception err1) {
                System.out.println("ERROR. Formato incorrecto");
                return; // Finaliza el programa si se introduce texto o un formato no válido
            }

            // Muestra el menu de operaciones disponibles
            System.out.println("-----------------");
            System.out.println("[+] -> sumar");
            System.out.println("[-] -> restar");
            System.out.println("[x] -> multiplicar");
            System.out.println("[/] -> dividir");
            System.out.println("[R] -> raiz cuadrada");
            System.out.println("-----------------");

            // Lee la operacion deseada
            System.out.println("Elige una operacion: ");
            operacion = entrada.next();
            operacion = operacion.toUpperCase(); // Convierte a mayuscula

            // Si la operacion no es raiz cuadrada, pide el segundo numero
            if (!operacion.equals("R")) {
                try {
                    System.out.println("> Introduce el segundo operando: ");
                    operando2 = entrada.nextDouble();
                } catch (Exception err2) {
                    System.out.println("ERROR. Formato incorrecto");
                    return;
                }
            }

            // Estructura switch para decidir qué operación realizar
            switch (operacion) {
                case "+": // Calcula la suma
                    resultado_sumar = operando + operando2;
                    System.out.println("El resultado de " + operando + " + " + operando2 + " es " + resultado_sumar);
                    repetir = false;
                    break;

                case "-": // Calcula la resta
                    resultado_resta = operando - operando2;
                    System.out.println("El resultado de " + operando + " - " + operando2 + " es " + resultado_resta);
                    repetir = false;
                    break;

                case "X": // Calcula la multiplicacion
                    resultado_multi = operando * operando2;
                    System.out.println("El resultado de " + operando + " x " + operando2 + " es " + resultado_multi);
                    repetir = false;
                    break;

                case "/":
                    if (operando2 == 0) {
                        // Controla la división entre 0
                        System.out.println("ERROR. No se puede dividir entre 0");
                        repetir = true; // Permite repetir la operación
                        break;
                    } else {
                        // Calcula la division
                        resultado_division = operando / operando2;
                        System.out.println("El resultado de " + operando + " / " + operando2 + " es " + resultado_division);
                        repetir = false;
                        break;
                    }

                case "R":
                    if (operando < 0) {
                        // No se puede calcular la raíz cuadrada de un número negativo
                        System.out.println("ERROR. No se puede calcular la raíz cuadrada de un número negativo");
                        repetir = true;
                        break;
                    } else {
                        // Calcula la raíz cuadrada
                        resultado_raizcuadrada = Math.sqrt(operando);
                        System.out.println("El resultado de la raíz cuadrada es: " + resultado_raizcuadrada);
                        repetir = false;
                        break;
                    }

                default:
                    // Muestra error si la operacion no existe
                    System.out.println("ERROR. No existe esa operacion. Vuelve a hacer la operacion...");
                    repetir = true;
                    break;
            }


            entrada.nextLine();

        } while (repetir == true); // El programa se repite si hubo un error en la operación

    }

}
