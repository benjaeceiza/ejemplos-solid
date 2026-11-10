package s_srp;

// Clase principal para ejecutar el ejemplo de Responsabilidad Única (SRP)
public class EjemploSRP {
    public static void main(String[] args) {
        System.out.println("=== 1. Principio de Responsabilidad Unica (SRP) ===");

        Cocinero cocinero = new Cocinero();
        Cajero cajero = new Cajero();
        PersonalLimpieza limpieza = new PersonalLimpieza();

        cocinero.cocinar();
        cajero.cobrar();
        limpieza.limpiar();
    }
}
