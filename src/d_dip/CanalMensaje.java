package d_dip;

// Abstracción (Interfaz): El Notificador dependerá de esta interfaz
// y no de una tecnología de mensajería en particular.
public interface CanalMensaje {
    void enviarMensaje(String mensaje);
}
