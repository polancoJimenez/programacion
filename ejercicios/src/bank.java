public class bank {
    public static void main(String[] args) {
        /*declacion de variables */
        int cuenta = 1000;
        int semana = 1;
        int retiroSemanal = 200;
        for (int valorMin = 0; valorMin < cuenta; semana++) {
            cuenta -= retiroSemanal;
            System.out.print("retiraste $200 ");
            System.out.println("en la semana " + semana);
            System.out.println("------------------------------");
            System.out.println("saldo de tu cuenta: $" + cuenta);
            System.out.println("------------------------------");
            /*para cerrar el ciclo cuabdo se termine el mes */
            if (semana >= 4){
                break;
            }
        }
        System.out.println("saldo de tu cuenta actual " + cuenta);
        System.out.println("------------------------------");
    }
}
