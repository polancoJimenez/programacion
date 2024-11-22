import java.util.Scanner;

public class menuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* ingresar los numeros */
        System.out.println("ingresa dos valores para calcular");
        int valorOne = scanner.nextInt();
        int valortwo = scanner.nextInt();
        /* menu */
        System.out.println("que operaciones comunes quieres hacer?");
        System.out.println("1: sumar");
        System.out.println("2: restar");
        System.out.println("3: multiplicar");
        System.out.println("4: dividir");
        System.out.println("5: salir");

        int orden = scanner.nextInt();

        switch (orden) {
            case 1:
                /* operacion */
                System.out.println("has escogido sumar");
                int suma = valorOne + valortwo;
                System.out.println("el resultado es: " + suma);
                break;
            case 2:
                /* operacion */
                System.out.println("has escogido restar");
                int resta = valorOne - valortwo;
                System.out.println("el resultado es: " + resta);
                break;
            case 3:
                /* operacion */
                System.out.println("has escogido multiplicacion");
                int multiplicacion = valorOne * valortwo;
                System.out.println("el resultado es: " + multiplicacion);
                break;
            case 4:
                /* operacion */
                System.out.println("has escogido dividir");
                int dividir = valorOne / valortwo;
                System.out.println("el resultado es: " + dividir);
                break;
            case 5:
                System.out.println("gracias por usar nuestro sistema");
                break;
            default:
                System.out.println("orden no validada");
        }

        scanner.close();
    }
}
