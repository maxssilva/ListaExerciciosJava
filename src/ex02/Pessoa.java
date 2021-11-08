package ex02;

public class Pessoa {

	private String nome;
	private int idade;
	private float altura;

		public Pessoa(String nome, int idade, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;}
			
		
			
	
/*getters e setters*/
	 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", altura=" + altura+"\n";
	}




}
