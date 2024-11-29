public class valorModificado {
    public static int incrementar(int x) {
        // Incrementamos x en 1 y lo devolvemos
        return x + 1;
    }

    // Método main para demostrar el paso por valor
    public static void main(String[] args) {
        // Declaramos una variable x
        int x = 5;
        
        // Mostramos el valor original
        System.out.println("Valor original de x: " + x);
        
        // Llamamos al método incrementar sin usar su valor de retorno
        incrementar(x);
        System.out.println("Después de llamar al método sin usar el retorno:");
        System.out.println("x sigue siendo: " + x);
        
        // Llamamos al método incrementar y asignamos su valor de retorno
        x = incrementar(x);
        System.out.println("Después de asignar el valor de retorno:");
        System.out.println("x es ahora: " + x);
    }
}
