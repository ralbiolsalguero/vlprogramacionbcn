package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char c;
        int num;

        System.out.println("Introduzca el número del DNI");
        num = scn.nextInt();

        System.out.println("Introduza la letra de su DNI");
        c = scn.next().toUpperCase().charAt(0);

    }

    static char calcularLetra(int dni){
        int resto;
        char letra;
        char [] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        resto = dni % 23; //resto = 14
        letra = letraDNI[resto];

        return letra;
    }

    //MÉTODO QUE LE PASEMOS EL NÚMERO Y LA LETRA POR OTRO, Y TENDREMOS QUE DECIR
    //SI EL DNI, ES CORRECTO O NO LO ES

    static boolean verificarDNI(int dni, char letra){

        boolean resultado = calcularLetra(dni) == letra;

        return resultado;

    }

}
