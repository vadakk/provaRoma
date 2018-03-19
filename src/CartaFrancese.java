
public class CartaFrancese {
	
	private int valore;
	private int seme;
	
	public CartaFrancese(int valore, int seme){
		this.valore = valore;
		this.seme = seme;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public int getSeme() {
		return seme;
	}

	public void setSeme(int seme) {
		this.seme = seme;
	}
	
	public boolean maggioreDi(CartaFrancese c){
		if(this.valore > c.valore) return true;
		else if(this.valore < c.valore) return false;
		else if(this.seme < c.seme) return true;
		else return false;
	}
	public String toString(){
		String semeTestuale="";
		switch(seme){
		case 1:
			semeTestuale = "Cuori";
			break;
		case 2:
			semeTestuale = "Quadri";
			break;
		case 3:
			semeTestuale = "Fiori";
			break;
		case 4:
			semeTestuale = "Picche";
			break;
		}
		
		return valore + " di " + semeTestuale;
	}

}
