package org.example;

public class CosasSwitch {

    static void main() {


        char dia_de_la_semana = 'X';

        switch (dia_de_la_semana){

            case 'L':
            case 'M':
            case 'X':
            case 'J':
            case 'V':
                System.out.println("ENTRE SEMANA");
                break;
            case 'S':
            case 'D':
                System.out.println("FIN DE SEMANA");
                break;
            default:
                System.out.println("Dia no valido");
                break;


        }

    }
}
