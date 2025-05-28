package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //MÉTODOS CON ARRAYS
        Scanner scn = new Scanner(System.in);
        int l;

        System.out.println("Introduzca la longitud de mi array");
        l = scn.nextInt();

        int [] array = new int[l];

        for(int i = 0;i< array.length;i++){
            System.out.println("Introduza el valor "+(i+1));
            array[i] = scn.nextInt();
        }

        System.out.println("La suma de números del array es: "+sumaNumeros(array));

    }

    static int sumaNumeros(int [] n){
        int suma = 0;

        for(int i = 0;i<n.length;i++){
            suma += n[i]; //suma = suma + n[i]
        }

        return suma;
    }

}
