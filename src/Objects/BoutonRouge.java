package Objects;

import VaisseauPlanete.Vaisseau;

public class BoutonRouge extends Objets{
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom = "Bouton Rouge";

    public void Utiliser(Vaisseau v) {
        v.setVie(0);
        v.setCarburant(0);
        System.out.println("Vous avez appuillé sur le bouton rouge...");
    }
}
