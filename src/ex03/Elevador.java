package ex03;

public class Elevador implements AcoesElevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoasNoElevador;
    private int qualAndarDeseja;

    public void inicializa(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.qtdPessoasNoElevador = 0;
    }

    @Override
    public void sobe(int qualAndarDeseja) {
        if ((qualAndarDeseja > this.andarAtual) && (qualAndarDeseja <= totalAndares)) {
            for (int i = andarAtual; i <= qualAndarDeseja; i++) {
                System.out.println(i + "º andar");
            }
            setAndarAtual(qualAndarDeseja);
            System.out.println(" Pronto!");
        } else if (qualAndarDeseja > totalAndares) {
            System.out.println("impossivel subir! andar nao existente.");
        } else if (qualAndarDeseja < andarAtual) {
            System.out.println("andar solicitado e inferior ao atual");
        } else {
            System.out.println("Impossível subir, este é o ultimo andar.");
        }
    }

    @Override
    public void desce(int qualAndarDeseja) {
        if ((qualAndarDeseja < andarAtual) && (qualAndarDeseja >= 0)) {
            for (int i = andarAtual; i >= qualAndarDeseja; i--) {
                System.out.println(i + "º andar");
            }
            setAndarAtual(qualAndarDeseja);
            System.out.println("Pronto");
        } else if (qualAndarDeseja < totalAndares) {
            System.out.println("Andar inexistente.");
        } else {
            System.out.println("Impossível descer");
        }

    }

    @Override
    public void entra() {
        if (qtdPessoasNoElevador < capacidadeElevador) {
            qtdPessoasNoElevador++;
            System.out.print("Entra pessoa, ");
        } else {
            System.out.println("Elevador cheio! impossível entrar.");
        }
    }

    @Override
    public void sai() {
        if ((qtdPessoasNoElevador > 0)) {
            qtdPessoasNoElevador--;
        } else {
            System.out.println("Elevador vazio.");
        }
    }

    /*metodos acessores-modificadores*/
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoasNoElevador() {
        return qtdPessoasNoElevador;
    }

    public void setQtdPessoasNoElevador(int qtdPessoasNoElevador) {
        this.qtdPessoasNoElevador = qtdPessoasNoElevador;
    }

    public int getQualAndarDeseja() {
        return qualAndarDeseja;
    }

    public void setQualAndarDeseja(int qualAndarDeseja) {
        this.qualAndarDeseja = qualAndarDeseja;
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidadeElevador=" + capacidadeElevador +
                ", qtdPessoasNoElevador=" + qtdPessoasNoElevador +
                ", qualAndarDeseja=" + qualAndarDeseja +
                '}';
    }
}
