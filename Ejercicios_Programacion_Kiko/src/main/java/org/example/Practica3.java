package org.example;



import java.util.Scanner;

public class Practica3 {

    static void main (){
        Scanner entrada = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        int altura=0 ;
        int altura_restante;
        int peso=0;
        // Declaración de variables

        try{
            System.out.println("Leyendo altura (cm)...");
            altura = entrada.nextInt();
            // Se intenta leer la altura del usuario
        }catch (Exception err1) {
            System.out.println("ERROR. Introduce numeros, no letras");
            return;
            // Si mete letras en lugar de numeros, error y se termina
        }

        altura_restante=140-altura;  // Calcula cuantos cm faltan para alcanzar la altura minima


        if (altura < 0 || altura > 230){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELVE A SUBIR...");
            // Control de error si la altura es menor a 0 o mayor a 230
        } else if (altura < 140) {
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan "+ altura_restante+ " cm de altura");
            // Si la altura es  menor a 140 cm, no puede subir
        }else {
            // Si la altura es correcta , se pasa a leer el peso

            try {
                System.out.println("Leyendo peso...");
                peso=entrada.nextInt();
                // Se intenta leer el peso del usuario
            }catch (Exception err2){
                System.out.println("ERROR. Introduce numeros, no letras");
                return;
                // Si mete letras en lugar de numeros, error y se termina
            }

            double peso_minimo = (altura * 2)/8.0;  // Calculo para calcular el peso minimo permitido segun altura


            int peso_maximo = peso - 120;  // Calcula cuantos kilos sobrepasa el limite de 120 kg


            if (peso > 120) {
                System.out.println("LO SIENTO. Sobrepasas " + peso_maximo + " kg el limite de la atraccion");
                // Si pesa más de 120 kg  no puede subir
            } else if (peso<peso_minimo) {
                System.out.println("LO SIENTO. No puede subir a la atraccion. El peso minimo es de "+ peso_minimo+ " kg");
                // Si pesa menos del minimo calculado  no puede subir
            } else {
                System.out.println("Pesas " + peso + " kg. Peso minimo calculado: " + peso_minimo + " kg. !SUBE A LA ATRACCION!");
                // Si cumple altura y peso  puede subir a la atracción
            }
        }
    }
}



