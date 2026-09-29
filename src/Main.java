import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //exercice1();
        //exercice2();
        //exercice3();
        //exercice4();
        exercice5();
    }

    public static void exercice1() {
        int celsius;
        float fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ecrire température en Celsius\n");
        celsius = scanner.nextInt();
        scanner.close();

        fahrenheit = (float) celsius * 9 / 5 + 32;

        System.out.println(celsius+"°C" + " = " + fahrenheit+"°F");
    }

    public static void exercice2() {
        float prixHT;
        float tauxTVA;
        float pourcentageRemise;


        float montantTVA;
        float prixTTC;
        float montantRemise;
        float prixFinal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prix HT de l'article\n");
        prixHT = scanner.nextFloat();

        System.out.print("Taux TVA (%)\n");
        tauxTVA = scanner.nextFloat();

        System.out.print("Pourcentage de remise\n");
        pourcentageRemise = scanner.nextInt();

        scanner.close();

        montantTVA = prixHT*tauxTVA/100;
        System.out.println("Montant de la TVA : "+montantTVA);

        prixTTC = prixHT+montantTVA;
        System.out.println("Prix TTC : "+prixTTC);

        montantRemise = prixTTC*(pourcentageRemise/100);
        System.out.println("Montant de la remise : "+montantRemise);

        prixFinal = prixTTC-montantRemise;
        System.out.println("Prix final : "+prixFinal);
    }

    public static void exercice3() {
        // Réponse question: car la variable B va réécrire la variable a avec la même valeur, et donc le fait de réutiliser la variable a pour écrire sur b donnera le même résultat.
        Runnable partieA = () -> {
            int a;
            int b;
            int temp;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Valeur A\n");
            a = scanner.nextInt();

            System.out.print("Valeur B\n");
            b = scanner.nextInt();

            temp = a;
            a = b;
            b = temp;

            System.out.println("a="+a + " b="+b);
        };
        partieA.run();
    }

    public static void exercice4() {
        double poids;
        double taille;
        double imc;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Votre poids (en kg)\n");
        poids = scanner.nextFloat();

        System.out.print("Votre taille (en m)\n");
        taille = scanner.nextFloat();

        imc = poids / (taille * taille);
        String interpretation = new String();

        if (imc < 18.5) {
            interpretation = "Insuffisance ponderale";
        } else if (imc <= 24.9) {
            interpretation = "Poids normal";            
        } else if (imc <= 29.9) {
            interpretation = "Surpoids";
        } else if (imc >= 30.0) {
            interpretation = "Obesite";
        }

        System.out.println("Votre IMC : "+imc+"\n Interprétation : "+interpretation);
    }

    /*
    ALGORITHME DEVIS PEINTURE
    DEBUT
    VARIABLE surfaceNette : ENTIER
    VARIABLE longueur : ENTIER
    VARIABLE largeur : ENTIER
    VARIABLE hauteur : REEL
    VARIABLE perimetre : ENTIER
    VARIABLE nombrePots : ENTIER
    VARIABLE prixTotal : REEL

    ECRIRE("Longueur ?")
    LIRE(longueur)

    ECRIRE("Largeur ?")
    LIRE(largeur)

    ECRIRE("Hauteur ?")
    LIRE(hauteur)

    perimetre <- (longueur+largeur)*2
    surfaceNette <- (perimetre*hauteur)*0,8

    ECRIRE("Surface nette", surfaceNette)


     */
    public static void exercice5() {
        int longueur;
        int largeur;
        double hauteur;

        int surfaceNette;
        int perimetre;
        int nombrePots;
        double prixTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Longueur ?");
        longueur = scanner.nextInt();

        System.out.print("Largeur ?");
        largeur = scanner.nextInt();

        System.out.print("Hauteur ?");
        hauteur = scanner.nextDouble();

        scanner.close();

        perimetre = (longueur+largeur)*2;
        surfaceNette = (int) ((perimetre*hauteur)*0.8);
        System.out.println("Surface nette : "+surfaceNette);

    }
}