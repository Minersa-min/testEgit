import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Continent continent = new Continent("Afrique", 30370000f);
        Pays unPays = null;
        Capitale uneCapitale = null;
        
        System.out.println("test1234566778833");

        int choix = 0;
        do {
            System.out.println("\n--- MENU APPLICATION PAYS / CONTINENT ---");
            System.out.println("1. Créer un pays et sa capitale");
            System.out.println("2. Ajouter une ville au pays");
            System.out.println("3. Rechercher une ville");
            System.out.println("4. Supprimer une ville");
            System.out.println("5. Afficher le continent et ses pays");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();
                scanner.nextLine(); // Vider le buffer

                switch (choix) {
                    case 1:
                        System.out.print("Nom de la capitale : ");
                        String nomCap = scanner.nextLine();
                        System.out.print("Nombre d'habitants de la capitale : ");
                        int habCap = scanner.nextInt();
                        System.out.print("Superficie de la capitale : ");
                        float supCap = scanner.nextFloat();
                        scanner.nextLine(); // Vider le buffer

                        System.out.print("Nom du pays : ");
                        String nomPays = scanner.nextLine();
                        System.out.print("Langue : ");
                        String langue = scanner.nextLine();
                        System.out.print("Monnaie : ");
                        String monnaie = scanner.nextLine();

                        uneCapitale = new Capitale(nomCap, habCap, supCap, null);
                        unPays = new Pays(nomPays, langue, monnaie, uneCapitale);
                        //uneCapitale.setSonPays(unPays);
                        continent.ajouterUnPays(unPays);

                        System.out.println("Pays et capitale créés avec succès !");
                        break;

                    case 2:
                        if (unPays != null) {
                            System.out.print("Nom de la ville : ");
                            String nomV = scanner.nextLine();
                            System.out.print("Nombre d'habitants : ");
                            int habV = scanner.nextInt();
                            System.out.print("Superficie : ");
                            float supV = scanner.nextFloat();
                            scanner.nextLine(); // Vider le buffer

                            Ville v = new Ville(nomV, habV, supV, unPays);
                            if (unPays.ajouterUneVille(v)) {
                                System.out.println("Ville ajoutée avec succès !");
                            } else {
                                System.out.println("Erreur : Impossible d'ajouter (limite de 5 villes atteinte).");
                            }
                        } else {
                            System.out.println("Veuillez d'abord créer un pays (Option 1).");
                        }
                        break;

                    case 3:
                        if (unPays != null) {
                            System.out.print("Nom de la ville à rechercher : ");
                            String rech = scanner.nextLine();
                            Ville trouvee = unPays.rechercherUneVille(rech);
                            if (trouvee != null) {
                                System.out.println("Ville trouvée : " + trouvee.getNom() + " (" + trouvee.getNbHabitants() + " hab)");
                            } else {
                                System.out.println("Ville introuvable.");
                            }
                        } else {
                            System.out.println("Aucun pays créé.");
                        }
                        break;

                    case 4:
                        if (unPays != null) {
                            System.out.print("Nom de la ville à supprimer : ");
                            String supp = scanner.nextLine();
                            if (unPays.supprimerUneVille(supp)) {
                                System.out.println("Ville supprimée avec succès.");
                            } else {
                                System.out.println("Ville introuvable pour la suppression.");
                            }
                        } else {
                            System.out.println("Aucun pays créé.");
                        }
                        break;

                    case 5:
                        System.out.println(continent.afficher());
                        break;

                    case 6:
                        System.out.println("Fermeture de l'application. Au revoir !");
                        break;

                    default:
                        System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 6.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un chiffre.");
                scanner.nextLine(); // Vider l'entrée incorrecte
            }
        } while (choix != 6);

        scanner.close();
    }
}
