package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

// ATTRIBUTES
	String marca;
	String nome;
	float prezzo;
	float iva;
	float prezzoIva;
	
	DecimalFormat df = new DecimalFormat("#.00€");


// CONSTRUCTORS
	Prodotto(String marca, String nome, float prezzo, float iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

// METHODS 
	
	// Stampa i dati del prodotto
	void stampaProdotto(){
		System.out.println	("Nome prodotto: " + nome + "\nMarca: " + marca + "\nPrezzo: " + df.format(prezzo));
	}
	
	// Calcola il prezzo comprensivo di iva
	float calcPrezzoIva() {
		iva /= 100;
		prezzoIva = prezzo + (prezzo * iva);
		return prezzoIva;
	}
	
	// Formatta il prezzo restituendo una stringa con numero fisso di decimali e carattere €, e stampa
	void stampaPrezzoIva() {
		System.out.println("Prezzo+IVA: " + df.format(prezzoIva));
	}

}
