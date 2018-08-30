package VaisseauPlanete;
import Objects.*;

public class Vaisseau {
    private int carburant = 500;
    private int vie = 100;
    private  Objets[] Inventaire = new Objets[4];

    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public Objets[] getInventaire() {
        return Inventaire;
    }

    public void setInventaire(int i,Objets o) {
        Inventaire[i] = o;
    }

    public void setInventaire(Objets[] inventaire) {
        Inventaire = inventaire;
    }

    public Vaisseau(Vaisseau v) {
        carburant = v.getCarburant();
        vie = v.getVie();
        Inventaire = v.getInventaire();
    }

    public Vaisseau() {

    }
}
