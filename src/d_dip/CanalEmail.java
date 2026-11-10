package d_dip;

// Implementación concreta 1: Enviar mensaje por Correo Electrónico
public class CanalEmail implements CanalMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por Email: " + mensaje);
    }
}
