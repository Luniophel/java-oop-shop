package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		//Testo funzionalità di Prodotto() e stampaProdotto()
		Prodotto scarpeNike = new Prodotto("Nike","Scarpe Sportive", 55, 24);
		scarpeNike.stampaProdotto();
		
		scarpeNike.calcPrezzoIva();
		
		//Testo stampaPrezzoIva()
		scarpeNike.stampaPrezzoIva();
		
		
	}

}
