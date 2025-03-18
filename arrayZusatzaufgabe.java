import java.util.Random;

public class arrayZusatzaufgabe {
    public static void main(String[] args) {
        int[] randomzahlen = new int[6];
        Random zufall = new Random();


        for (int i = 0; i < randomzahlen.length; i++) {
            randomzahlen[i] = zufall.nextInt(50); 
            System.out.println(randomzahlen[i]);
        }
    }
}