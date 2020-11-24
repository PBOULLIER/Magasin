package application;

import java.util.Scanner;

public class MenuClient {

        public MenuClient(){

            int Choix;

            Scanner sc = new Scanner(System.in);

            System.out.println("Vous êtes connecté en tant que Client");
            System.out.println("Tappez le numéro correspondant à l'action souhaitée");
            System.out.println("1 Liste des produits");
            System.out.println("2 Panier");
            System.out.println("3 Déconnexion");

            Choix = sc.nextInt();

            switch (Choix){
                case 1 :
                    new MagasinGestion();
                case 2 :
                    new Panier();
                case 3 :
                    new MenuPrincipal();
            }
        }
}
