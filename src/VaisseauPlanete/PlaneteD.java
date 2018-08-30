package VaisseauPlanete;

import Objects.*;

public class PlaneteD extends Planete {
    private String nom = "Triton";

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

    private int prix = 175;
    public void draw(Vaisseau v){
        if((int)(Math.random()*15)==6){
            System.out.println("Vous etes attaqué par des indigènes!");
            v.setVie(v.getVie()-(int)(Math.random()*30));
            System.out.println("Vous êtes blessé");
        }
        System.out.println("Vous aterissez sur la planete Triton, vous recupérer divers objets et vous repartez.");
        Objets aRamasser[] =new Objets[5];
        aRamasser[0] = new Essence();
        aRamasser[1] = new Outils();
        aRamasser[2] = new Nouriture();
        aRamasser[3] = new BoutonRouge();
        aRamasser[4] = new Or();
        for(int i=0;(i<v.getInventaire().length);i++){
            if(v.getInventaire()[i] == null){
                v.setInventaire(i,aRamasser[(int)(Math.random()*4)]);
            }
        }}
}