import java.util.Scanner;

public class moreAge {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* toma de datos de la persona */
        System.out.println("TOMA DE DATOS");
        System.out.print("escribe tu edad: ");
        int age = scanner.nextInt();

        System.out.print("escribe tu altura: ");
        double height = scanner.nextDouble();

        scanner.nextLine();        
        System.out.print("escribe tu nombre: ");
        String name = scanner.nextLine();
        char letter = name.charAt(0);
        System.out.println("tu edad es " + age + " primera letra de tu nombre es: " + letter + " tu altura es: " + height);
        
        if (age >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
        scanner.close();
    }
}
