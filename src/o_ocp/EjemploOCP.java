package o_ocp;

// Clase principal para ejecutar el ejemplo de Abierto/Cerrado (OCP)
public class EjemploOCP {
    public static void main(String[] args) {
        System.out.println("=== 2. Principio de Abierto/Cerrado (OCP) ===");

        double precioOriginal = 1000.0;

        Descuento normal = new SinDescuento();
        Descuento vip = new DescuentoVIP();
        Descuento estudiante = new DescuentoEstudiante();

        System.out.println("Precio Original: $" + precioOriginal);
        System.out.println("Precio Cliente Normal: $" + normal.aplicar(precioOriginal));
        System.out.println("Precio Cliente VIP (20% off): $" + vip.aplicar(precioOriginal));
        System.out.println("Precio Estudiante (50% off): $" + estudiante.aplicar(precioOriginal));
    }
}
