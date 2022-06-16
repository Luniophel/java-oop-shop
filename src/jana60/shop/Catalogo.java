package jana60.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		//Chiedo all'utente di inserire dettagli di 5 prodotti da aggiungere al catalogo
		//Stampa catalogo
		//Stampa catalogo in forma tabellare
		
		//Variabili
		String marca, nome;
		float prezzo;
		float iva;
		
		Scanner scan = new Scanner(System.in);
		
		//Creo il catalogo
		Prodotto prod[] = new Prodotto[5];
		marca = "area";
		
		for(int i=0; i<5; i++) {
			
			//Chiedo i dati del prodotto
			System.out.print("\nMarca: ");
			marca = scan.nextLine();
			System.out.print("\nNome: ");
			nome = scan.nextLine();
			System.out.print("\nPrezzo: ");
			String tempScan = scan.nextLine();
			prezzo = Float.parseFloat(tempScan);
			System.out.print("\nIVA: ");
			tempScan = scan.nextLine();
			iva = Float.parseFloat(tempScan);
			
			//Creo il prodotto con i dati inseriti con indice catalogo
			prod[i] = new Prodotto(marca, nome, prezzo, iva);
			prod[i].calcPrezzoIva();
		}
		
		System.out.format("%24s %24s %24s %1s %24s %1s", "Marca", "Modello", "Prezzo", "(€)", "Prezzo+IVA", "(€)");
		System.out.println("\n");
		
		for(int i=0; i<5; i++) {
			System.out.format("%24s %24s %24.2f %1s %24.2f %1s", prod[i].marca, prod[i].nome, prod[i].prezzo,"€", prod[i].prezzoIva,"€");
			System.out.println();
		}
		scan.close();
	}

}
