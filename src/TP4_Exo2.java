public class TP4_Exo2 {
    private static int rechercheLineaire(int[] tab, int cible) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == cible) return i;
        }
        return -1;
    }

    private static int rechercheDichotomique(int[] tab, int cible) {
        int debut = 0;
        int fin = tab.length - 1;

        while (debut <= fin) {
            int milieu = (debut + fin) / 2;
            if (tab[milieu] == cible) return milieu;
            if (tab[milieu] < cible) {
                debut = milieu + 1;
            } else {
                fin = milieu - 1;
            }
        }
        return -1;
    }

    private static int[] genererTableau(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i;
        }
        return tab;
    }

    public static void main(String[] args) {
        int[] tailles = {1000, 10000, 100000, 1000000};

        System.out.println("Taille | Lineaire (ms) | Dichotomique (ms) | Ratio");

        for (int i = 0; i < tailles.length; i++) {
            int n = tailles[i];
            int[] tab = genererTableau(n);
            int cible = -1;

            long debut1 = System.nanoTime();
            rechercheLineaire(tab, cible);
            long fin1 = System.nanoTime();
            double tempsLineaire = (fin1 - debut1) / 1000000;

            long debut2 = System.nanoTime();
            rechercheDichotomique(tab, cible);
            long fin2 = System.nanoTime();
            double tempsDicho = (fin2 - debut2) / 1000000;

            double ratio = tempsLineaire / tempsDicho;

            System.out.println(n + " | " + tempsLineaire + " | " + tempsDicho + " | " + ratio);
        }
    }
}
