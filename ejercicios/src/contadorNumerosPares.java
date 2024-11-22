public class contadorNumerosPares {
    public static void main(String[] args) {
        int tope = 100;
        for (int par = 1; par <= tope; par++) {
            /*evaluador para si un numero es par */
            int result = par % 2;
            if (result == 0) {
                System.out.println("numero par: " + par);
            }
        }
    }
}
