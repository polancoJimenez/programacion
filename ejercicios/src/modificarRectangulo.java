class Rectangulo {
    // Atributos de la clase
    private double ancho;
    private double alto;

    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Método para modificar el rectángulo
    public void modificarRectangulo(Rectangulo r) {
        r.ancho = 10.5;  // Cambia el ancho
        r.alto = 20.3;   // Cambia el alto
    }

    // Método para imprimir las dimensiones
    public void imprimirDimensiones() {
        System.out.println("Ancho: " + this.ancho + ", Alto: " + this.alto);
    }

    // Método main para demostrar el paso por referencia
    public static void main(String[] args) {
        // Crear un rectángulo inicial
        Rectangulo miRectangulo = new Rectangulo(5.0, 7.0);
        
        // Imprimir dimensiones originales
        System.out.println("Dimensiones originales:");
        miRectangulo.imprimirDimensiones();
        
        // Modificar el rectángulo
        miRectangulo.modificarRectangulo(miRectangulo);
        
        // Imprimir dimensiones después de modificar
        System.out.println("\nDimensiones después de modificar:");
        miRectangulo.imprimirDimensiones();
    }
}