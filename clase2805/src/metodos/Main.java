package metodos;


public class Main {
    public static void main(String[] args) {


        //FUNCIONES -> UN BLOQUE DE CÓDIGO QUE SOLO SE EJECUTA CUANDO ES LLAMADO
        //NO SE PUEDE CREAR UNA FUNCIÓN DENTRO DE OTRO
        //1º FUNCIÓN -> SIN PARAMETROS Y SIN RETURN.
        //2º FUNCIÓN -> CON PARAMETROS Y SIN RETURN.
        //3º FUNCIÓN -> SIN PARAMETORS Y CON RETURN.
        //4º FUNCIÓN -> CON PARAMETROS Y CON RETURN.

        holaMundo();
        saludo("Pepe");
        System.out.println(holaMundo2());
        System.out.println("El resultado de la suma es: "+suma(5,10));


    }

    //1º static + void + nombre + (sin parametros)

    static void holaMundo(){
        System.out.println("Hola mundo");
    }

    //2º static + void + nombre + (parametros)

    static void saludo(String nombre){
        System.out.println("Hola mundo "+nombre);
    }

    //3º static + (tipo de dato) + nombre + (sin parametros)

    static String holaMundo2(){
        return "Hola Mundo";
    }

    //4º static + (tipo de dato) + nombre + (parametros)

    static int suma(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }


}
