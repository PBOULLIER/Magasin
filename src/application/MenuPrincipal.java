package application;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal(){

        /********************************************************/
        /**********     Affichage du menu Principal    **********/
        /********************************************************/

        System.out.println("Bienvenue");
        System.out.println("Tappez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Se connecter en tant que Client");
        System.out.println("2 Se connecter en tant qu'Administrateur");
        System.out.println("3 Exit");


        // Gestion des choix du menuPrincipal + création des instances des éléments choisis
        Scanner sc = new Scanner(System.in);
        int Choix;
        Choix = sc.nextInt();

        switch (Choix){
            case 1 :
                new MenuClient();
            case 2 :
                new MenuAdministrateur();
            case 3 :
                System.out.println("EXIT");
                System.exit(0);
        }
    }
}
