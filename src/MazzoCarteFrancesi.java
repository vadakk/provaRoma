import java.util.ArrayList;
import java.util.Random;


public class MazzoCarteFrancesi {
	
	private ArrayList<CartaFrancese> carte; 

	public MazzoCarteFrancesi(){
		carte = new ArrayList<CartaFrancese>();
		
		for (int i = 1; i <=13; i++) 
			carte.add(new CartaFrancese(i,1));

		for (int i = 1; i <=13; i++) 
			carte.add(new CartaFrancese(i,2));
		
		for (int i = 1; i <=13; i++) 
			carte.add(new CartaFrancese(i,3));
		
		for (int i = 1; i <=13; i++) 
			carte.add(new CartaFrancese(i,4));
			
		}
	
	public void mischia(){
		
		Random r = new Random();
	
		for (int i = 0; i < 600; i++) {
			
			int numCas1 = r.nextInt(52);
			
			CartaFrancese c = carte.remove(numCas1);
			carte.add(c);
		}
	}

	public void taglia(){
		Random r = new Random();
		ArrayList<CartaFrancese> appoggio = new ArrayList<CartaFrancese>();
		
		int numCas = r.nextInt(52);
		
		for (int i = numCas; i < carte.size(); i++) {
			appoggio.add(carte.get(i));
		}
		for (int i = 0; i < numCas; i++) {
			appoggio.add(carte.get(i));
		}
		
		carte = appoggio;
		
	}
	
	public CartaFrancese estrai(){
		return carte.remove(0);
	}
	public String toString(){
		return carte.toString();
	}
}
