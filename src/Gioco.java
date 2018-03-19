
public class Gioco {

	public static void main(String[] args) {
		
	
		
		MazzoCarteFrancesi mazzoDiCarte = new MazzoCarteFrancesi();
		
		Giocatore g1 = new Giocatore("Antonio");
		Giocatore g2 = new Giocatore("Paolo");
		GiocatoreDiCarte gd1 = new GiocatoreDiCarte("Antonio");
		gd1.
		
		mazzoDiCarte.mischia();		
		
		System.out.println(mazzoDiCarte);
		
		
		
		g1.setCarta(mazzoDiCarte.estrai());
		g2.setCarta(mazzoDiCarte.estrai());
		g1.getCarta();
		
		System.out.println(g1);
		System.out.println(g2);
	
		
		
		if (g1.getCarta().maggioreDi(g2.getCarta())) {
			System.out.println(g1.getNome()+ " Hai vinto");
			
		} else {System.out.println(g2.getNome() + " Hai vinto!");}
	
	}

}
