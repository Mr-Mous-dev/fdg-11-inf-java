import java.util.Random;
import java.util.Scanner;

public class whileZusatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Wie viele Aufgaben möchtest du lösen?");
        int anzahl = scanner.nextInt();
        int richtig = 0;
        int zaehler = 0;

        while (zaehler < anzahl) {
            int a = random.nextInt(50) + 1;
            int b = random.nextInt(50) + 1;
            int ergebnis = a + b;

            System.out.print(a + " + " + b + " = ");
            int antwort = scanner.nextInt();

            if (antwort == ergebnis) {
                richtig++;
            }
            zaehler++;
        }

        int prozent = (richtig * 100) / anzahl;
        System.out.println("Du hast " + prozent + "% der Aufgaben richtig gelöst.");
        scanner.close();
    }
}
