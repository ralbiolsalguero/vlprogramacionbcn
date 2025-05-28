package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crea dos métodos. Uno que calcule el area de un circulo y otro que calcule
        //el area de un cilindro

        //A circulo = pi*r*r
        //A un cilindro = Ab * h = A circulo * h

        Scanner scn = new Scanner(System.in);
        float radio, h;



        System.out.println("Introduzca el valor de un radio");
        radio = scn.nextFloat();

        System.out.println("El area del circulo es: "+calcularArea(radio));

        System.out.println("Introduzca una altura");
        h = scn.nextFloat();

        System.out.println("El area del cilindro es: "+areaCilindro(radio,h));

    }

    static float calcularArea(float r){
        final float PI = 3.14f;
        float resultado;

        resultado = PI*r*r;

        return resultado;

    }

    static float areaCilindro(float r, float h){
        float resultado;
        resultado = calcularArea(r) * h;
        return resultado;
    }



}
