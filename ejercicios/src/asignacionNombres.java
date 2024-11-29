import java.util.Scanner;

public class asignacionNombres {
    public static void cambiarNombre(String nombre) {
        Scanner scanner = new Scanner(System.in);

        nombre = scanner.nextLine();
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;

        System.out.println("ESTE ES UN SISTEMA DE ASIGNACION DE NOMBRE");
        System.out.println("puesdes escoger unos de los que ya tenemos predeterminados o escribir tu propio nombre");
        System.out.println("---------------------------------");

        boolean paso = true;
        while (paso) {
            System.out.println("¿que deseas hacer?");
            System.out.println("1: elegir nombre predeterminado");
            System.out.println("2: poner un nombre especifico");
            System.out.println("---------------------------------");

            int orden = scanner.nextInt();
            switch (orden) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("escoge acontinuacion un nombre");
                    System.out.println("---------------------------------");
                    System.out.println("1: papa");
                    System.out.println("2: pata");
                    System.out.println("3: pepe");
                    int escoger = scanner.nextInt();
                    switch (escoger) {
                        case 1:
                            System.out.println("felicidades, has escodigo el nombre de PAPA");
                            /* se le da el nombre al usuario */
                            nombre = "papa";
                            System.out.println("tu nombre actual es: " + nombre);
                            paso = false;
                            continue;
                        case 2:
                            System.out.println("felicidades, has escodigo el nombre de PATO");
                            /* se le da el nombre al usuario */
                            nombre = "pato";
                            System.out.println("tu nombre actual es: " + nombre);
                            paso = false;
                            continue;
                        case 3:
                            System.out.println("felicidades, has escodigo el nombre de PEPE");
                            /* se le da el nombre al usuario */
                            nombre = "pepe";
                            System.out.println("tu nombre actual es: " + nombre);
                            paso = false;
                            continue;
                        default:
                            System.out.println("orden no especificada");
                            break;
                    }
                case 2:
                /*hacer que vaya a la funcion y cambie el nombre y luego lo imprima */
                    System.out.println("escogiste poner tu propio nombre, felicidades");
                    nombre = "none";
                    cambiarNombre(nombre);
                    System.out.println("tu nombre  es: " + nombre);
                    paso = false;
                    break;
                default:
                    break;
            }

            /* devuleve el mensaje y le da la opcion al usuario de redimirse */
            System.out.println("---------------------------------");
            System.out.println("lo sentimos tu orden no esta especificada");
            System.out.print("escoge una opcion: ");
        }

    }

}
