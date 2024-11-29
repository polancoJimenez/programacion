class Persona {
    String nombre;
}

public class pasoReferenciaObjetos {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "pepe";
        System.out.println("nombre antes de cambiar " + persona.nombre);
        cambiarNombre(persona);
        System.out.println("nombre despues de cambiar " + persona.nombre);
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "maria";
    }
}
