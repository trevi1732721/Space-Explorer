package Objects;

import VaisseauPlanete.Vaisseau;

public class Nouriture extends Objets{
    private String nom = "Nouriture";
    public String getNom() {
        return nom;
    }
    public void Utiliser(Vaisseau v){
        System.out.println("Vous avez mangé(e)!");
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }
}
