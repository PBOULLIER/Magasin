package application;

import objets.Article;

import java.util.ArrayList;

public class Magasin {
    ArrayList<Article> listeDesArticles = null;

    public Magasin(){
        listeDesArticles = new ArrayList<>();
    }

    public ArrayList<Article> getListeDesArticles() {
        return listeDesArticles;
    }

}
