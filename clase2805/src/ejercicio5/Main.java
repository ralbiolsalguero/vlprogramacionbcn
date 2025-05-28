package ejercicio5;

public class Main {
    public static void main(String[] args) {

        //Imaginemos que estamos en una tienda de camisetas
        // Tenemos disponibles los siguientes colores: rojo, amarillo, negro

        //Pediremos al usuario que nos diga un color, sino es rojo, amarillo o negro
        //devolveremos false y si es uno de los colores devolveremos true.




    }

    static boolean esColorDisponible(String color){
        String [] coloresDisponibles = {"Rojo","Amarillo","Negro"};
        boolean resultado = false;

        for(int i = 0;i<coloresDisponibles.length;i++){
            if(coloresDisponibles[i].equalsIgnoreCase(color)){
                resultado = true;
            }
        }
        return resultado;

    }
}
