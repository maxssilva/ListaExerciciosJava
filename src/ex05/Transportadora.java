package ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class Transportadora {
       final ArrayList<Caminhao> frota = new ArrayList<>();


       public void adicionaCaminhao() {
        Scanner digi = new Scanner(System.in);
        System.out.println("quer adicionar um caminhao?");
        String digite = digi.nextLine();

        for (String a = "n"; a.equalsIgnoreCase(digite) == false; digite = digi.nextLine()) {
            switch (digite) {
                case "s": {
                    System.out.println("Adicionando caminhao");
                    System.out.println("Qual caminhao deseja incluir? **alfa ou beta***");
                    Caminhao c = new Caminhao();
                    frota.add(c);
                    System.out.println("Deseja adicionar OUTRO caminhão?");
                    break;
                }
                case "n": {
                    System.out.println("obrigado, tenha um bom dia!");
                    break;
                }
                default: {
                    System.out.println("Deseja adicionar OUTRO caminhao?\n digite 's' para sim ou 'n' para não");
                    break;
                }
            }
        }

        Pluviometro carga = new Pluviometro();
                System.out.println("fim metodo");
        for (int i = 0; i < frota.size(); i++) {

            if ((frota.get(i).getVolume() > carga.getVolumeDaCarga())) {
                System.out.println("o melhor caminhão para o transporte é o " + frota.get(i).getTipo());
            }

           /* Object escolhido= frota.stream().filter(esc -> esc.getVolume()>carga.getVolumeDaCarga());
            System.out.println(escolhido.toString());*/

        }
   }
}

