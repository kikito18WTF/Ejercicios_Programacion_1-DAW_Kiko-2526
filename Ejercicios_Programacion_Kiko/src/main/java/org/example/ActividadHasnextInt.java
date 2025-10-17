package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ActividadHasnextInt {

    static void main() {


        Scanner entrada = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA CLASIFICACIONN DE GENERACIONES");
        System.out.println("ELIGE UN MDOO: ");
        System.out.println("1. AÑO DE NACIMIENTO");
        System.out.println("2. EDAD");

        String modo = entrada.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo_nacimiento = 1800;

        boolean error = false;

        if (modo.equals("1")){

            System.out.println("Introduce año de nacimiento: ");
            String anyo = entrada.next();


            try {
                anyo_nacimiento = Integer.parseInt(anyo);
            }catch (NumberFormatException e1){
                System.out.println("El formato del año no es correcto" + e1.getMessage());
                error=true;
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                System.out.println("El año introducido no es correcto");
                error=true;
            }

        } else if (modo.equals("2")) {
            System.out.println("Introduce tu edad: ");
            int edad = 0;

            if (entrada.hasNextInt()){
                edad = entrada.nextInt();
            }else {
                System.out.println("El formato de la edad es incorrecto");
                error=true;
            }

            if (edad < 0){
                System.out.println("La edad introducida no es correcta");
                error=true;
            }else {
                anyo_nacimiento = anyo_actual - edad;

            }

        }else {
            System.out.println("ERROR. No hay tercer modo");
            error=true;
        }
        if (!error){
            if (anyo_nacimiento>=1900 && anyo_nacimiento<=1927){
                System.out.println("Eres de la generacion fosil");
            } else if (anyo_nacimiento>=1928 && anyo_nacimiento<=1944) {
                System.out.println("Eres de la generacion Silent");

            } else if (anyo_nacimiento>=1945 && anyo_nacimiento<=1964) {
                System.out.println("Eres de la generacion baby boommer");
            } else if (anyo_nacimiento>=1965 && anyo_nacimiento<=1981) {
                System.out.println("Generacion X");
            } else if (anyo_nacimiento>=1982 && anyo_nacimiento<=1994) {
                System.out.println("Generacion Y");
            } else if (anyo_nacimiento>=1995 && anyo_nacimiento<=anyo_actual) {
                System.out.println("La mejor generacion");
            }else {
                System.out.println("No tienes generacion");
            }
        }



    }
}
