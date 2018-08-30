package Objects;

import VaisseauPlanete.Vaisseau;

public class Outils extends Objets{
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom = "Outils";
    public void Utiliser(Vaisseau v){
        v.setVie(v.getVie()*2);
        if(v.getVie()>100){
            v.setVie(100);
        }
        System.out.println("Vous vous êtes réparé!");
    }
}
