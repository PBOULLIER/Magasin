package application;

import objets.Article;
import java.util.ArrayList;

/********************************************************/
/****************  Typage d'un magasin  *****************/
/********************************************************/

public class Magasin {

    ArrayList<Article> listeDesArticles = null;

    public Magasin(){
        listeDesArticles = new ArrayList<>();
    }

    public ArrayList<Article> getListeDesArticles() {
        return listeDesArticles;
    }

}
