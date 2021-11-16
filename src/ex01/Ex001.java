/*
 *Autor:Max Siqueira da Silva
 *
 *
 * Classe que tem por objetivo a criação de uma pessoa com base nos atributos nome e data de nascimento,
 * possui um construr que implementa o método de cálculo de idade com base na data de nascimento.
 *
 * Uberlândia, 27/10/2021*/

package ex01;
public class Ex001 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Max","31-08-1984", 1.75f);
        System.out.println(p1.toString());


    }
}
