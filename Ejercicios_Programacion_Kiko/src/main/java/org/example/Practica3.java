package org.example;


import java.util.Scanner;

public class Practica3 {

    static void main (){

        Scanner entrada = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        int altura ;
        int altura_restante;



        try{
            System.out.println("Leyendo altura (cm)...");
            altura = entrada.nextInt();

             altura_restante = 140 - altura;
            if (altura < 0 || altura > 230){
                System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELVE A SUBIR...");
            } else if (altura < 140) {
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan "+ altura_restante+ " cm de altura");
            }else {
                System.out.println("Leyendo peso (kg)...");
                int peso = entrada.nextInt();

                double peso_minimo = altura * 2;
                double peso_minimoo = peso_minimo / 8;

                int peso_maximo = peso - 120;

                if (peso > 120) {
                    System.out.println("LO SIENTO. Sobrepasas " + peso_maximo + " kg el limite de la atraccion");
                } else {
                    System.out.println("Pesas " + peso + " kg. Peso minimo calculado: " + peso_minimoo + " kg. !SUBE A LA ATRACCION!");
                }
            }
        }catch (Exception err1){
            System.out.println("ERROR. Introduce numeros, no letras");
        }












    }


}
