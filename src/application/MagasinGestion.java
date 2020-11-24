package application;

import objets.Article;

import java.util.Scanner;

public class MagasinGestion {
    static Scanner sc = new Scanner(System.in);

    Magasin monMagasin = new Magasin();

    public MagasinGestion() {

        System.out.println("Ce que nous avons en stock");

        Article article0 = new Article("Saumon", 12, 50, 0);
        Article article1 = new Article("PQ", 6, 50, 1);
        Article article2 = new Article("Jeux", 60, 300, 2);


        monMagasin.getListeDesArticles().add(article0);
        monMagasin.getListeDesArticles().add(article1);
        monMagasin.getListeDesArticles().add(article2);

        choixListeArticle();

    }


    public void choixListeArticle() {

        int choixArticle;
        int choixQuantite;
        int result;



        for (int i = 1; i < monMagasin.getListeDesArticles().size(); i++) {
            System.out.println(monMagasin.getListeDesArticles().get(i).getNom() + " " + monMagasin.getListeDesArticles().get(i).getPrixVente() + " "
                    + monMagasin.getListeDesArticles().get(i).getQuantite() + "  Numéro à entrer :" + monMagasin.getListeDesArticles().get(i).getIndex());
        }


        choixArticle = sc.nextInt();

        while (choixArticle != 0) {

            if (monMagasin.getListeDesArticles().get(choixArticle).getQuantite() == 0) {
                System.out.println("Rupture de Stock");

            } else {

                System.out.println(monMagasin.getListeDesArticles().get(choixArticle).getIndex() + " " + monMagasin.getListeDesArticles().get(choixArticle).getNom());

                System.out.println("Combien en voulez vous ?");

                choixQuantite = sc.nextInt();

                result = monMagasin.getListeDesArticles().get(choixArticle).getQuantite() - choixQuantite;

                monMagasin.getListeDesArticles().get(choixArticle).setQuantite(result);

                System.out.println("Il y a" + result + "restant(s)");

            }
            choixListeArticle();
        }

    }
}
