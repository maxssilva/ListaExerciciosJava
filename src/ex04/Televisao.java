/*programa que emula ações de um controle remoto em uma tv
 * a tv é iniciada com um padrão para canal=8 e volume=5
 * as ações solicitadas no exercício foram de aumetar e diminuir volume e o canal,
 * além de uma ação na qual o usuário escolhe qual canal quer assistir
 *
 * tal qual uma tv, configurei os valores máximos para canal e volume, (50 e 10 respectivamente.
 * portanto, caso o usuario escolha um canal acima da faixa disponivel na tv, ele será redirecionado
 * para o último canal mais próximo àquele digitado, por ex. digitando 99 a tv selecionará o canal 50,
 * digitando um valor negativo ela redirecionará ao canal 0
 *
 * o volume não é alterado pelo método de aumentar ou diminuir caso o usuário tente
 * aumentar ou dimiuir para níveis fora do intervalo, imprimindo na tela o volume máximo
 * ou mínimo nesse caso
 *
 * a interface gráfica do volume esta no método imprimeVolume e foi setado com "|" e "-", sendo cada unidade de "|" referente a uma
 * unidade de volume, e cada "-" uma unidade que ainda resta do máximo de volume a ser completado
 *
 * */
package ex04;

public class Televisao implements ControleRemoto {
    private int volume;
    private int canal;

    /*construtor da Televisão*/
    public Televisao() {
        this.setCanal(8);
        this.setVolume(5);
    }

    /*metodo para aumentar volume*/
    @Override
    public void aumentaVolume() {
        if (getVolume() < 10) {
            volume++;
            imprimeVolume(volume);
        }
    }

    /*método que diminui volume*/
    @Override
    public void diminuiVolume() {
        if (getVolume() <= 0) {
            //
        } else {
            volume--;
            imprimeVolume(volume);
        }
    }

    /*metodo para aumentar canal*/
    @Override
    public void aumentaCanal() {
        if (getCanal() < 50) {
            this.canal++;
        } else {
            System.out.println("Canal 50");
        }
    }

    /*metodo para diminuir canal*/
    @Override
    public void diminuiCanal() {
        if (getCanal() > 0) {
            this.canal--;
        } else {
            System.out.println("Canal 0");
        }
    }

    /*metodo para troca de canal*/
    @Override
    public void trocaCanal(int escolheCanal) {
        if ((escolheCanal >= 0) && (escolheCanal <= 50)) {
            this.canal = escolheCanal;
        } else if (escolheCanal > 50) {
            this.canal = 50;
        } else {
            this.canal = 0;
        }
    }

    /*consultando volume  canal atual da TV*/
    public void consultaStatusTv() {
        System.out.println("sobre a tv: ");
        System.out.println("CANAL: " + getCanal());
        imprimeVolume(volume);
    }

    /*imprime volume*/
    public void imprimeVolume(int volume) {
        System.out.print("VOLUME ");
        for (int i = 0; i < volume; i++) {
            System.out.print("|");
        }
        for (int j = volume; j < 10; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /*metodos acessores/modificadores*/
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


}
