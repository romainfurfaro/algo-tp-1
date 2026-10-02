import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TP3_Exo3 {
    static void main(String[] args) {
        String phrase;
        Map<String, Integer> motsSimilaire = new HashMap<String, Integer> ();
        Scanner scanner = new Scanner(System.in);
        phrase = scanner.nextLine().trim().toLowerCase();

        String[] mots = phrase.split("/\\s+/");
        for (String mot : mots) {
            motsSimilaire.put(mot, motsSimilaire.getOrDefault(mot, 0)+1);
        }


    }

}
