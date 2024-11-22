import java.util.Scanner;

public class mayoresMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digita los tres numeros");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        /* || */
        if ((valor1 > valor2) && (valor1 < valor3)) {
            System.out.println("el valor " + valor1 + " es mayor que el segundo y menor que el tercero");
        }else if ((valor1 > valor2) && (valor1 > valor3)) {
            System.out.println("el valor " + valor1 +  " es el mayor");
        }else if ((valor2 > valor1) && (valor2 > valor3)) {
            System.out.println("el valor " + valor2 + " es el mayor");
        }else if ((valor3 > valor1) && (valor3 > valor2)) {
            System.out.println("el valor " + valor2 + " es el mayor");            
        }
        scanner.close();
    }
}
