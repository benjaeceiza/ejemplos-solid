package d_dip;

// Clase principal para ejecutar el ejemplo de Inversión de Dependencias (DIP)
public class EjemploDIP {
    public static void main(String[] args) {
        System.out.println("=== 5. Principio de Inversion de Dependencias (DIP) ===");

        // 1. Usamos el Notificador pasándole el canal de Email
        CanalMensaje email = new CanalEmail();
        Notificador notificadorEmail = new Notificador(email);
        notificadorEmail.notificarCliente("Tu pedido ha sido enviado.");

        // 2. Cambiamos a WhatsApp fácilmente sin modificar la clase Notificador
        CanalMensaje whatsapp = new CanalWhatsApp();
        Notificador notificadorWhatsApp = new Notificador(whatsapp);
        notificadorWhatsApp.notificarCliente("Tu codigo de seguridad es 1234.");
    }
}
