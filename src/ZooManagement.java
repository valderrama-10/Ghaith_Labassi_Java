import java.util.Scanner;

public class ZooManagement {
    // Variables d'instance
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        zooManagement.displayZooInfo();  // Affiche les informations du zoo

        // Appel de la méthode pour permettre à l'utilisateur d'entrer des données
        zooManagement.modifyZooInfo();
    }

    // Méthode pour afficher les informations du zoo
    private void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

    // Méthode pour modifier les informations du zoo
    private void modifyZooInfo() {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer le nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        // Demande à l'utilisateur d'entrer le nombre de cages
        System.out.print("Entrez le nombre de cages : ");

        // Validation de l'entrée utilisateur pour s'assurer qu'il entre un entier
        while (true) {
            try {
                nbrCages = Integer.parseInt(scanner.nextLine());
                if (nbrCages < 0) {
                    System.out.println("Veuillez entrer un nombre valide de cages (supérieur ou égal à 0).");
                } else {
                    break; // Sort de la boucle si l'entrée est valide
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre entier valide.");
            }
        }

        // Affiche les nouvelles informations
        displayZooInfo();

        // Fermeture du scanner
        scanner.close();
    }
}
