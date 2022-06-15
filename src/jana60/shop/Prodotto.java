package jana60.shop;

public class Prodotto {

// ATTRIBUTES
	String marca;
	String nome;
	int prezzo;
	int iva;

// CONSTRUCTORS
	Prodotto(String marca, String nome, int prezzo, int iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

// METHODS 
	
	// Stampa i dati del prodotto
	void stampaProdotto(){
		System.out.println	("Nome prodotto: " + nome + "\nMarca: " + marca + "\nPrezzo: " + prezzo);
	}
	
	// Calcola il prezzo comprensivo di iva
	// Formatta il prezzo restituendo una stringa con numero fisso di decimali e
	// carattere €

}
