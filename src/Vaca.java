
public class Vaca extends Herbivoro {
	private int LitrosLeiteProduzidos;

	public void produzirLeite() {
		this.energia -= 7;
		this.fome +=6;
		this.LitrosLeiteProduzidos += 10;
	}

	public int getLitrosLeiteProduzidos() {
		return LitrosLeiteProduzidos;
	}

}
