package ahmed;

import java.util.Objects;

public class Voiture {
    private String marque;
    private double prix;

    public Voiture(){
    }

    /**
     * Constructeur
     *
     *  L'id est généré automatiquement
     *  @param marque
     *  @param prix
     */
    public Voiture(String marque, double prix){
        this.marque = marque;
        this.prix   = prix;
    }

    public String getMarque(){ return marque; }

    public void setMarque(String marque) { this.marque = marque; }

    public double getPrix() { return prix; }

    public void setPrix(double prix) { this.prix = prix; }

    @Override
    public String toString(){
        return "\"Car\":{"
                + "\"marque\":\""+ marque + "\","
                + "\"prix\":"+prix+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voiture voiture = (Voiture) o;
        return Double.compare(getPrix(), voiture.getPrix()) == 0 &&
        Objects.equals(getMarque(), voiture.getMarque()) ;
    }

}