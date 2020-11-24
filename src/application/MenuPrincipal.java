package application;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal(){

        //First menu to appear, we can choose if we use the app as a client or as an admin

        int Choix;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue");
        System.out.println("Tappez le numéro correspondant à l'action souhaitée");
        System.out.println("1 Se connecter en tant que Client");
        System.out.println("2 Se connecter en tant qu'Administrateur");
        System.out.println("3 Exit");

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
