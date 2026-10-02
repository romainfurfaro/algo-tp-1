import java.util.ArrayList;
import java.util.Scanner;

public class TP3_Exo2 {
    static ArrayList<String> listeArticles = new ArrayList<>();

    static void ajoutArticle(String article) {
        listeArticles.add(article);
        System.out.printf("> Ajouter \"%s\" -> OK", article);
    }

    static void supprimerArticle(String article) {
        int index = listeArticles.indexOf(article);
        if (index == -1) {
            System.out.printf("> Supprimer \"%s\" -> Non trouvé", article);
        } else {
            listeArticles.remove(index);
            System.out.printf("> Supprimer \"%s\" -> OK", article);
        }
    }

    static void rechercheArticle(String article) {
        int index = listeArticles.indexOf(article);
        if (index == -1) {
            System.out.printf("> Rechercher \"%s\" -> Non trouvé", article);
        } else {
            System.out.printf("> Rechercher \"%s\" -> Trouvé à la position %s", article, index+1);
        }
    }

    static void afficherListe() {
        if (listeArticles.isEmpty()) {
            System.out.println("> Afficher -> Liste vide");
        }
        System.out.print("> Afficher ->");
        for (int i = 0; i < listeArticles.size(); i++) {
            System.out.printf(" %s. %s ", i+1, listeArticles.get(i));
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        while (choix != 5) {
            System.out.println();

            System.out.println("1. Ajouter un article");
            System.out.println("2. Supprimer un article");
            System.out.println("3. Rechercher un article");
            System.out.println("4. Afficher la liste des articles");
            System.out.println("5. Quitter");
            choix = Integer.parseInt(scanner.nextLine());

            switch(choix) {
                case 1:
                    ajoutArticle(scanner.nextLine());
                    break;
                case 2:
                    supprimerArticle(scanner.nextLine());
                    break;
                case 3:
                    rechercheArticle(scanner.nextLine());
                    break;
                case 4:
                    afficherListe();
                    break;
            }
        }
        System.out.println("Au revoir");
    }
    /*Réponse question: La question concerne Javascript et non Java. En javascript, splice retire l'élément par rapport à son index (= son ordre dans la liste), ce qui signifie que l'élément est retiré de la liste. Tous les éléments sont donc décalés, leur index change et la liste diminue de 1 à chaque retrait.
    Concernant delete tab[index] l'emplacement de la valeur ne sera pas supprimé, il restera null mais la taille de la liste (tab) ne diminuera pas, et les index ne changeront donc pas. La valeur de l'index choisi sera donc à null avec delete tab[index].

    En Java, l'équivalent de splice est ArrayList.remove(index) et delete tab[index] est tab[index] = null
    */
}
