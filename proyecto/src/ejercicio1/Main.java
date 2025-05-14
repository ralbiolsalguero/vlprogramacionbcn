package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*CONDICIONALES AVANZADO*/
        /*
        *
        * Escriba un programa en Java que reciba tres números enteros e identifique si pueden
        * representar los lados de un triangulo. Si lo son determina el tipo de triangulo:
        *
        *  - Equilatero: Todos los lados son iguales a = b = c
        *  - Isósceles: Dos lados son iguales
        *  - Escaleno: Todos los lados son diferentes
        *
        * Y también comprobar si es un triangulo rectangulo.
        * a*a + b*b = c*c
        *
        * NOTA: Triangulo valido: a, b, c.  a + b > c también a + c > b y también b + c > a
        *
        *
        * */


        /*PSEUDOCÓDIGO*/

        /*
        *
        * INICIO
        *
        *   1º Introducir a
        *   2º Introducir b
        *   3º Introducir c
        *   4º Comrpobar que con a, b y c pueda formar un triangulo.  a + b > c también a + c > b y también b + c > a
        *   5º En caso de no se pudiera mostraremos el texto: "No es un triangulo válido".
        *   6º En caso de que si se pudiera comprobaremos el tipo de triangulo.
        *   7º Comprobamos si es un triangulo equilatero. a = b = c
        *   8º Comprobamos si es un triangulo isosceles. a = b o a = c o b = c
        *   9º Comprobamos si es escaleno. Todos los lados son diferentes.
        *   10º Comprobamos si es un triangulo rectángulo (Teorema pitagoras) a*a + b*b = c*c
        *
        * FIN
        * */


        Scanner scn = new Scanner(System.in);
        int a, b, c;

        System.out.println("Introduzca el primer lado");
        a = scn.nextInt();

        System.out.println("Introduzca el segundo lado");
        b = scn.nextInt();

        System.out.println("Introduzca el tercer lado");
        c = scn.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Es un triangulo válido");
            if(a == b && b == c){ //a = b = c
                System.out.println("Es un triángulo equilatero");
            }else if(a == b || a == c || b == c){
                System.out.println("Es un triángulo isósceles");
            }else{
                System.out.println("Es un triángulo escaleno");
            }

            if((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (b*b) + (c*c) == (a*a)) {
                System.out.println("Además es un triangulo rectangulo");
            }

        }else{
            System.out.println("No es un triangulo válido");
        }



    }

}
