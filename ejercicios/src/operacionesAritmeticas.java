import java.util.Scanner;

public class operacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**toma de numeros  */
        System.out.println("escribe los numeros con lo que se operará");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("el resultado de la suma es: " + (number1 + number2) );
        System.out.println("el resultado de la resta es: " + (number1 - number2) );
        System.out.println("el resultado de la multiplicacion es: " + (number1 * number2) );
        System.out.println("el resultado de la division es: " + (number1 / number2) );
        System.out.println("el resultado de la modulo es: " + (number1 % number2) );

        scanner.close();
    }
}
