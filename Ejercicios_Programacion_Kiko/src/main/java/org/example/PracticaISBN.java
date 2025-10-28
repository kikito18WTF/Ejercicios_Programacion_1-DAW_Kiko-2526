package org.example;

import java.util.Scanner;

public class PracticaISBN {


    static void main() {

        Scanner entrada = new Scanner(System.in);

        int opcion;



        String isbn= "";
        final int TAMANYO_MAX_ISBN=10;

        int tamanyo= 0;

        int numero ;
        int suma = 0;

        do {
            // Mostrar menú
            System.out.println("VALIDADOR ISBN");
            System.out.println("--------------");
            System.out.println("1.- Validar ISBN");
            System.out.println("2.- Reparar ISBN");
            System.out.println("3.- Salir");

            // Leer opción
            System.out.println("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                        System.out.println("Introduzca ISBN: ");
                        isbn = entrada.next();
                        tamanyo = isbn.length();

                        if (tamanyo > TAMANYO_MAX_ISBN){
                            System.out.println("ERROR. Exceso de caracteres");
                            return;
                        } else if (tamanyo < TAMANYO_MAX_ISBN) {
                            System.out.println("ERROR. Falta de caracteres");
                        }else {
                            for (int i = 0; i<10 ; i++){
                               char isbn_unico = isbn.charAt(i);
                                System.out.println(isbn_unico);
                               if (isbn_unico == 'X'){
                                   numero = 10;
                               }else {
                                   numero = Integer.parseInt(String.valueOf(isbn_unico));
                               }
                                suma +=  numero * (10 - i);



                            }
                            if (suma % 11 == 0){
                                System.out.println("El ISBN es valido");
                            }else {
                                System.out.println("El ISBN no es valido");
                            }
                        }

                    break;

                case 2:

                    System.out.println("Introduzca ISBN para reparar: ");
                    isbn = entrada.next();
                    tamanyo = isbn.length();

                    if (tamanyo > TAMANYO_MAX_ISBN){
                        System.out.println("ERROR. Exceso de caracteres");
                        return;
                    } else if (tamanyo < TAMANYO_MAX_ISBN) {
                        System.out.println("ERROR. Falta de caracteres");
                        return;
                    }else {
                        for (int i = 0; i<10 ; i++){
                            char isbn_unico = isbn.charAt(i);

                            if (isbn_unico == '?'){

                                System.out.println(isbn_unico);
                            }



                        }
                        if (suma % 11 == 0){
                            System.out.println("El ISBN es valido");
                        }else {
                            System.out.println("El ISBN no es valido");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("ERROR. No existe esta opcion. Vuelve a seleccionar una opcion...");
            }
            entrada.nextLine();

        } while (opcion != 3);


    }


}
