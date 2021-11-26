package ex02;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> agenda;
	private int capacidade = 1;

	public Agenda() {
		agenda = new ArrayList<>(10);
	}

	void addPessoa(Pessoa pessoa) {
		if (capacidade <= 10) {
			agenda.add(pessoa);
			capacidade++;
		} else {
			System.out.println("Capacidade de memória excedida");
		}
	}

	void removePessoa(String nome) {
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNome().equals(nome)) {
				agenda.remove(i);
				capacidade--;
			} else {
				System.out.println("Contato não existente!");
				break;
			}
		}
	}

	void buscaPessoaPorNome(String nome) {
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNome().equals(nome)) {
				System.out.println(i);
			} else {
				System.out.println("Contato não existente!");
				break;
			}
		}

	}

	void buscaPessoaPeloIndice(int numero) {
		if(numero<=agenda.size()) {
		for (int i=0; i<agenda.size();i++) {
			if(i==numero) {
				System.out.println(agenda.get(i).toString());
			}
		}
		}
		else {
			System.out.println("Não existe contato dentro deste índice!");
		}
		
	}

	@Override
	public String toString() {
		return agenda + "\n" + " dados utilizados= " + capacidade;
	}

}
