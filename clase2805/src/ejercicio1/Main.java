package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crea un programa en el cual al usuario
        //le preguntaremos su edad, y le diremos
        // si se puede matricular o no. Si tiene 18 años
        //se puede matircular y si tiene menos, no se puede matricular

        Scanner scn = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca su edad");
        edad = scn.nextInt();

        if(calcularEdad(edad)){
            System.out.println("Usted se puede matricular");
        }else{
            System.out.println("Usted no se puede matricular");
        }



    }

    static boolean calcularEdad(int edad2){
        boolean resultado;
        if(edad2 >= 18){
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
