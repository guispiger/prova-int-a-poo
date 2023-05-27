
public class Girafa extends Herbivoro {
	private double alturaPescoco;
	
	@Override
	public void fugir() {
		super.fugir();
		this.energia -= 4;
		this.fome += 2;
	}

	public double getAlturaPescoco() {
		return alturaPescoco;
	}

	public void setAlturaPescoco(double alturaPescoco) {
		this.alturaPescoco = alturaPescoco;
	}
}
