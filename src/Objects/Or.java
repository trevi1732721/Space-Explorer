package Objects;

import VaisseauPlanete.Vaisseau;

public class Or extends Objets{
    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom = "Or";
    public void Utiliser(Vaisseau v){
        if(v.getVie()<=30){
            v.setVie(0);
            System.out.println("Les Pirates vous recherches ...");
        }
        else{
            v.setVie(10);
            System.out.println("les pirates vous recherches...\n vous reussisez a vous caché, il vous reste 10 points de vie!");
        }
    }
}