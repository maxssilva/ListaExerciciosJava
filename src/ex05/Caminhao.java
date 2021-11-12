package ex05;
import java.util.ArrayList;
import java.util.Scanner;

public class Caminhao {

    private String tipoCaminhao;
    private int capacidadeTotal;
    private ArrayList<Pluviometro> cargaCaminhao;


    public Caminhao() {
        Scanner digi = new Scanner(System.in);
        do {
            System.out.println("Digite o tipo do caminhão: ");
            tipoCaminhao = digi.nextLine();
        }
        while (tipoCaminhao.equalsIgnoreCase("alfa") || tipoCaminhao.equalsIgnoreCase("Beta"));

        System.out.println("Digite a capacidade do caminhão em litros: ");
        capacidadeTotal = digi.nextInt();
    }

    private void adicionaPluviometro(Pluviometro pluviometro){
        cargaCaminhao.add(pluviometro);
    }


    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }


}
