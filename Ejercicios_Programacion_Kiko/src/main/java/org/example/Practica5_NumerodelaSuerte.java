package org.example;

import java.util.Scanner;

public class Practica5_NumerodelaSuerte {

    static void main() {

        Scanner entrada = new Scanner(System.in);

        boolean repetir = false;

        String fecha_nacimiento = "";

        final int TAMANYO_MAX=10;

        int fecha_nacimiento_izq_entero=0;
        int fecha_nacimiento_centro_entero=0;
        int fecha_nacimiento_derecha_entero=0;

        int fecha_total_N1_entero = 0;
        int fecha_total_N2_entero = 0;
        int fecha_total_N3_entero = 0;
        int fecha_total_N4_entero = 0;

        int tamanyo = 0;

        do {
            try {
                System.out.println("Introduce tu fecha de nacimiento: ");
                fecha_nacimiento = entrada.next();
                tamanyo = fecha_nacimiento.length();
                repetir=false;
            }catch (Exception err1){
                System.out.println("ERROR. Formato incorrecto");

                repetir=true;
            }

            entrada.nextLine();

        }while (repetir==true);

        String fecha_nacimiento_izq = fecha_nacimiento.substring(0,2);
        fecha_nacimiento_izq_entero = Integer.parseInt(fecha_nacimiento_izq);


        String fecha_nacimiento_centro = fecha_nacimiento.substring(3,5);
        fecha_nacimiento_centro_entero = Integer.parseInt(fecha_nacimiento_centro);

        String fecha_nacimiento_derecha = fecha_nacimiento.substring(6,10);
        fecha_nacimiento_derecha_entero = Integer.parseInt(fecha_nacimiento_derecha);

        int fecha_total= fecha_nacimiento_izq_entero+fecha_nacimiento_centro_entero+fecha_nacimiento_derecha_entero;


        String fecha_total2 = Integer.toString(fecha_total);

        String fecha_total_N1 = fecha_total2.substring(0,1);
        fecha_total_N1_entero = Integer.parseInt(fecha_total_N1);

        String fecha_total_N2 = fecha_total2.substring(1,2);
        fecha_total_N2_entero = Integer.parseInt(fecha_total_N2);

        String fecha_total_N3 = fecha_total2.substring(2,3);
        fecha_total_N3_entero = Integer.parseInt(fecha_total_N3);

        String fecha_total_N4 = fecha_total2.substring(3,4);
        fecha_total_N4_entero = Integer.parseInt(fecha_total_N4);

        int numero_suerte = fecha_total_N1_entero+fecha_total_N2_entero+fecha_total_N3_entero+fecha_total_N4_entero;

        System.out.println(fecha_nacimiento);
        System.out.println(fecha_nacimiento_izq_entero + "+" + fecha_nacimiento_centro_entero+ "+" + fecha_nacimiento_derecha_entero + " = " + fecha_total);
        System.out.println(fecha_total_N1_entero+ "+"+ fecha_total_N2_entero+ "+"+ fecha_total_N3_entero+"+"+ fecha_total_N4_entero +" = "+ numero_suerte);
        System.out.println("Tu numero de la suerte es "+ numero_suerte);


    }
}
