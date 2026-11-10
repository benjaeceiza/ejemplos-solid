package o_ocp;

// Descuento para clientes VIP (20% de descuento)
public class DescuentoVIP implements Descuento {
    @Override
    public double aplicar(double precio) {
        return precio * 0.80;
    }
}
