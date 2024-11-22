
import java.util.Scanner;

public class tiendaRopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* precio de prendas */
        int camiseta = 25;
        int pantalon = 30;

        System.out.println("bienvenidos a nuestra tienda");
        System.out.println("los precios de nuestros productos son los siguientes");
        System.out.println("camiseta = $25, pantalon = $30");
        
        while (true) {
            System.out.println("que desea hacer:");
            System.out.println("1: ver prendas con descuento");
            System.out.println("2: comprar ambas prendas");            
            System.out.println("3: salir");
            int orden = scanner.nextInt();
            
            /* calculo de valores*/
            double descuentoCamiseta = (camiseta * 0.15);
            double descuentoPantalon = (pantalon * 0.15);
            double precioDosCamisetas = ((descuentoCamiseta + camiseta) * 0.5);
            double precioFinal = (camiseta * 0.15) + (pantalon * 0.15);

            switch (orden) {
                case 1:
                System.out.println("-----------------------------------------------------------");
                    System.out.println("precio de camiseta con descuento: $" + (descuentoCamiseta * 0.15));
                    System.out.println("precio de pantalon con descuento: $" + (descuentoPantalon * 0.15));
                    System.out.println("-----------------------------------------------------------");
                    break;

                case 2:
                System.out.println("-----------------------------------------------------------");
                    System.out.println("el precio a pagar por su compra de camiseta y pantalon es de: $" + precioFinal);
                    System.out.println("-----------------------------------------------------------");
                    
                    System.out.println("al comprar una nueva camiseta se te aplico un nuevo descuento en las camisetas");
                    System.out.println("el precio de las camisetas es de: $" + precioDosCamisetas);
                    System.out.println("-----------------------------------------------------------");
                    break;
                case 3:
                /*para terminar el proceso*/
                System.out.println("-----------------------------------------------------------");
                    System.out.println("gracias por visitar nuestra tienda");
                    System.out.println("-----------------------------------------------------------");
                    System.exit(3);
                    scanner.close();
                    break;

                default:
                System.out.println("-----------------------------------------------------------");
                    System.out.println("orden no aceptada");
                    System.out.println("-----------------------------------------------------------");

            }

        }
    }
}
