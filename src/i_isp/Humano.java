package i_isp;

// Un Humano trabaja, come y duerme, por lo que implementa las 3 interfaces
public class Humano implements Trabajable, Alimentable, Descansable {
    @Override
    public void trabajar() {
        System.out.println("Humano: Trabajando en la oficina.");
    }

    @Override
    public void comer() {
        System.out.println("Humano: Almorzando al mediodia.");
    }

    @Override
    public void dormir() {
        System.out.println("Humano: Durmiendo 8 horas.");
    }
}
