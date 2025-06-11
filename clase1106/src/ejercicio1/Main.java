package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char [] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner scn = new Scanner(System.in);
        int dni, resto;

        System.out.println("Introduzca el número del DNI");
        dni = scn.nextInt();

        resto = dni % 23; //resto = 14

        System.out.println(letraDNI[resto]); //letraDNI[14] = Z
        //12345678 -> Z (14)







    }
}
