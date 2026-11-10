package o_ocp;

// ¡Nuevo descuento! Descuento para Estudiantes (50% de descuento)
// Lo agregamos en un archivo nuevo SIN modificar las clases anteriores.
public class DescuentoEstudiante implements Descuento {
    @Override
    public double aplicar(double precio) {
        return precio * 0.50;
    }
}
