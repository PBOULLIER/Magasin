package application;

import java.util.Scanner;

public class MenuAdministrateur {

    public MenuAdministrateur(){

        int Choix;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vous êtes connecté en tant qu'Administrateur");
        System.out.println("Tappez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Liste des produits");
        System.out.println("2 Panier");
        System.out.println("3 Order list");
        System.out.println("4 Déconnexion");

        Choix = sc.nextInt();

        switch (Choix){
            case 1 :
                new MagasinGestion();
            case 2 :
                new MagasinGestion();
            case 3 :
                new ListeDeCourse();
            case 4 :
                new MenuPrincipal();
        }
    }

}

