import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor");
        int valor = scanner.nextInt();
        int tope = 10;
        for (int multi = 1;tope >= multi ;multi++) {
            int result = valor * multi;
            System.out.println(valor + " * " + multi + " = "+ result);
        }
        scanner.close();
    }
}
