package application;

import objets.Article;

import java.util.Scanner;

public class MagasinGestion {
    static Scanner sc = new Scanner(System.in);

    Magasin monMagasin = new Magasin();

    public MagasinGestion() {

        System.out.println("This is a list of products available :");

        Article product0 = new Article("Saumon", 12, 50, 1);
        Article product1 = new Article("PQ", 6, 50, 2);
        Article product2 = new Article("Jeux", 60, 300, 2);
        monMagasin.getListeDesArticles().add(product0);
        monMagasin.getListeDesArticles().add(product1);
        monMagasin.getListeDesArticles().add(product2);

        chooseInTheListOfProducts();

    }


    public void chooseInTheListOfProducts() {

        int chooseItem;
        int chooseQuantity;
        int result;
        //String continueShopping;


        for (int i = 1; i < monMagasin.getListeDesArticles().size(); i++) {
            System.out.println(monMagasin.getListeDesArticles().get(i).getIndex() + " " + monMagasin.getListeDesArticles().get(i).getNom() + " "
                    + monMagasin.getListeDesArticles().get(i).getQuantite() + " " + monMagasin.getListeDesArticles().get(i).getPrixVente());
        }

        /*System.out.println("Press any key, or q to quit :");

        continueShopping = sc.nextLine();
        if(!continueShopping.equalsIgnoreCase("q"))*/

        chooseItem = sc.nextInt();

        while (chooseItem != 0) {

            if (monMagasin.getListeDesArticles().get(chooseItem).getQuantite() == 0) {
                System.out.println("No more product available");

            } else {

                System.out.println(monMagasin.getListeDesArticles().get(chooseItem).getIndex() + " " + monMagasin.getListeDesArticles().get(chooseItem).getNom());

                System.out.println("How much do you want ?");
                //Choose a quantity
                chooseQuantity = sc.nextInt();
                //Subtract the initial quantity to the chosen one
                result = monMagasin.getListeDesArticles().get(chooseItem).getQuantite() - chooseQuantity;
                //Update the new quantity
                monMagasin.getListeDesArticles().get(chooseItem).setQuantite(result);

                System.out.println("There is " + result + " left");

            }
            chooseInTheListOfProducts();
        }

    }
}
