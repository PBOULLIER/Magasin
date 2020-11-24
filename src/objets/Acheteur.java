package objets;

import objets.Article;

import java.util.ArrayList;

public class Acheteur {

    private String nom;

    private ArrayList<Article> listArtciles = null;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Article> getListArtciles() {
        return listArtciles;
    }

    public void setListArtciles(ArrayList<Article> listArtciles) {
        this.listArtciles = listArtciles;
    }

    public Acheteur(String nom, ArrayList<Article> listArtciles) {
        this.nom = nom;
        this.listArtciles = listArtciles;


    }
}
