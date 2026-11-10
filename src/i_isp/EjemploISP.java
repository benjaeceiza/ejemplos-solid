package i_isp;

// Clase principal para ejecutar el ejemplo de Segregación de Interfaces (ISP)
public class EjemploISP {
    public static void main(String[] args) {
        System.out.println("=== 4. Principio de Segregacion de Interfaces (ISP) ===");

        Humano humano = new Humano();
        Robot robot = new Robot();

        humano.trabajar();
        humano.comer();
        humano.dormir();

        robot.trabajar();
    }
}
