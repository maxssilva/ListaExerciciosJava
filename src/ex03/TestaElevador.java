package ex03;

public class TestaElevador {
    public static void main(String[] args) {
        Elevador e1 = new Elevador();
        e1.inicializa(10, 8);
        System.out.println("O Elevador está no " + e1.getAndarAtual() + " andar " +
                "e está atualmente com " + e1.getQtdPessoasNoElevador() + " pessoas");

        /*lotando elevador*/
        for (int i = 1; i <= 10; i++) {
            e1.entra();
        }
        System.out.println(e1.getQtdPessoasNoElevador());
        /*tentando subir mais uma pessoa*/
        e1.entra();

        for (int i = 1; i <= 10; i++) {
            e1.sai();
            System.out.println("saiu mais um...");
        }
        System.out.println("\n");
        e1.sai();
        e1.sobe(8);
        e1.sobe(3);
        e1.desce(7);
        e1.desce(-456);
        e1.desce(0);
        System.out.println(e1.getQtdPessoasNoElevador());
        e1.entra();
        for (int i = 1; i <= 10; i++) {
            e1.entra();
        }

        System.out.println("O Elevador esta no " + e1.getAndarAtual() + " andar " +
                "e esta atualmente com " + e1.getQtdPessoasNoElevador() + " pessoas");
    }
}
