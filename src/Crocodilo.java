
public class Crocodilo extends Carnivoro {
	private double comprimentoCauda;
	
	public void nadar() {
		this.fome += 4;
		this.energia -= 3;
	}

	@Override
	public void cacar() {
		this.energia -= 4;
		comer();
	}

	public double getComprimentoCauda() {
		return comprimentoCauda;
	}

	public void setComprimentoCauda(double comprimentoCauda) {
		this.comprimentoCauda = comprimentoCauda;
	}
}
