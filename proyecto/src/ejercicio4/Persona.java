package ejercicio4;

public class Persona {
    String nombre;
}

class Objetos{
    public static void cambiarNombre(Persona p){
        p.nombre = "Carlos";
    }

    public static void main(String [] args){
        Persona persona = new Persona(); //#ABCD
        persona.nombre = "Ana";

        cambiarNombre(persona);
        System.out.println(persona.nombre); //Carlos

    }
}
