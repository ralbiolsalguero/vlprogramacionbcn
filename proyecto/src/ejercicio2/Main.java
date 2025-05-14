package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *
        * Crear un programa en Java que lea una cadena de texto y convierta cada carácter en un número según su posición en la cadena y su código ASCII. El cifrado será una secuencia de números separados por guiones (-).
        Instrucciones:
        *
        El programa debe pedir al usuario una cadena de texto.

        Recorre la cadena carácter por carácter usando un bucle for.

        Para cada carácter:

        Calcula su código ASCII (int codigo = (int) caracter;).

        Si la posición del carácter es par, usa un while para sumar un valor extra a su código (por ejemplo, suma 1 tantas veces como la posición indique).

        Si la posición es impar, réstale 1 directamente al código.

        Une todos los valores cifrados en un solo texto, separados por guiones (-).

        Muestra la cadena cifrada al usuario.

        Usa un bucle do-while para permitir cifrar otra cadena hasta que el usuario escriba "STOP".

        Ejemplo de ejecución:

        Introduce una cadena a cifrar:
        Hola
        Cadena cifrada: 73-110-111-100

        ¿Quieres cifrar otra cadena? (escribe STOP para salir):
        Hi
        Cadena cifrada: 73-104

        ¿Quieres cifrar otra cadena? (escribe STOP para salir):
        STOP
        Programa terminado.
        *
        * */


        /*
        * INICIO
        *
        *   1. Hacemos un bucle do-while en el cual comprobamos que la palabra que nos introduzca no sea STOP. Si es STOP parar el programa.
        *   2. Pedimos la cadena a cifrar.
        *   3. Creamos un bucle for, empezando desde el 0, hasta la longitud de la cadena. Haciendo cada vuelta la traducción a codigo ASCII. (int codigo = (int) caracter;).
        *   4. Según hagamos la traducción comprobamos si es par o impar. Si es impar restar 1 al resultado.
            *   5. Si es par. Vamos a ir desde el 0 hasta la posición del codigo ASCII. H -> 10. 0<10 -> ++1. Con un bucle while
            *   6. Añadir el guión, para ello comprobamos que no sea el último caracter.
        *   7. Imprimir resultado una vez se hay hecho todo.
        *   8. Preguntar si quiero cigrar otra cadena.
        *
        * FIN
        * */

        Scanner scn = new Scanner(System.in);
        String texto, resultado = "";
        int codigo;
        char c;

        do{
            System.out.println("Intrdozca una cadena a cifrar");
            texto = scn.nextLine();

            for(int i = 0;i<texto.length();i++){
                c = texto.charAt(i); // int a = array[8]
                codigo = (int) c;
                if(i % 2 == 0){
                    int contador = 0;
                    while(contador < i){
                        codigo++;
                        contador++;
                    }

                }else{
                    codigo--;
                }

                resultado = resultado + codigo;

                if(i < texto.length() - 1){
                    resultado = resultado + "-";
                }

            }
            System.out.println("Cadena cifrada: "+resultado);

            System.out.println("¿Quieres cifrar otra cadena? (Escribe STOP para salir):");
            texto = scn.nextLine();

        }while(!texto.equals("STOP"));










    }
}
