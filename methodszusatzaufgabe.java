import java.util.Scanner;
import java.util.Random;

public class methodszusatzaufgabe{

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random zufall = new Random();
        boolean zahlGefunden = false;

        while (!zahlGefunden) {
            int min = 4;
            int max = 10;
            int x = (int)(Math.random() * ((max - min) + 1)) + min;
            x--;

            String[] erstesZeichen = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            String[] name = {"1", "2", "3","4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

            String erstesPlatz = erstesZeichen[zufall.nextInt(erstesZeichen.length)];

            System.out.print(erstesPlatz);

            for (int i = 0; i < x; i++) {
                String zeichen = name[zufall.nextInt(name.length)];
                if (Character.isDigit(zeichen.charAt(0))) {
                    zahlGefunden = true;
                }
                System.out.print(zeichen);
            }
            System.out.println();

            if (!zahlGefunden) {
                System.out.println("Keine Zahl gefunden, Neustart...");
            }
        }
    }
}