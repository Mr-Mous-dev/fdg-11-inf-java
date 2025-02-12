import java.util.Scanner;

public class while43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel Geld?"); 
        double Einwurf = input.nextDouble(); //Eingabe des Geldbetrags
        input.close();

        double Fahrtkosten = 12.6;
        double Restgeld = Einwurf - Fahrtkosten; //Berechnung des Restgelds

        if (Restgeld < 0) {
            System.out.println("Nicht genug Geld eingeworfen!"); //Wenn weniger Geld als notwenidg eingeworfen wurde, dann wird dies ausgegeben.
            return;
        }
        
        if (Restgeld > 9.99) {
            System.out.println("Zu viel!"); //Da Verkaufsautomaten keine Scheine ausgeben, kann man nicht mehr Restgeld als 9,99€ haben. 
            return;
        }

        /*
         * Deklalierung und Inizialisierung der Anzahl der Münzen
         */

        int anzahl2EuroMuenzen = 0;
        int anzahl1EuroMuenzen = 0;
        int anzahl50CentMuenzen = 0;
        int anzahl20CentMuenzen = 0;
        int anzahl10CentMuenzen = 0;
        int anzahl5CentMuenzen = 0;
        int anzahl2CentMuenzen = 0;
        int anzahl1CentMuenzen = 0;

        /*
         * Für jede Anzahl der Münzen wird das Restgeld druch den Betrag der Münze geteilt. Das Restgeld wird neuberechnet, in dem das scho ausbezahlte Geld vom Restgeld subtrahiert wird.
         */

        while (Restgeld > 0) {
            if (Restgeld >= 2) {
                anzahl2EuroMuenzen = (int) (Restgeld / 2);
                Restgeld -= anzahl2EuroMuenzen * 2;
            } else if (Restgeld >= 1) {
                anzahl1EuroMuenzen = (int) (Restgeld / 1);
                Restgeld -= anzahl1EuroMuenzen * 1;
            } else if (Restgeld >= 0.5) {
                anzahl50CentMuenzen = (int) (Restgeld / 0.5);
                Restgeld -= anzahl50CentMuenzen * 0.5;
            } else if (Restgeld >= 0.2) {
                anzahl20CentMuenzen = (int) (Restgeld / 0.2);
                Restgeld -= anzahl20CentMuenzen * 0.2;
            } else if (Restgeld >= 0.1) {
                anzahl10CentMuenzen = (int) (Restgeld / 0.1);
                Restgeld -= anzahl10CentMuenzen * 0.1;
            } else if (Restgeld >= 0.05) {
                anzahl5CentMuenzen = (int) (Restgeld / 0.05);
                Restgeld -= anzahl5CentMuenzen * 0.05;
            } else if (Restgeld >= 0.02) {
                anzahl2CentMuenzen = (int) (Restgeld / 0.02);
                Restgeld -= anzahl2CentMuenzen * 0.02;
            } else {
                anzahl1CentMuenzen = (int) (Restgeld / 0.01);
                Restgeld -= anzahl1CentMuenzen * 0.01;
            }
            Restgeld = Math.round(Restgeld * 100.0) / 100.0;  //Auf zwei Nachkommastellen gerundet
        }

        /*
        * Ausgabe der Ergbenisse
        */

        System.out.println(anzahl2EuroMuenzen + "x 2€, " +
                anzahl1EuroMuenzen + "x 1€, " +
                anzahl50CentMuenzen + "x 50 Cent, " +
                anzahl20CentMuenzen + "x 20 Cent, " +
                anzahl10CentMuenzen + "x 10 Cent, " +
                anzahl5CentMuenzen + "x 5 Cent, " +
                anzahl2CentMuenzen + "x 2 Cent, " +
                anzahl1CentMuenzen + "x 1 Cent");
    }
}
