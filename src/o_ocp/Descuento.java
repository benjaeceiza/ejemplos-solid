package o_ocp;

// Interfaz base para cualquier descuento.
// Está abierta para extenderse (creando nuevas clases) pero cerrada para modificarse.
public interface Descuento {
    double aplicar(double precio);
}
