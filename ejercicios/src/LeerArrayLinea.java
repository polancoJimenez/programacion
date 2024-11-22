import java.util.Scanner;

public class LeerArrayLinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* System.out.print("Ingresa el tamaño del array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Ingresa " + n + " números separados por espacios:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Mostrando resultados
        System.out.println("\nLos valores ingresados son:");
        for (int valor : array) {
            System.out.print(valor + " ");
        } */

        int u = 0;
        do{
            System.out.println("\nlos valores antes de entrar al while son: " + u);u++;
        }while(u<5);{
            System.out.println("ya entro al while, proceso terminado");
        }
        
        scanner.close();
    }
}