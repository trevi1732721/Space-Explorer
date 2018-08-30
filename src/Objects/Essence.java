package Objects;

import VaisseauPlanete.Vaisseau;

public class Essence extends Objets{
    private String nom = "Essence";

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void Utiliser(Vaisseau v) {
        System.out.println("Votre carburant augmente de 50L.");
        v.setCarburant(v.getCarburant() + 50);
    }
}