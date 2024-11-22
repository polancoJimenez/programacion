import java.util.Scanner;

public class promedioNumerosArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        double promedio;
        System.out.println("ingrese el tamaño del array");
        /* dale tamaño al array */
        int tamañoArray = scanner.nextInt();
        int[] valores = new int[tamañoArray];

        /* para darle valores al array */
        System.out.println("ingresa los valores del array de tamaño " + tamañoArray + " hazlo con espacios");
        for (int contador = 0; contador < tamañoArray; contador++) {
            valores[contador] = scanner.nextInt();
        }
        /*suma de valores*/
        for (int valor : valores) {
            result += valor;
        }
        /*promedio de valores */
        promedio = result / tamañoArray;
        System.out.println("el promedio de los valores del array es: " + promedio);
        /*
         * para visualizar los valores del array
         * System.out.println("\nlos valores del array son: ");
         * for (int valor : valores) {
         * System.out.print(valor + " ");
         * }
         */
        scanner.close();
    }
}
