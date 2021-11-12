package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntraDados extends Controle {

    public static int leInteiro(Scanner scan){
        return 0;
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
