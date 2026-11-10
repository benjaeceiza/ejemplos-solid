package i_isp;

// Un Robot SOLO trabaja (no está obligado a implementar comer ni dormir)
public class Robot implements Trabajable {
    @Override
    public void trabajar() {
        System.out.println("Robot: Ensamblando piezas sin parar.");
    }
}
