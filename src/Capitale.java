public class Capitale extends Ville{
    //protected String nom; 
    //protected int nbHabitants;
    //protected float superficie;
    
    //constructeur
    public Capitale(String unNom, int unNbHabitants, float uneSuperficie, Pays unPays) {
        super(unNom, unNbHabitants, uneSuperficie, unPays);
    }
    
    //accesseur nom
    //public String getNom() {
    // return this.nom;
    //}
    
    //public void setNom(String unNom) {
    //    this.nom = unNom;
    //}
    
    //accesseur nbHabitant
    //public int getNbHabitants() {
    //   return this.nbHabitants;
    //}
    
    //public void setNbHabitants(int unNbHabitants) {
    //    this.nbHabitants = unNbHabitants;
    //  }

    //accesseur Superficie
    // public float getSuperficie() {
    //   return this.superficie;
    //}
    
    //public void setSuperficie(float uneSuperficie) {
    //  this.superficie = uneSuperficie;
    //}
    
    
    
    //methode toString
    //public String toString() {
      //  String res = "";
        //if (this.nom != null) {
          //  res += "\nNom : " + this.nom;
        //}
        //if (this.nbHabitants != 0) {
          //  res += "\nnbHabitants : " + this.nbHabitants;
        //}
        //if (this.superficie != 0) {
          //  res += "\nSuperficie : " + this.superficie;
        //}
        //return res;
    //}
    
    
    
    // Dans la classe Capitale
    public String toString() {
        super.toString();
        return super.toString() + " et c'est une capitale."; 
    }
}