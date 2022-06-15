package jana60.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		//Chiedo all'utente di inserire dettagli di 5 prodotti da aggiungere al catalogo
		//Stampa catalogo
		//Stampa catalogo in forma tabellare
		
		Scanner scan = new Scanner(System.in);
		
//		int counter = 0;
//		boolean done = false;
		
		//Aggiungi n prodotti al catalogo
		
		System.out.println("Aggiungi un prodotto:");
		Prodotto prodotto1 = new Prodotto();
		Prodotto prodotto2 = new Prodotto();
		
		prodotto1.creaProdotto();
		prodotto2.creaProdotto();
		
		prodotto1.stampaTuttiDati();
		prodotto2.stampaTuttiDati();
		
		scan.close();
	}

}
