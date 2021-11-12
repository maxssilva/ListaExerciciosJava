package ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class EntraDados extends Controle {

    super public static int leInteiro(Scanner scan){



    }

    private ArrayList<Caminhao> frota;

    private void adicionaCaminhaoNaFrota(Caminhao caminhao){

        frota.add(caminhao);
    }


 static Object selecionaCaminhao(ArrayList<Caminhao> frota, int totalVolumeASerCarregado){
        int cam=0;
    for(int i=0; i<frota.size();i++){
        if(frota.get(i).getCapacidadeTotal()>totalVolumeASerCarregado){
            cam = i;        }
    }
  return frota.get(cam);
   }

}
