package jana60.shop;

public class Prodotto {

	// Attributi
	String marca;
	String nome;
	int prezzo;
	int iva;

	// Costruttori
	Prodotto(String marca, String nome, int prezzo, int iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// Metodi
	// Calcola il prezzo comprensivo di iva
	// Formatta il prezzo restituendo una stringa con numero fisso di decimali e
	// carattere €

}
