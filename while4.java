import java.util.Scanner;

public class while4{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viel Geld?");
        double Einwurf = input.nextDouble();
        input.close();
        double Fahrtkosten = 12.6;
        double Restgeld = 0;
        double Restgeldstart = Einwurf - Fahrtkosten;
        double Anzahl2 = 0;
        double Anzahl1= 0;
        double Anzahl050 = 0;
        double Anzahl020 = 0;
        double Anzahl010 = 0;
        double Anzahl005 = 0;
        double Anzahl002= 0;
        double Anzahl001= 0;
        int Anzahl2gerundet = 0;
        int Anzahl1gerundet = 0;
        int Anzahl050gerundet= 0;
        int Anzahl020gerundet = 0;
        int Anzahl010gerundet = 0;
        int Anzahl005gerundet = 0; 
        int Anzahl002gerundet = 0;
        int Anzahl001gerundet = 0;

        Restgeld = Restgeldstart;
        
        if (Restgeldstart < 9.99) {
            while (Restgeld > 0){
                Anzahl2 = Restgeld / 2;
                Anzahl2gerundet = (int) Anzahl2;
                Restgeld = Restgeld - 2 * Anzahl2gerundet;
                if (Restgeld < 0){break;}
                System.err.println(Anzahl2);

                Anzahl1 = Restgeld / 1;
                Anzahl1gerundet = (int) Anzahl1;
                Restgeld = Restgeld - 1 * Anzahl1gerundet;
                if (Restgeld < 0){break;}
                System.out.println(Anzahl1);

                Anzahl050 = Restgeld / 0.5;
                Anzahl050gerundet = (int) Anzahl050;
                Restgeld = Restgeld - 0.5 * Anzahl050gerundet;
                if (Restgeld < 0){break;}

                Anzahl020 = Restgeld / 0.2;
                Anzahl020gerundet = (int) Anzahl020;
                Restgeld = Restgeld - 0.2 * Anzahl020gerundet;
                if (Restgeld < 0){break;}

                Anzahl010 = Restgeld / 0.1;
                Anzahl010gerundet = (int) Anzahl010;
                Restgeld = Restgeld - 0.1 * Anzahl010gerundet;
                if (Restgeld < 0){break;}

                Anzahl005 = Restgeld / 0.05;
                Anzahl005gerundet = (int) Anzahl005;
                Restgeld = Restgeld - 0.05 * Anzahl005gerundet;
                if (Restgeld < 0){break;}

                Anzahl002 = Restgeld / 0.02;
                Anzahl002gerundet = (int) Anzahl002;
                Restgeld = Restgeld - 0.02 * Anzahl002gerundet;
                if (Restgeld < 0){break;}

                Anzahl001 = Restgeld / 0.01; 
                Anzahl001gerundet = (int) Anzahl001;
            }
            System.out.println(Anzahl2gerundet + " 2€, " + Anzahl1gerundet + " 1€, " + Anzahl050gerundet + " 50 Cent, " + Anzahl020gerundet + " 20 Cent, " + Anzahl010gerundet + " 10 Cent, " + Anzahl005gerundet + " 5 Cent, " + Anzahl002gerundet + " 2 Cent, " + Anzahl001gerundet + " 1 Cent");
        }
        else {
        System.out.println("Zu viel!");
        }

    }
}