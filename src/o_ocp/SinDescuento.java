package o_ocp;

// Descuento para clientes normales (0% de descuento)
public class SinDescuento implements Descuento {
    @Override
    public double aplicar(double precio) {
        return precio;
    }
}
