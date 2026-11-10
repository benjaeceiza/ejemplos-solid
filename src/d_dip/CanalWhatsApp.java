package d_dip;

// Implementación concreta 2: Enviar mensaje por WhatsApp
public class CanalWhatsApp implements CanalMensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por WhatsApp: " + mensaje);
    }
}
