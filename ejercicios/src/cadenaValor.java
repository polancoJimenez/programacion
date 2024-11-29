public class cadenaValor {
    // Método que intenta modificar una cadena
    public static String modificarCadena(String texto) {
        // Intentamos modificar la cadena
        texto = texto + " - Modificado";
        
        // Otra forma de intentar modificar
        texto = texto.toUpperCase();
        
        return texto;
    }

    // Método main para demostrar la inmutabilidad
    public static void main(String[] args) {
        // Creamos una cadena original
        String miCadena = "Hola Mundo";
        
        // Mostramos el valor original
        System.out.println("Cadena original: " + miCadena);
        
        // Llamamos al método que intenta modificar la cadena
        modificarCadena(miCadena);
        
        // Imprimimos la cadena después del método
        System.out.println("Cadena después del método: " + miCadena);
        
        // Mostramos cómo realmente modificar la cadena
        miCadena = modificarCadena(miCadena);
        System.out.println("Cadena después de asignar el retorno: " + miCadena);
    }
}
