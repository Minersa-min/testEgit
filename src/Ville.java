public class Ville {
    public String nom; 
    public int nbHabitants;
    public float superficie;
    
    public Ville(String unNom, int unNbHabitants, float uneSuperficie, Pays unPays) {
        this.nom = unNom;
        this.nbHabitants = unNbHabitants;
        this.superficie = uneSuperficie;
    }
    
    //accesseur nom
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String unNom) {
        this.nom = unNom;
    }
    
    
    
    //accesseur nbHabitant
    public int getNbHabitants() {
        return this.nbHabitants;
    }
    
    public void setNbHabitants(int unNbHabitants) {
        this.nbHabitants = unNbHabitants;
    }

    
    //accesseur superficie
    public float getSuperficie() {
        return this.superficie;
    }
    
    
    public void setSuperficie(float uneSuperficie) {
        this.superficie = uneSuperficie;
    }
    
    //methode toString
    public String toString() {
        String res = "";
        if (this.nom != null) {
            res += "\nNom : " + this.nom;
        }
        if (this.nbHabitants != 0) {
            res += "\nnbHabitants : " + this.nbHabitants;
        }
        if (this.superficie != 0) {
            res += "\nSuperficie : " + this.superficie;
        }
        return res;
    }
}
