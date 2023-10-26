// Clase para el Rectangulo, que hereda de FiguraGeometrica
class Rectangulo extends FiguraGeometrica {
    // Atributos específicos de la clase Rectangulo
    private double lado1;  // Uno de los lados del rectángulo
    private double lado2;  // El otro lado del rectángulo

    // Constructor de la clase Rectangulo que inicializa los atributos de la clase base y los propios.
    // Complejidad temporal: O(1)
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        // Llamamos al constructor de la clase base para inicializar nombre y color.
        super(nombre, color);
        // Inicializamos los atributos específicos de la clase Rectangulo.
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Métodos específicos de la clase Rectangulo

    // Método para obtener el área del rectangulo.
    // Sobreescribe el método de la clase base con una implementación específica para el rectangulo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerArea() {
        // Fórmula para calcular el área de un rectangulo: lado1 * lado2
        return lado1 * lado2;
    }

    // Método para obtener el perímetro del rectangulo.
    // Sobreescribe el método de la clase base con una implementación específica para el rectangulo.
    // Complejidad temporal: O(1)
    @Override
    public double obtenerPerimetro() {
        // Fórmula para calcular el perímetro de un rectangulo: 2 * (lado1 + lado2)
        return 2 * (lado1 + lado2);
    }
}
