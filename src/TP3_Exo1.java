public class TP3_Exo1 {
    static int minimum(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) min = tab[i];
        }
    return min;
    }

    static int maximum(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) max = tab[i];
        }
        return max;
    }

    static double moyenne(int[] tab) {
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme / tab.length;
    }

    static double ecartType(int[] tab) {
        double resultatMoyenne = moyenne(tab);
        double somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme += (tab[i] - resultatMoyenne) * (tab[i] - resultatMoyenne);
        }
        return Math.sqrt(somme / tab.length);
    }

    static void afficherStats(int[] tab) {
        System.out.println("\n");
        System.out.printf("Min %s\n", minimum(tab));
        System.out.printf("Max %s\n", maximum(tab));
        System.out.printf("Moyenne %s\n", Math.round(moyenne(tab)));
        System.out.printf("Ecart-type %s\n", Math.floor(ecartType(tab)*100)/100);
    }

    static void main(String[] args) {
        afficherStats(new int[]{10, 20, 30, 40, 50});
        afficherStats(new int[]{5, 5, 5, 5});
        afficherStats(new int[]{1});
        afficherStats(new int[]{-3, 0, 3});
    }

    // Réponse question: Car ni 0 ni Infinity sont des valeurs du tableau, on a besoin de la valeur de début du tableau. avec tab[0] on a toujours une valeur provenant du tableau.
}
