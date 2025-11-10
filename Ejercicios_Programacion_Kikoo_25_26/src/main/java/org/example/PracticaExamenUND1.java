package org.example;

import java.util.Scanner;

public class PracticaExamenUND1 {

//        static void main (){
//
//            Scanner entrada = new Scanner(System.in);
//
//            int num=0;
//
//           boolean repetir = false;
//
//
//            do {
//                try {
//                    System.out.println("Introduce un numero: ");
//                    num=entrada.nextInt();
//                    repetir=false;
//                }catch (Exception err1){
//                    System.out.println("ERROR.Introduce un valor valido");
//                    repetir=true;
//                }
//                entrada.nextLine();
//
//            }while (repetir==true);
//
//            if (num<0){
//                num = num*-1;
//                System.out.println("El valor absoluto es: " +num);
//            }else {
//                System.out.println("El valor absoluto es: " +num);
//            }
//
//        }

//        static void main (){
//            Scanner entrada = new Scanner(System.in);
//
//
//            boolean repetir = false;
//
//            int ancho_pared=0;
//            int largo_pared=0 ;
//            int ancho_azulejo=0;
//            int largo_azulejo=0;
//
//            System.out.println("Introduce tu nombre:");
//            String nombre = entrada.next();
//            System.out.println("La obra de "+ nombre);
//
//            do {
//
//
//                try {
//
//                    System.out.println("Introduce el ancho de la pared: ");
//                    ancho_pared=entrada.nextInt();
//
//                    System.out.println("Introduce el largo de la pared: ");
//                    largo_pared= entrada.nextInt();
//
//                    System.out.println("Introduce el ancho del azulejo: ");
//                    ancho_azulejo= entrada.nextInt();
//
//                    System.out.println("Introduce el largo del azulejo: " );
//                    largo_azulejo= entrada.nextInt();
//
//                    repetir=false;
//                }catch (Exception err1){
//                    System.out.println("ERROR.Introduce un valor valido");
//                    repetir=true;
//                }
//
//                entrada.nextLine();
//
//
//            }while (repetir==true);
//
//            double horizontal = (ancho_pared/ancho_azulejo)*(largo_pared/largo_azulejo);
//
//            double vertical = (ancho_pared/largo_azulejo)*(largo_pared/ancho_azulejo);
//
//            double resultado = (ancho_pared * largo_pared)/largo_azulejo;
//
//            if (horizontal>vertical){
//                System.out.println("Se necesitgan "+horizontal+" azulejos");
//
//            }else if (vertical>horizontal){
//                System.out.println("Se necesitgan "+vertical+" azulejos");
//            }else{
//                System.out.println("ERROR");
//            }
//
//
//
//        }


//    static void main (){
//
//        Scanner entrada = new Scanner(System.in);
//
//
//        boolean repetir = false;
//
//        double nota_media_primera=0;
//        double nota_media_segunda=0;
//        double nota_media_tercera=0;
//
//
//        do {
//            try {
//                System.out.println("Introduce la nota del primer trimestre (0-10): ");
//                nota_media_primera = entrada.nextDouble();
//
//                System.out.println("Introduce la nota del segundo trimestre (0-10): ");
//                nota_media_segunda = entrada.nextDouble();
//
//                System.out.println("Introduce la nota del tercera trimestre (0-10): ");
//                nota_media_tercera = entrada.nextDouble();
//
//                repetir=false;
//
//            }catch (Exception err1){
//                System.out.println("ERROR. Formato incorrecto");
//                repetir=true;
//                return;
//            }
//
//            entrada.nextLine();
//
//          if (nota_media_primera<0||nota_media_primera>10 || nota_media_segunda<0 || nota_media_segunda>10 || nota_media_tercera<0 || nota_media_tercera>10){
//              System.out.println("Nota fuera de rango(0-10). Vuelve a introducirlas...");
//              repetir=true;
//          }else {
//
//              double nota_media= (nota_media_primera+nota_media_segunda+nota_media_tercera)/3;
//
//              if (nota_media>=5){
//                  System.out.print("La media obtenida es " + nota_media + ". APROBADO");
//              }else {
//                  System.out.print("La media obtenida es " + nota_media + ". SUSPENDIDO");
//              }
//
//              repetir=false;
//          }
//
//
//        }while (repetir==true);
//
//
//    }


}
