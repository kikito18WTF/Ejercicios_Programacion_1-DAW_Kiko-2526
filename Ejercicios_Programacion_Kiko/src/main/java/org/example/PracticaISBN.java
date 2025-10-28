package org.example;

import java.util.Scanner;

public class PracticaISBN {

    static void main() {

        // Crea el objeto Scanner para leer los datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables generales
        int opcion = 0;
        String isbn = "";
        final int TAMANYO_MAX_ISBN = 10;
        int tamanyo = 0;
        int numero;
        int suma = 0;

        // Bucle principal del menu se repite hasta que el usuario elija salir
        do {
            try {
                // Muestra el menú de opciones
                System.out.println("VALIDADOR ISBN");
                System.out.println("--------------");
                System.out.println("1.- Validar ISBN");
                System.out.println("2.- Reparar ISBN");
                System.out.println("3.- Salir");
                System.out.println("Elige una opcion: ");

                // Lee la opción seleccionada
                opcion = entrada.nextInt();
            } catch (Exception err1) {
                System.out.println("ERROR. Formato incorrecto");
                return;
            }

            // Selecciona la acción según la opción elegida
            switch (opcion) {

                case 1:
                    System.out.println("Introduzca ISBN: ");
                    isbn = entrada.next();
                    tamanyo = isbn.length();

                    // Comprueba si el tamaño es correcto
                    if (tamanyo > TAMANYO_MAX_ISBN) {
                        System.out.println("ERROR. Exceso de caracteres");
                    } else if (tamanyo < TAMANYO_MAX_ISBN) {
                        System.out.println("ERROR. Falta de caracteres");
                    } else {
                        suma = 0; // Reinicia la suma antes de calcular

                        // Recorre cada caracter del ISBN
                        for (int i = 0; i < 10; i++) {
                            char isbn_unico = isbn.charAt(i);

                            // Si es X, su valor numerico es 10
                            if (isbn_unico == 'X') {
                                numero = 10;
                            } else {
                                // Convierte el caracter en numero
                                numero = Integer.parseInt(String.valueOf(isbn_unico));
                            }

                            // Multiplica por su peso  y se acumula
                            suma += numero * (10 - i);
                        }

                        // Comprueba si la suma es multiplo de 11
                        if (suma % 11 == 0) {
                            System.out.println("El ISBN es valido");
                        } else {
                            System.out.println("El ISBN no es valido");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Introduzca ISBN para reparar: ");
                    isbn = entrada.next();
                    tamanyo = isbn.length();

                    // Control de longitud del ISBN
                    if (tamanyo > TAMANYO_MAX_ISBN) {
                        System.out.println("ERROR. Exceso de caracteres");
                    } else if (tamanyo < TAMANYO_MAX_ISBN) {
                        System.out.println("ERROR. Falta de caracteres");
                    } else {
                        int peso_falta = 0;  // peso del caracter que falta
                        int resultado;       // valor del digito que falta
                        suma = 0;            // reinicia la suma

                        // Recorre el ISBN caracter a caracter
                        for (int i = 0; i < 10; i++) {
                            char isbn_unico = isbn.charAt(i);

                            if (isbn_unico == '?') {
                                // Guarda el peso de la posición del ?
                                peso_falta = 10 - i;
                            } else {
                                // Convierte cada caracter en número
                                if (isbn_unico == 'X') {
                                    numero = 10;
                                } else {
                                    numero = Integer.parseInt(String.valueOf(isbn_unico));
                                }
                                // Suma el valor multiplicado por su peso
                                suma += numero * (10 - i);
                            }
                        }

                        // Calcula el valor del digito que falta
                        resultado = (11 - (suma % 11)) / peso_falta;

                        // Muestra  el resultado si es valido
                        if (resultado >= 0 && resultado <= 10) {
                            if (resultado == 10) {
                                System.out.println("El dígito que falta es: X");
                            } else {
                                System.out.println("El dígito que falta es: " + resultado);
                            }
                        } else {
                            System.out.println("No se ha encontrado ningún número válido para este ISBN.");
                        }
                    }
                    break;
                case 3:
                    // Se sale del programa
                    System.out.println("Saliendo...");
                    break;



                default:
                    System.out.println("ERROR. No existe esta opcion. Vuelve a seleccionar una opcion...");
            }


            entrada.nextLine();

        } while (opcion != 3); // El menú se repite hasta que el usuario elija salir
    }
}
