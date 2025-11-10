package org.example;

public class StringsCosas {

    static void main() {

        String frase = "VIVA ESPAÑA";

        int tamanyo = frase.length(); //contandor de caracteres
        System.out.println(tamanyo);

        System.out.println(frase.charAt(5)); // caracter unico en su posicion

        String trozo = frase.substring(5,8); // pillamos un caracter a otro caracter inicio y final
        System.out.println(trozo);

        String trozo2 = frase.substring(10);
        System.out.println(trozo2);

        int posicion_ya = frase.indexOf("ÑA"); //caracter especifico que queremos buscar
        System.out.println(posicion_ya);

        int posicion_ya2 = frase.indexOf("ÑA", 5);
        System.out.println(posicion_ya2);

        int posicion_ya_ltima = frase.lastIndexOf("ÑA");
        System.out.println(posicion_ya_ltima);

        String frase_mayuscula = frase.toUpperCase(); //convierte frse palabra caracter mayscula
        System.out.println(frase_mayuscula);
        String frase_minuscula = frase.toLowerCase(); //convierte frse palabra caracter mainuscula
        System.out.println(frase_minuscula);

        String nombre="Kiko             ";
        System.out.println(nombre.trim()+ " - " + nombre+ "#");
        String nombre_mayus = nombre.toUpperCase();

        boolean iguaales = nombre_mayus.trim().equals("KIKO");
        System.out.println(iguaales);

        boolean iguales2 = nombre_mayus.equalsIgnoreCase("Kiko");

        String cambiado = frase.replace("ESPAÑA", "VIVA");
        System.out.println(cambiado);

        String frase_concat = frase.concat("REY");
        System.out.println(frase_concat);
        System.out.println(frase + "REY");
    }

}
