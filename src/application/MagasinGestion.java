package application;

import objets.Article;
import java.util.Scanner;


public class MagasinGestion {

    /********************************************************/
    /***************    Gestion du Magasin    ***************/
    /********************************************************/

    static Scanner sc = new Scanner(System.in);


    //Instanciation du magasin
    Magasin monMagasin = new Magasin();

    public MagasinGestion() {

        //Affichage de l'inventaire du magasin + infos produits
        System.out.println("Ce que nous avons en stock");

        Article article0 = new Article("Saumon", 12, 50, 0);
        Article article1 = new Article("PQ", 6, 50, 1);
        Article article2 = new Article("Jeux", 60, 300, 2);


        monMagasin.getListeDesArticles().add(article0);
        monMagasin.getListeDesArticles().add(article1);
        monMagasin.getListeDesArticles().add(article2);

        choixListeArticle();

    }


    /********************************************************/
    /**************   Matrice operationnelle   **************/
    /********************************************************/


    //Partie sur le choix des articles + gestion de leur affichage
    public void choixListeArticle() {


        //Instanciation des variables pour le choix des articles
        int choixArticle;
        int choixQuantite;
        int result;
        String continuer;



        for (int i = 1; i < monMagasin.getListeDesArticles().size(); i++) {
            System.out.println(monMagasin.getListeDesArticles().get(i).getNom() + " " + monMagasin.getListeDesArticles().get(i).getPrixVente() + " "
                    + monMagasin.getListeDesArticles().get(i).getQuantite() + "  Numéro à entrer : " + monMagasin.getListeDesArticles().get(i).getIndex());
        }



        ///////////////// Ajout fonction sortir du menu pour revenir vers le panier needed; ///////////////////////
        choixListeArticle();

        System.out.println("Press any key, or q to quit :");

        continuer = sc.nextLine();
        if(!continuer.equalsIgnoreCase("q"));
        choixArticle = sc.nextInt();



        // gestion d'une rupture de stock
        while (choixArticle != 0) {

            if (monMagasin.getListeDesArticles().get(choixArticle).getQuantite() == 0) {
                System.out.println("Rupture de Stock");

            } else {  // Si pas de rupture de stock alors > Demande la quantité d'un même article à selectionner +
                      //affichage du nombre d'articles restants dans le stock

                System.out.println(monMagasin.getListeDesArticles().get(choixArticle).getIndex() + " " + monMagasin.getListeDesArticles().get(choixArticle).getNom());

                System.out.println("Combien en voulez vous ?");

                choixQuantite = sc.nextInt();

                result = monMagasin.getListeDesArticles().get(choixArticle).getQuantite() - choixQuantite;

                monMagasin.getListeDesArticles().get(choixArticle).setQuantite(result);

                System.out.println("Il y a" + result + "restant(s)");

            }

        }

    }
}
