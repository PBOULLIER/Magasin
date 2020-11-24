package ex;

import magasin.Magasin;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                     new magasin.Magasin();
                  //  Gra monAppli =  new GraphicalApplication();
                  //  monAppli.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("L'application à detecter une erreur de type " + e.getMessage());
                }
            }
        });
    }
}
