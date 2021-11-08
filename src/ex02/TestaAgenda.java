package ex02;
public class TestaAgenda {

	public static void main(String[] args) {
		
		Agenda agenda01 = new Agenda();
		
		Pessoa p1= new Pessoa("max", 37, 1.75f);
		Pessoa p2=new Pessoa("lauriane", 35, 1.5f);
		Pessoa p3=new Pessoa("Valentina", 5, 1.10f); 
		
		

		 agenda01.addPessoa(p1); agenda01.addPessoa(p2); agenda01.addPessoa(p1);
		  agenda01.addPessoa(p2); agenda01.addPessoa(p1); agenda01.addPessoa(p2);
		  agenda01.addPessoa(p3); agenda01.addPessoa(p2); agenda01.addPessoa(p1);
		 agenda01.addPessoa(p1);

		
		
		
		
		System.out.println(agenda01);
		
		agenda01.removePessoa("max");
		System.out.println(agenda01);
		agenda01.buscaPessoaPorNome("Valentina");
		agenda01.buscaPessoaPeloIndice(10);
		System.out.println(agenda01);
		

	}

}
