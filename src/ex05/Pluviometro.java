package ex05;

import java.util.Scanner;

public class Pluviometro {
       private String a;
       private String b;
       private String c;
       private int capacidade;


    Pluviometro(String entra){

        if (entra.equalsIgnoreCase(a)){
            capacidade=1;
        }else if(entra.equalsIgnoreCase(b)){
            capacidade=5;
        }else if(entra.equalsIgnoreCase(c)){
            capacidade=10;
        }else{
            System.out.println("tipo digitado incorreto: digite a, b, ou c.");
        }
    }

      public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}



