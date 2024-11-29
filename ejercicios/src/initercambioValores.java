public class initercambioValores {

    public static void intercambiar(int valor1, int valor2){
        valor1 = 2;
        valor2 = 3;
        System.out.println("los valores dentro del metodo son: " + valor1 + " , " + valor2);
    }


    public static  void main(String[] args){
        int valor1 = 5;
        int valor2 = 4;
        System.out.println("los valores antes de llamar al metodo son: " + valor1 + " , " + valor2);
        intercambiar(valor1, valor2);
        System.out.println("los valores despues de llamar al metodo son: " + valor1 + " , " + valor2);
    }
}
