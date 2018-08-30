package VaisseauPlanete;

import Objects.*;

public class PlaneteB extends Planete{
    private String nom = "Hypérion";
    private int prix = 150;
    public void draw(Vaisseau v){
        if((int)(Math.random()*15)==6){
            System.out.println("Vous etes attaqué par des indigènes!");
            v.setVie(v.getVie()-(int)(Math.random()*30));
            System.out.println("Vous êtes blessé");
        }
        System.out.println("Vous aterissez sur la planete Hypérion, vous recupérer divers objets et vous repartez.");
        Objets aRamasser[] =new Objets[3];
        aRamasser[0] = new Essence();
        aRamasser[1] = new Or();
        aRamasser[2] = new Nouriture();
        int j = 0;
        for(int i=0;(i<v.getInventaire().length)&&(j<aRamasser.length);i++){
            if(v.getInventaire()[i] == null){
                v.setInventaire(i,aRamasser[j]);
                j++;
            }
        }
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public void setPrix(int prix) {
        this.prix = prix;
    }
}
