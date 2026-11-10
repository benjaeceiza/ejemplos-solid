package l_lsp;

// Clase principal para ejecutar el ejemplo de Sustitución de Liskov (LSP)
public class EjemploLSP {
    public static void main(String[] args) {
        System.out.println("=== 3. Principio de Sustitucion de Liskov (LSP) ===");

        // Tanto Aguila como Pinguino pueden sustituir a "Ave" sin que nada falle
        Ave miAguila = new Aguila();
        Ave miPinguino = new Pinguino();

        miAguila.comer();
        miPinguino.comer();

        // Y cada una realiza su acción específica de forma segura
        Aguila aguilaVoladora = new Aguila();
        aguilaVoladora.volar();

        Pinguino pinguinoNadador = new Pinguino();
        pinguinoNadador.nadar();
    }
}
