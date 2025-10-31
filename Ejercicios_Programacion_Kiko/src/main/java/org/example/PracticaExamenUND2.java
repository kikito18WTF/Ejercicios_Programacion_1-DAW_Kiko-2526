package org.example;

import java.util.Random;
import java.util.Scanner;

public class PracticaExamenUND2 {

    static void main() {


        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);

//        int numero = aleatorio.nextInt(101);
//
//        System.out.println(numero);
//
//        int numero2= 0;
//
//
//        System.out.println("Acabo de pensar un número [0-100]… ¿puedes adivinarlo? ¡Tienes 10 intentos!");
//
//        for (int i = 1; i <=10 ; i++) {
//
//            try {
//                System.out.println("Intento "+ i +". Introduce un numero: " );
//                numero2= entrada.nextInt();
//
//
//
//            }catch (Exception err1){
//                System.out.println("ERROR. Formato no valido");
//                return;
//            }
//
//            if (numero2 < 0 || numero2 > 100) {
//                System.out.println("ERROR. El numero a adivinar es entre el 0 y 100");
//                return;
//            }else {
//
//
//                if (numero2 > numero) {
//                    System.out.println("Tu número es mayor al que he pensado.");
//                } else if (numero2 < numero) {
//                    System.out.println("Tu número es menor al que he pensado");
//                } else {
//                    System.out.println("¡HAS ACERTADO! El número era " + numero);
//                    return;
//                }
//
//            }
//
//        }
//
//        System.out.println("Has perdido. Te has quedado sin intentos");


//        final int ANYO_ACTUAL=2025;
//        int anyo = 0;
//
//
//
//        try {
//            System.out.println("Elige un año: ");
//            anyo = entrada.nextInt();
//        }catch (Exception err1){
//            System.out.println("ERROR. Formato no valido");
//              return;
//        }
//
//        if (anyo < 1900 || anyo > ANYO_ACTUAL) {
//            System.out.println("ERROR. El rango de año tiene que ser entre 1900 y el año actual");
//        }else {
//
//            int cont_bisiestos=0;
//
//            for (int i = anyo; i <= ANYO_ACTUAL; i++){
//
//                if (i % 4 == 0 && i % 100 != 0 || i % 400 ==0 ){
//                    cont_bisiestos ++;
//                }
//
//            }
//
//            System.out.println("Ha habido "+ cont_bisiestos+ " años bisiestos");
//
//        }


//        String p= "Piedra";
//        String a= "Papel";
//        String t= "Tijera";
//
//
//
//        String opcion = " ";
//
//        String opcion_pc= " ";
//
//        int puntos_usuario = 0;
//        int puntos_ordenador = 0;
//
//        for (int i = 1; i <=3 ; i++) {
//
//            int numero = aleatorio.nextInt(3);
//            System.out.println("Ronda "+ i);
//            System.out.println("¿Piedra, papel o tijera? (p/a/t): ");
//            opcion = entrada.next();
//
//            if (numero == 0){
//                opcion_pc = "p";
//                System.out.println("El ordenador  ha elegido: "+ p);
//            } else if (numero == 1) {
//                opcion_pc = "a";
//                System.out.println("El ordenador  ha elegido: "+ a);
//            } else{
//                opcion_pc = "t";
//                System.out.println("El ordenador  ha elegido: "+ t);
//            }
//
//            if (opcion.equals(opcion_pc)){
//                System.out.println("EMPATE");
//                i--;
//                continue;
//            }
//
//            if (opcion.equals("p") && opcion_pc.equals("t") || opcion.equals("t") && opcion_pc.equals("a") || opcion.equals("a") && opcion_pc.equals("p")) {
//
//                System.out.println("¡Has ganado esta ronda!");
//                puntos_usuario++;
//
//            } else {
//                // Casos en los que gana el ordenador
//                System.out.println("¡Has perdido esta ronda!");
//                puntos_ordenador++;
//            }
//
//            System.out.println("Marcador actual (PC-usuario): " + puntos_ordenador + "-" + puntos_usuario);
//            System.out.println("----------------------------------");
//
//        }
//
//        if (puntos_usuario > puntos_ordenador) {
//            System.out.println("¡GANA EL USUARIO!");
//        } else if (puntos_usuario < puntos_ordenador) {
//            System.out.println("¡GANA EL ORDENADOR!");
//        } else {
//            System.out.println("EMPATE FINAL");
//        }



        final int ANYO_ACTUAL=2025;
        int anyo = 0;

        int edad_cont=0;

        try {
            System.out.println("Dame tu año de nacimiento: ");
            anyo = entrada.nextInt();
        }catch (Exception err1){
                System.out.println("ERROR.Formato no valido");
        }

        if (anyo < 1900 || anyo> ANYO_ACTUAL){
            System.out.println("ERROR. Rango no valido");
        }else {
            for (int i = anyo; i <=ANYO_ACTUAL ; i++) {

                System.out.println(i+ " - edad: "+ edad_cont);
                edad_cont ++;

            }
        }








    }

}
