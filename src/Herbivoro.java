
public abstract class Herbivoro extends Animal {
	private TipoAlimento alimento = TipoAlimento.PASTO;

	@Override
	public void comer() {
		super.comer();
		this.fome -= 3;
		this.energia += 4;
	}

	public void fugir() {
		this.energia -= 6;
		this.fome += 4;
	}

	public TipoAlimento getAlimento() {
		return alimento;
	}

	public void setAlimento(TipoAlimento alimento) {
		this.alimento = alimento;
	}
}
