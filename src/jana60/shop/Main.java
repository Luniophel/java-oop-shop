package jana60.shop;

public class Main {

	public static void main(String[] args) {
		
		//Dati fissi
		float iva = 24;
		
		//Lista prodotti
		Prodotto scarpeNike = new Prodotto("Nike","Scarpe Sportive", 55, iva);
		Prodotto canottaPuma = new Prodotto("Puma", "Canottiera Sportiva unisex", 40, iva);
		
		//Testo stampaProdotto()
		scarpeNike.stampaProdotto();
		
		//Calcolo prezzo con iva
		scarpeNike.calcPrezzoIva();
		
		//Testo stampaPrezzoIva()
		scarpeNike.stampaPrezzoIva();
		
		
	}

}
