package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int dni, resto;

        System.out.println("Introduzca el número del DNI");
        dni = scn.nextInt();


        System.out.println("Número: "+dni+" Letra: "+calcularLetra(dni));


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
}
