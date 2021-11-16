package ex05;

import java.util.Scanner;

public class Pluviometro {
    private String a;
    private String b;
    private String c;
    private int capacidade;
    private int volumeDaCarga;
    Scanner digi = new Scanner(System.in);

    public Pluviometro() {
        System.out.println("Digite o tipo de pluviometro: ");
        String letra;
        do {
            letra = digi.nextLine();
            if (letra.equalsIgnoreCase("a")) {
                setCapacidade(1);
                break;
            } else if (letra.equalsIgnoreCase("b")) {
                setCapacidade(5);
                break;
            } else if (letra.equalsIgnoreCase("c")) {
                setCapacidade(10);
                break;
            } else {
                System.out.println("digite, a, b ou c, paspalho!");
            }
        }
        while (letra.equalsIgnoreCase("a") == false
                || letra.equalsIgnoreCase("b") == false
                || letra.equalsIgnoreCase("c") == false);


        System.out.println("Digite a quantidade de pluviometros: ");
        int qtd = digi.nextInt();
        int total = qtd * capacidade;
        setVolumeDaCarga(total);
    }

    public int getVolumeDaCarga() {
        return volumeDaCarga;
    }

    public void setVolumeDaCarga(int volumeDaCarga) {
        this.volumeDaCarga = volumeDaCarga;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "A carga final para transporte é de "
                + volumeDaCarga + " litros";
    }
}
