package ejercicio4;

public class Calculadora {
    public static void cambiarValor(int x){
        x = 10;
    }

    public static void main(String[] args) {
        int a = 5; //5
        cambiarValor(a);
        System.out.println(a); //Imprime: 5
    }
}
