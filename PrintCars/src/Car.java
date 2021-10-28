import java.awt.*;

public class Car {
    public String marque;
    public Color couleur;
    public String imatriculation;
    public Integer nombreDeKillometre = 0;

    public Car(String marque, Color couleur, String imatriculation, Integer nombreDeKillometre) {
        this.marque = marque;
        this.couleur = couleur;
        this.imatriculation = imatriculation;
        this.nombreDeKillometre = nombreDeKillometre;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getImatriculation() {
        return imatriculation;
    }

    public void setImatriculation(String imatriculation) {
        this.imatriculation = imatriculation;
    }

    public Integer getNombreDeKillometre() {
        return nombreDeKillometre;
    }

    public void setNombreDeKillometre(Integer nombreDeKillometre) {
        this.nombreDeKillometre = nombreDeKillometre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marque='" + marque + '\'' +
                ", couleur=" + couleur +
                ", imatriculation=" + imatriculation +
                ", nombreDeKillometre=" + nombreDeKillometre +
                '}';
    }
}
