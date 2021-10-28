/*
 *Autor:Max Siqueira da Silva
 *
 *
 * Classe que tem por objetivo a criação de uma pessoa com base nos atributos nome e data de nascimento,
 * possui um construr que implementa o método de cálculo de idade com base na data de nascimento.
 *
 * Uberlândia, 27/10/2021*/
package ex01diferente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String bDay;
    private Long idadee;

    /*construtor da classe Pessoa*/
    public Pessoa(String nome, String bDay) {
        this.nome = nome;
        this.bDay = bDay;
        this.idadee = calculoIdade(bDay);
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

    @Override
    public String toString() {
        return "_____________________________________________________\n"+"Pessoa: \n" + "-----------------------------------------------------\n"+
                "Nome: " + nome +
                "\nData de Nascimento: '" + bDay + "\nIdade: "+ idadee+"\n\n consulta realizada em: "+
                LocalDateTime.now() + "\n-----------------------------------------------------\n";
    }
}
