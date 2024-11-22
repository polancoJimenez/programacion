import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un valor");
        int valor = scanner.nextInt();
        int tope = 1;
        int factorial = 1;
        while(tope <= valor){

            factorial *= tope;
            tope++;
        }
        System.out.println("el factorial de tu numero es: " + factorial);
        scanner.close();
    }
}
