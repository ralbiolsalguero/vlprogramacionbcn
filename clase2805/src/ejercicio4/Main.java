package ejercicio4;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * CREA DOS MÉTODOS.
        *
        * 1 -> Me va a devolver el número más grande del array
        *
        * 2 -> Me va a devolver el número más pequeño del array
        *
        * */

        int [] num = {10,20,30,1,2,3,50,100,2};

        System.out.println(encontrarMayor(num));
        System.out.println(encontrarMenor(num));

    }



    static int encontrarMayor(int [] array){
        int mayor = array[0]; //mayor = 20
        for(int i = 1;i<array.length;i++){ //i = 5
            if(array[i] > mayor){ //array[5] > 20
                mayor = array[i]; // mayor = 50
            }
        }
        return mayor;
    }

    static int encontrarMenor(int [] array){
        int menor = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] < menor){
                menor = array[i];
            }
        }
        return menor;
    }

}
