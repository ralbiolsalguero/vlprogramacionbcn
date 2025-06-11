package ejercicio2;

import java.util.Scanner;

public class Nif {

    //Atributos

    //Modificador de acceso:
    private int dni;
    private char letra;


    //Constructores

    public Nif(){

    }

    public Nif(int dni){
        this.dni = dni;
        letra = calcularLetra();
    }


    //Métodos

    private char calcularLetra(){
        char [] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        char resultado;

        resultado = letra[this.dni % 23];

        return  resultado;

    }

    public void leer(){
        Scanner scn = new Scanner(System.in);
        do{
            System.out.println("Introduzca el dni");
            dni = scn.nextInt();
        }while(this.dni <= 0);

        letra = calcularLetra();
    }

    public String toString(){
        return this.dni+"-"+this.letra;
    }

}
