package ex05;

import java.util.Scanner;

public class Caminhao {
    private String tipo;
    private int volume;
    Scanner digi = new Scanner(System.in);
    String tpCaminhao;


    public Caminhao() {
        String digite = digi.nextLine();
        if (digite.equalsIgnoreCase("alfa")) {
            setVolume(1000);
            setTipo("alfa");
        } else if (digite.equalsIgnoreCase("beta")) {
            setTipo("beta");
            setVolume(500);
        } else {
            System.out.println("opcao digitada incorreta, digite alfa ou beta.");
            tpCaminhao = digi.nextLine();
        }
    }
        public String getTipo() {

        return "caminhao tipo " + tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "tipo='" + tipo + '\'' +
                ", volume=" + volume +
                '}';
    }
}
