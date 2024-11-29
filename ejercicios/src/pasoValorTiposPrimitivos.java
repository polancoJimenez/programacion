public class pasoValorTiposPrimitivos {
    /*metodo para actualizar el valor de num */
    public static void cambioValor(int num) {
        num = 10;
        System.out.println("el nuevo valor del numero es: " + num);
    }
    
    public static void main(String[] args) {
        int num = 14;
        System.out.println("el primer valor de tu numero es: " + num);
        /*se llama el metodo*/
        cambioValor(num);
    }
    
}