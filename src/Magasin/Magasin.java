package Magasin;

import java.util.Scanner;

public class Magasin {
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);



        System.out.println( "Choice 1 : Log in as a client  \n Choice 2 :Log in as an administrator \n  Choice 3 : Exit   "
        );
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1 :
                System.out.println( "Log in as a client");
                break;
            case 2 :
                System.out.println("Log in as an administrator");
                break;
            case 3 :
                System.out.println("Exit ");
                break;
            default:
                System.out.println("error");
        }
    }
    }
}
