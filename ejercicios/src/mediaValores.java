import java.util.Scanner;

public class mediaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pon el valor de los 3 numeros");
        /* declaracion de variables */
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        /* calcular promedio */
        double promedio = (valor1 + valor2 + valor3) / 3;

        System.out.println("el promedio de tus numeros es " + promedio);

        scanner.close();
    }
}
