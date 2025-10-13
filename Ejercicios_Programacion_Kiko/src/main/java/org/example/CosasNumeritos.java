package org.example;

import java.util.Scanner;

public class CosasNumeritos {

    static void main () {


        Scanner entrada = new Scanner(System.in);

        int multiplicando = 0;
        int multiplicador = 0;





      try{
          System.out.println("Introduce el multiplicando (3 cifras): ");
          multiplicando = entrada.nextInt();

          System.out.println("Introduce el multiplicador (3 cifras): ");
          multiplicador = entrada.nextInt();

          String num_string = Integer.toString(multiplicador);
          String multiplicador_izquierda= num_string.substring(0,1);
          int multiplicador_izquierda_int = Integer.parseInt(multiplicador_izquierda);

          String multiplicador_centro= num_string.substring(1,2);
          int multiplicador_centro_int = Integer.parseInt(multiplicador_centro);

          String multiplicador_derecha= num_string.substring(2,3);
          int multiplicador_derecha_int = Integer.parseInt(multiplicador_derecha);

      }catch (Exception err1){
          System.out.println("ERROR. Formato incorrecto");
          return;
      }

      if (multiplicando >= 100 || multiplicando <= 999 || multiplicador >= 100 || multiplicador <= 999 ){
          int resultado = multiplicando * multiplicador;
          System.out.println("El producto de la multiplicacion es: "+ resultado);
          System.out.println("El proceso es: ");
          System.out.println(multiplicando);
          System.out.println("x "+ multiplicador);
          System.out.println("-----");


      }





    }
}
