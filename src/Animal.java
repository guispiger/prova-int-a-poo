
public abstract class Animal {
	private String nome;
	private Double peso;
	private int idade;
	protected int fome = 10;
	protected int energia = 0;

	public void comer() {
		this.fome = 0;
		this.energia = 10;
	}
	
	public void andar() {
		this.fome +=2;
		this.energia -=2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getFome() {
		return fome;
	}

	public void setFome(int fome) {
		this.fome = fome;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

}
