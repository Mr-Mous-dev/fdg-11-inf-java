import java.util.Scanner;
public class while42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel Geld?");
        double Einwurf = input.nextDouble();
        input.close();
        double Fahrtkosten = 12.6;
        double Restgeld = Einwurf - Fahrtkosten;

        if (Restgeld < 0) {
            System.out.println("Nicht genug Geld eingeworfen!");
            return;
        }
        if (Restgeld > 9.99) {
            System.out.println("Zu viel!");
            return;
        }
        int Anzahl2 = 0;
        int Anzahl1 = 0;
        int Anzahl050 = 0;
        int Anzahl020 = 0;
        int Anzahl010 = 0;
        int Anzahl005 = 0;
        int Anzahl002 = 0;
        int Anzahl001 = 0;
        while (Restgeld > 0) {
            if (Restgeld >= 2) {
                Anzahl2 = (int) (Restgeld / 2);
                Restgeld -= Anzahl2 * 2;
            } else if (Restgeld >= 1) {
                Anzahl1 = (int) (Restgeld / 1);
                Restgeld -= Anzahl1 * 1;
            } else if (Restgeld >= 0.5) {
                Anzahl050 = (int) (Restgeld / 0.5);
                Restgeld -= Anzahl050 * 0.5;
            } else if (Restgeld >= 0.2) {
                Anzahl020 = (int) (Restgeld / 0.2);
                Restgeld -= Anzahl020 * 0.2;
            } else if (Restgeld >= 0.1) {
                Anzahl010 = (int) (Restgeld / 0.1);
                Restgeld -= Anzahl010 * 0.1;
            } else if (Restgeld >= 0.05) {
                Anzahl005 = (int) (Restgeld / 0.05);
                Restgeld -= Anzahl005 * 0.05;
            } else if (Restgeld >= 0.02) {
                Anzahl002 = (int) (Restgeld / 0.02);
                Restgeld -= Anzahl002 * 0.02;
            } else {
                Anzahl001 = (int) (Restgeld / 0.01);
                Restgeld -= Anzahl001 * 0.01;
            }
            Restgeld = Math.round(Restgeld * 100.0) / 100.0; 
        }
        System.out.println(Anzahl2 + "x 2€, " +
                Anzahl1 + "x 1€, " +
                Anzahl050 + "x 50 Cent, " +
                Anzahl020 + "x 20 Cent, " +
                Anzahl010 + "x 10 Cent, " +
                Anzahl005 + "x 5 Cent, " +
                Anzahl002 + "x 2 Cent, " +
                Anzahl001 + "x 1 Cent");
    }
}
