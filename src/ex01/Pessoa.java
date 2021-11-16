package ex01;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String bDay;
    private float altura;
    private Long idadee;

    /*construtor da classe Pessoa*/
    public Pessoa(String nome, String bDay, float altura) {
        this.nome = nome;
        this.bDay = bDay;
        this.idadee = calculoIdade(bDay);
        this.altura=altura;
        }

    /*metodo calcula idade*/
    public Long calculoIdade(String bDay){
        String[] separaData = bDay.split("-");
        LocalDate niver = LocalDate.of(Integer.parseInt(separaData[2]), Integer.parseInt(separaData[1]),Integer.parseInt(separaData[0]));
        LocalDate hoje = LocalDate.now();
     Long idade = (Long) ChronoUnit.YEARS.between(niver,hoje);
     return idade;

      /*----------------------------------------------------------------------------
      alternativa passada pelos insiders
      LocalDate  niver = LocalDate.parse(bDay, DateTimeFormatter.ofPattern("dd/MM/yyy"));
      ---------------------------------------------------------------------------------*/
    }
    /*acessores/modificadores*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Long getIdadee() {
        return idadee;
    }

    public void setIdadee(Long idadee) {
        this.idadee = idadee;
    }

    @Override
    public String toString() {
        return "_____________________________________________________\n"+"Pessoa: \n" + "-----------------------------------------------------\n"+
                "Nome: " + nome +
                "\nData de Nascimento: '" + bDay + "\nIdade: "+ idadee+"\nAltura: "+altura+"m"+"\n\n consulta realizada em: "+
                LocalDateTime.now() + "\n-----------------------------------------------------\n";
    }
}
