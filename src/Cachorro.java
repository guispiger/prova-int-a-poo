
public class Cachorro extends Carnivoro {
	private String nomeDono;
	
	public void brincar() {
		this.fome += 4;
		this.energia -= 5;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
}
