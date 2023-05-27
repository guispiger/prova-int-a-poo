
public class Leao extends Carnivoro {
	private double tamanhoJuba;
	
	@Override
	public void cacar() {
		this.energia -= 5;
		this.fome -= 9;
	}

	public double getTamanhoJuba() {
		return tamanhoJuba;
	}

	public void setTamanhoJuba(double tamanhoJuba) {
		this.tamanhoJuba = tamanhoJuba;
	}
	
}
