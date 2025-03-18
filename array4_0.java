import java.util.Random;

public class array4_0 {
    public static void main(String[] args) {
        int[] randomzahlen = new int[30];
        Random zufall = new Random();

        for (int i = 0; i < randomzahlen.length; i++) {
            randomzahlen[i] = zufall.nextInt(101); 
        }

        int anzahlNullen = 0;
        for (int i = 0; i < randomzahlen.length; i++) {
            if (randomzahlen[i] == 0) {
                anzahlNullen++;
            }
        }

        System.out.println("Anzahl der Felder mit dem Wert 0: " + anzahlNullen);
    }
}