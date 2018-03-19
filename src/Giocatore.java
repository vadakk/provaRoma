
public class Giocatore {
	
	private String nome;
	private CartaFrancese carta;
	
	public Giocatore(String nome){
		this.nome = nome;
	}

	public CartaFrancese getCarta() {
		return carta;
	}

	public void setCarta(CartaFrancese carta) {
		this.carta = carta;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString(){
		return nome + "\n" + carta;
	}

}
