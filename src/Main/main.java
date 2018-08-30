package Main;
import Objects.*;
import VaisseauPlanete.*;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Vaisseau vaisseau = new Vaisseau();
        Stack<Planete> listePlanete = new Stack<Planete>();
        Stack<Vaisseau> vaisseauSave = new Stack<Vaisseau>();
        Vaisseau newVaisseau = new Vaisseau();
        Boolean mort = false;
        int choix1 = 0;
        while(!mort){
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire?" +
                    "\n1- Statistique du vaisseau" +
                    "\n2- Partir à l'exploration" +
                    "\n3- Utiliser un objets" +
                    "\n4- Annuler le dernier déplacement");
            choix1 = sc.nextInt();
            switch (choix1) {
                case 1:
                    statistique(vaisseau);
                    break;
                case 2:
                    Explorer(vaisseau,listePlanete);
                    vaisseauSave.add(new Vaisseau(vaisseau));

                    break;
                case 3:
                    UtiliserObjets(vaisseau);
                    break;
                case 4:

                            listePlanete.pop();
                            vaisseauSave.pop();
                            vaisseau = vaisseauSave.peek();
                            System.out.println("Vous avez fait un retour en arrière");
                    break;
            }
            if(VerifierMort( vaisseau)==1){
                mort = true;
            }
            }
            System.out.println("Voici votre trajet: \n");
        while(listePlanete.size()!= 0){
            System.out.println(listePlanete.pop().getNom()+"\n");
        }


    }

    public static void statistique(Vaisseau v) {
        System.out.println("Votre vaisseau\n    Vie : " + v.getVie() + "\n   Carburant :" + v.getCarburant() + "\n  Votre Inventaire :");
        for (int i = 0; i < v.getInventaire().length; i++) {
            try {
                System.out.print(v.getInventaire()[i].getNom() + "\n");
            } catch (Exception exeption1) {
                System.out.print("Emplacement vide" + "\n");
            }
        }
    }

    public static void UtiliserObjets(Vaisseau v) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel objet voulez vous utiliser?");
        for (int i = 0; i < v.getInventaire().length; i++) {
            try {
                System.out.println(i + 1);
                System.out.print(v.getInventaire()[i].getNom() + "\n");
            } catch (Exception exeption1) {
                System.out.print("Emplacement vide\n");
            }
        }
        switch (sc.nextInt()) {
            case 1:
                v.getInventaire()[0].Utiliser(v);
                v.setInventaire(0, null);
                break;
            case 2:
                v.getInventaire()[1].Utiliser(v);
                v.setInventaire(1, null);
                break;
            case 3:
                v.getInventaire()[2].Utiliser(v);
                v.setInventaire(2, null);
                break;
            case 4:
                v.getInventaire()[3].Utiliser(v);
                v.setInventaire(3, null);
                break;
        }

    }
    public static void Explorer(Vaisseau v, Stack<Planete> lP){
        Planete p;
        switch((int)(Math.random()*5)){
            case 1:p = new PlaneteA();
            v.setCarburant(v.getCarburant()-p.getPrix());
            p.draw(v);
                break;
            case 2:p = new PlaneteB();
                v.setCarburant(v.getCarburant()-p.getPrix());
                p.draw(v);
                break;
            case 3:p = new PlaneteC();
                v.setCarburant(v.getCarburant()-p.getPrix());
                p.draw(v);
                break;
            case 4:p = new PlaneteD();
                v.setCarburant(v.getCarburant()-p.getPrix());
                p.draw(v);
                break;
            case 5:p = new PlaneteE();
                v.setCarburant(v.getCarburant()-p.getPrix());
                p.draw(v);
                break;
            default: p= new PlaneteA();
                v.setCarburant(v.getCarburant()-p.getPrix());
                p.draw(v);
        }
        lP.add(p);
    }
    public static int VerifierMort( Vaisseau v){
        if(v.getCarburant()<=0&&v.getVie()<=0){
            System.out.println(" votre vaisseau est passé en mode autodestruction, meilleur chance la prochaine fois...");
            return 1;
        }else if(v.getCarburant()<=0){
            System.out.println("Vous etes pris sur cette planete, meilleur chance la prochaime fois...");
            return 1;
        }else if(v.getVie()<=0){
            System.out.println("Vos blessures ont eu raison de vous, meilleur chance la prochaine fois...");
            return 1;
        }
        return 0;
    }
}
