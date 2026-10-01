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
        for (int i = 1; i < tab.length; i++) {
            somme += tab[i];
        }
        return somme / tab.length;
    }

    static double ecartType(int[] tab) {
        double resultatMoyenne = moyenne(tab);
        double somme = 0;
        for (int i = 1; i < tab.length; i++) {
            somme += (tab[i] - resultatMoyenne) * (tab[i] - resultatMoyenne);
        }
        return Math.sqrt(somme / tab.length);
    }
}
