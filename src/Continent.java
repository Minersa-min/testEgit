import java.util.ArrayList;

public class Continent {
    
    // Attributs privés
    private String nom;
    private float superficie;
    private ArrayList lesPays;
    
    // Constructeur par défaut
    public Continent() {
        this.lesPays = new ArrayList();
    }
    
    // Constructeur avec le nom
    public Continent(String unNom) {
        this.nom = unNom;
        this.lesPays = new ArrayList();
    }
    
    // Constructeur avec nom et superficie
    public Continent(String unNom, float uneSuperficie) {
        this.nom = unNom;
        this.superficie = uneSuperficie;
        this.lesPays = new ArrayList();
    }
    
    // Accesseur nom
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String unNom) {
        this.nom = unNom;
    }
    
    // Accesseur superficie
    public float getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(float uneSuperficie) {
        this.superficie = uneSuperficie;
    }
    
    // Accesseur lesPays
    public ArrayList getLesPays() {
        return this.lesPays;
    }
    
    // Accesseur nbPays
    public int getNbPays() {
        return this.lesPays.size();
    }
    
    // Méthode pour ajouter un pays
    public boolean ajouterUnPays(Pays unPays) {
        boolean res = false;
        if (this.lesPays.size() < 5) {
            this.lesPays.add(unPays);
            res = true;
        }
        return res;
    }
    
    // Méthode pour rechercher un pays par son nom
    public Pays rechercherUnPays(String unNom) {
       Pays result = null;
       int i = 0;

       while (i < this.lesPays.size() && result == null) {
           if (((Continent) this.lesPays.get(i)).getNom().equalsIgnoreCase(unNom)) {
               result = (Pays) this.lesPays.get(i);
           }
           i++;
       }

       return result;
    }

    // Méthode pour supprimer un pays par son nom
    public boolean supprimerUnPays(String unNom) {
       boolean b = false;
       for (int i = this.lesPays.size() - 1; i >= 0; i--) {
           if (((Continent) this.lesPays.get(i)).getNom().equalsIgnoreCase(unNom)) {
               this.lesPays.remove(i);
               b = true;
           }
       }
       return b;
    }
    
    // Méthode d'affichage
    public String afficher() {
        String res = "";
        
        if (this.nom != null) {
            res += "\nNom du continent : " + this.nom.toUpperCase();
        }
        if (this.superficie != 0) {
            res += "\nSuperficie : " + this.superficie;
        }
        
        res += "\nNombre de pays : " + this.lesPays.size();
        
        // Remplacement de isEmpty() par une vérification avec size() > 0
        if (this.lesPays != null) {
            res += "\nlesPays : " + this.lesPays;                
        }
        
        return res;
    }
}