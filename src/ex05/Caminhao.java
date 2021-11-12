package ex05;
import java.util.ArrayList;
import java.util.Scanner;

public class Caminhao {

    private String tipoCaminhao;
    private int capacidadeTotal;
    private String digitado;
    private ArrayList<Pluviometro> cargaCaminhao;


    public Caminhao() {
        Scanner digi = new Scanner(System.in);

     do{
         System.out.println("Digite o tipo do caminhão: ALFA ou BETA ");
        tipoCaminhao = digi.nextLine();
           }
     while (tipoCaminhao.equalsIgnoreCase("alfa")==false || !tipoCaminhao.equalsIgnoreCase("Beta")==false);

        System.out.println("Digite a capacidade do caminhão em litros: ");
        capacidadeTotal = digi.nextInt();

        System.out.println(tipoCaminhao+" "+ capacidadeTotal);}

/*parei aqui!!*/

    public void chamaABagaca(){
        System.out.println("já é");
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
