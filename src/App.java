import s_srp.EjemploSRP;
import o_ocp.EjemploOCP;
import l_lsp.EjemploLSP;
import i_isp.EjemploISP;
import d_dip.EjemploDIP;

public class App {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("     PRINCIPIOS SOLID         ");
        System.out.println("====================================================\n");

        EjemploSRP.main(args);
        System.out.println();

        EjemploOCP.main(args);
        System.out.println();

        EjemploLSP.main(args);
        System.out.println();

        EjemploISP.main(args);
        System.out.println();

        EjemploDIP.main(args);
    }
}
