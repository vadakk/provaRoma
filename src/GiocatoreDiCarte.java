import java.util.ArrayList;
import java.util.List;

public class GiocatoreDiCarte {
	
	private String nome;
	private List<CartaFrancese> carte = new ArrayList<>();
	
	public GiocatoreDiCarte(String nome){
		this.nome = nome;
	}

	public int getPunteggio(){
		int somma = 0;
		int contaUno=0;
		for (CartaFrancese f: carte) {
			if(f.getValore()==1) contaUno++;
			
			if(f.getValore()>10 && f.getValore()<=13 )
				somma += 10;
			else
				somma += f.getValore();
		}
		if(somma>21) return -1;
		
		for(int i=0;i<contaUno;i++)
			if(somma+10<=21) somma +=10;
				
		return somma;
	}
	
	public int getNumeroCarte(){
		return carte.size();
				
	}
	
	public CartaFrancese getCarta(int indice) {
		return carte.get(indice);
	}
	
	public CartaFrancese giocaCarta(int indice) {
		return carte.remove(indice);
	}

	public void addCarta(CartaFrancese carta) {
		carte.add(carta);
	}

	public String getNome() {
		return nome;
	}
	
	public List<CartaFrancese> getCarte() {
		return carte;
	}

	public String toString(){
		return nome + "\n" + carte;
	}

}
