package magasin;

import java.util.ArrayList;
import java.util.Scanner;
import objets.Article;


public class Magasin {
    // private ArrayList<Article> listArtciles = null;

    public static void Menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choice 1 Se connecter en tant qu client  \n Choice 2 :Se connecter en tant qu'administrateur \n  Choice 3 : Exit");
        int Choix = sc.nextInt();
        switch (Choix) {
            case 1 :
                System.out.println("Vous êtes connecté en tant que client");
                if (Choix==1) {
                    System.out.println("Choix 1 : Afficher les produits en stock \n Choix 2 : Afficher le Panier  \n Choix 3 : retour");
                    switch (Choix) {
                        case 1 :
                            if (Choix==1){
                                System.out.println("Stock");
                                break;
                            }

                        case 2 :
                            if (Choix==2){
                                System.out.println("Panier");
                                break;
                            }

                        case 3 :
                            if(Choix==3){
                                System.out.println("retour");
                                break;
                            }

                    }
                }
                break;
            case 2 :
                System.out.println("Vous êtes connecté en Administrateur");
                if (Choix==2){
                    System.out.println("Choix 1 : Afficher l'inventaire \n Choix 2 : Ajouter un article \n Choix 3 : retour");
                    switch (Choix){
                        case 1 :
                            if (Choix==1)
                                System.out.println("Inventaire");
                            break;
                        case 2 :
                            if (Choix==2)
                                System.out.println("Ajout");
                            break;
                        case 3 :
                            if (Choix==3)
                                System.out.println("retour");
                            break;
                    }
                }
                break;
            case 3 :
                System.out.println("Exit ");
                if (Choix==3){
                    System.out.println("Kaboom");
                    break;
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}



