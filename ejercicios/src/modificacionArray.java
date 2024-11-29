public class modificacionArray {
    // Método para modificar los valores del array
    public static void modificarArray(int[] arr) {
        // Modificamos algunos elementos del array
        for (int i = 0; i < arr.length; i++) {
            // Multiplicamos cada elemento por 2
            arr[i] = arr[i] * 2;
        }
    }

    // Método para imprimir los elementos del array
    public static void imprimirArray(int[] arr) {
        for (int elemento : arr) {
            System.out.print(elemento + " ");
        }
        System.out.println(); // Salto de línea al final
    }

    // Método main para demostrar el paso por referencia
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] miArray = {1, 2, 3, 4, 5};
        
        // Imprimir array original
        System.out.println("Array original:");
        imprimirArray(miArray);
        
        // Modificar el array
        modificarArray(miArray);
        
        // Imprimir array después de modificar
        System.out.println("Array después de modificar:");
        imprimirArray(miArray);
    }
}