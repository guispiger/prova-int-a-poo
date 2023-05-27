
public abstract class Carnivoro extends Animal {
	private TipoAlimento alimento = TipoAlimento.CARNE;
	
	@Override
	public void comer() {
		super.comer();
		this.fome -= 5;
		this.energia += 4;
	}
	
	public void cacar() {
		this.energia -= 8;
		this.fome -= 7;
	}
	
	public TipoAlimento getAlimento() {
		return alimento;
	}

	public void setAlimento(TipoAlimento alimento) {
		this.alimento = alimento;
	}
	
}
