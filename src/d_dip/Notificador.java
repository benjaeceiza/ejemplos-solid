package d_dip;

// Clase de alto nivel: Depende de la interfaz CanalMensaje (abstracción)
// y no de CanalEmail ni de CanalWhatsApp directamente.
public class Notificador {
    private CanalMensaje canal;

    // Recibimos cualquier canal que implemente CanalMensaje
    public Notificador(CanalMensaje canal) {
        this.canal = canal;
    }

    public void notificarCliente(String texto) {
        canal.enviarMensaje(texto);
    }
}
