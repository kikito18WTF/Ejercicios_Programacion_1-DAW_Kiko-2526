package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    static void main() {


        Random aleatorio= new Random();

//        int vector_numero[] ={8,7,0,1,3,4};
//
//        String vecto_palabra[]={"kiko", "alvaro","pedro"};
//
//        System.out.println(Arrays.toString(vector_numero)); //imprime los vectores de la variable int
//
//        System.out.println(Arrays.toString(vecto_palabra)); //imprime los vectores de la variable String
//
//        vector_numero[0]=10; // esto cambia el numero del vector original de su posicion por otro numero
//        vector_numero[1]=3; // esto cambia el numero del vector original  de su posicion por otro numero
//        System.out.println(Arrays.toString(vector_numero));
//
//        vecto_palabra[0]="Patricia";
//        System.out.println(Arrays.toString(vecto_palabra)); //esto cambia la palabra del vector original de su posicion por otra palabra
//
//        int vector2[] = new int[6];
//        System.out.println(Arrays.toString(vector2));
//
//        String vector_2[] = new String[6];
//        System.out.println(Arrays.toString(vector_2));
//
//
//        //no se puede cambiar el tamaño de un vector
//
//
//        System.out.println(vector_numero); //sale el numero de la memoria del vector
//
//
//        vector_numero=vector2; //si cambias algo de uno tambien se cambia en el otro
//
//        vector2[2]=23;
//
//        System.out.println(Arrays.toString(vector_numero));
//
//        System.out.println(Arrays.toString(vector2));




//
//        vector_numero=vector2.clone(); //si cambias algo en de uno solo se cambia en ese el otro se queda igual
//
//        vector2[2]=5;
//
//        System.out.println(Arrays.toString(vector_numero));
//
//        System.out.println(Arrays.toString(vector2));
//
//
//        System.out.println(vector_numero.length); //tamaño del vector
//
//
//        //recorre el vector poniedo el tamaño
//        int vect_num[] = {2,4,5,7,3};
//        for (int i = 0; i < vect_num.length ; i++) {
//
//            System.out.println("Numero:"+ vect_num[i]);
//
//        }

//        recorre el vector para al reves

//        for (int i = vect_num.length-1; i >=0 ; i--) {
//
//            System.out.println("Numero:"+ vect_num[i]);
//        }


        //EJ 1 BATERIA
//        int numeros[] = new int[8];
//
//        int cont =0;
//
//        for (int i = 0; i < numeros.length ; i++) {
//
//            numeros[i] = aleatorio.nextInt(501);// numero aleatorio del 0 al 500
//
//            cont += numeros[i];
//        }
//
//        System.out.println(Arrays.toString(numeros));
//        System.out.println("El resultado es: "+cont);


        //EJ 2 BATERIA



//        int vect_original[]= {1,2,3,4,5};
//
//        int aux = 0;
//
//        //invertir un vector posicion x posicion
//        for (int i = 0; i < vect_original.length/2; i++) {
//
//            aux = vect_original[i];
//            vect_original[i]=vect_original[vect_original.length-1-i];
//            vect_original[vect_original.length-1-i]=aux;
//
//
//        }
//        System.out.println(Arrays.toString(vect_original));


        //EJ 3
        Scanner entrada = new Scanner(System.in);

//        int cant_vectores []= new int[25];
//
//        for (int i = 0; i < cant_vectores.length ; i++) {
//
//            cant_vectores[i] = aleatorio.nextInt(101);
//
//        }
//
//        System.out.println(Arrays.toString(cant_vectores));
//
//        System.out.println("Ingresa un numero para buscar [0,100]: ");
//        int buscar_num= entrada.nextInt();
//
//        int contador = 0;
//
//        for (int i = 0; i <cant_vectores.length ; i++) {
//
//            if (cant_vectores[i]== buscar_num){
//                contador++;
//            }
//
//        }
//
//        System. out.println("El numero "+ buscar_num+ " aparece "+ contador+" veces en el array");
                


        //EJ 4

//        int vector[] = {1,3,5,7,9};
//
//
//        int nuevo_vector[] = new int[vector.length-1];
//        System.out.println("Ingresa el indice a eliminar: ");
//        int pos = entrada.nextInt();
//
//        for (int i = 0; i < nuevo_vector.length ; i++) {
//
//
//            if (i>=pos){
//                nuevo_vector[i]=vector[i+1];
//            }else {
//                nuevo_vector[i]=vector[i];
//            }
//
//
//
//        }
//
//        System.out.println(Arrays.toString(nuevo_vector));


        //EJ 5
//
//        int vector[] = {1,2,3,4,5};
//
//        int aux=0;
//
//        for (int i = 0; i < vector.length ; i++) {
//
//            aux = vector[i];
//            vector[i]=vector[vector.length-1];
//            vector[vector.length-1]=aux;
//
//        }
//
//        System.out.println(Arrays.toString(vector));


        //EJ 6

        int vector[] = {1,2,3,2,1};

        for (int i = 0; i < vector.length ; i++) {

            if (vector[i]!=vector[vector.length-1-i]){
                System.out.println("No es");
                break;
            }



        }

        System.out.println("Es palindromo");
    }
}
