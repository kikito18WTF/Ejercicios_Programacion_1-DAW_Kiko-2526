package org.example;

import java.util.Arrays;

public class split {
    static void main() {


        String cadena = "MADRID, BARCA, VALENCIA, ELCHE, HERCULES";

        String equipos[] = cadena.split(",");

        System.out. println(Arrays.toString(equipos));
    }
}
