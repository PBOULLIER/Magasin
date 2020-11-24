package objets;

public class Article {

    private String nom;
    private double prixVente;
    private int quantite;
    private int index;

    public Article(String nom, double prixVente, int quantite, int index) {
        this.nom = nom;
        this.prixVente = prixVente;
        this.quantite = quantite;
        this.index = index;
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

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
