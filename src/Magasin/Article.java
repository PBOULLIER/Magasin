package Magasin;

public class Article {

    private String nom;
    private double prixVente;
    private int stock;

    public Article(String nom, double prixVente, int stock) {
        this.nom = nom;
        this.prixVente = prixVente;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
