package org.example;



import java.util.Scanner;

public class Practica3 {

    static void main (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        int altura=0 ;
        int altura_restante;
        int peso=0;


        try{
            System.out.println("Leyendo altura (cm)...");
            altura = entrada.nextInt();


        }catch (Exception err1) {
            System.out.println("ERROR. Introduce numeros, no letras");
            return;
        }

        altura_restante=140-altura;

        if (altura < 0 || altura > 230){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELVE A SUBIR...");
        } else if (altura < 140) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan "+ altura_restante+ " cm de altura");
        }else {

            try {
                System.out.println("Leyendo peso...");
                peso=entrada.nextInt();
            }catch (Exception err2){
                System.out.println("ERROR. Introduce numeros, no letras");
                return;
            }
            double peso_minimo = (altura * 2)/8.0;

            int peso_maximo = peso - 120;

            if (peso > 120) {
                System.out.println("LO SIENTO. Sobrepasas " + peso_maximo + " kg el limite de la atraccion");
            } else if (peso<peso_minimo) {
                System.out.println("LO SIENTO. No puede subir a la atraccion. El peso minimo es de "+ peso_minimo+ " kg");
            } else {
                System.out.println("Pesas " + peso + " kg. Peso minimo calculado: " + peso_minimo + " kg. !SUBE A LA ATRACCION!");
            }
        }









    }


}
