package org.lessons.java.shop;

public class Prodotto {

  public int codice;
  public String nome;
  public String descrizione;
  public int prezzo;
  public int iva;

  // empty costuttore
  public Prodotto() {
  }

  // costruttore con int,string,int,int
  public Prodotto(int codice, String nome, String descrizione, int prezzo, int iva) {
    this.codice = codice;
    this.nome = nome;
    this.descrizione = descrizione;
    this.prezzo = prezzo;
    this.iva = iva; // 22%
  }

  // Generate a random number
  public int number() {
    return (int) (Math.random() * 101); // Cast to int after multiplying by 101
  }

  // prezzo base
  public int prezzoBase() {
    return this.prezzo;
  }

  public int prezzoIva() {
    return prezzo + (prezzo * iva / 100);

  }

  public String codiceNome() {
    return this.nome;
  }

}
