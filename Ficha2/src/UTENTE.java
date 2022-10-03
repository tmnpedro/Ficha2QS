
public class UTENTE {
	
	
	private String nome;
	private int idade;
	private float altura;
	private int peso;
	
	public UTENTE(String nome, int idade, float altura, int peso){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		
	}

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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "UTENTE [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}
}
