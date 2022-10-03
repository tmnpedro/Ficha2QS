
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
	
	//Nos v�rios m�todos recebo os par�metros para evitar qualquer conflito com poss�veis edi��es.
		//pergunta C
		/**
		 * 
		 * @param peso
		 * @param altura
		 * @return
		 */
		public float calculaIMC(int peso, float altura) { 
			float imc = peso/(altura*altura);
			return imc;
		}
		public String grauObesidade(float imc) {
			String grau;
			if(imc <=19 ) { grau = "Abaixo do peso normal";}
			else if(imc <=25) {grau = "Peso normal";}
			else if(imc <=30) {grau = "Excesso de peso";}
			else {grau = "Obeso";}
			return grau;
		}
		
		//pergunta E
		/**
		 * Este m�todo conforme o calculo do imc informa se � preciso alterar o peso ou n�o 
		 * @param peso
		 * @param altura
		 */
		public void verificar(int peso, float altura) {
			float imc = calculaIMC(peso, altura);//calcula imc do utente.
			boolean mudou = false;
			
			//caso imc seja menor que 19 calcula o peso que seria ideal.
			while(imc <= 19) {
				peso = peso + 1;
				imc = calculaIMC(peso, altura);
				mudou = true;//Muda o bool para saber que n�o est� no peso ideal.
			}
			
			//caso imc seja maior que 25 calcula o peso que seria ideal.
			while(imc > 25) {
				peso = peso -1;
				imc = calculaIMC(peso, altura);
				mudou = true;//Muda o bool para saber que n�o est� no peso ideal.
			}
			
			//Caso n�o tenha entrado em nenhum dos whiles anteriores quer dizer que est� no peso ideal.
			if(mudou == true) {
			System.out.println("O peso a alcan�ar � de " + peso);
			}
			else {
				System.out.println("Est� no peso ideal, deve manter-se entre:");
				//Calcula peso m�nimo.
				while(imc > 19) {
					peso = peso - 1;
					imc = calculaIMC(peso, altura);
				}
				System.out.println("Peso m�nimo � : " + peso);
				
				//C�lcula peso m�ximo.
				while(imc <= 25) {
					peso = peso + 1;
					imc = calculaIMC(peso, altura);
				}
				System.out.println("Peso m�ximo �: " + peso);
			}
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
