import java.util.Random;

public class array4_1 {
    public static void main(String[] args) {
        int[] randomzahlen = new int[20];
        Random zufall = new Random();


        for (int i = 0; i < randomzahlen.length; i++) {
            randomzahlen[i] = zufall.nextInt(6); 
            System.out.println(randomzahlen[i]);
        }


        int anzahlNullen = 0;
        for (int i = 0; i < randomzahlen.length; i++) {
            if (randomzahlen[i] == 0) {
                anzahlNullen++;
            }
        }

        int[] neuesArray = new int[randomzahlen.length];
        int index = 0;
        for (int i = 0; i < randomzahlen.length; i++) {
            if (randomzahlen[i] != 0) {
                neuesArray[index++] = randomzahlen[i];
            }
        }
        while (index < neuesArray.length) {
            neuesArray[index++] = 0;
        }

        System.out.println("Anzahl der Felder mit dem Wert 0: " + anzahlNullen);
        System.out.println("Danach:");
        for (int i = 0; i < neuesArray.length; i++) {
            System.out.println(neuesArray[i]);
        }
    }
}