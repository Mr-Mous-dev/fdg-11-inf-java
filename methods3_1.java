import java.util.Scanner;

public class methods3_1{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Wie alt bist du?");
        int alter = in.nextInt();

        System.out.println("Gib an, wie viel du fahren möchtest!");
        double gefahrene_Kilometer = in.nextInt();

        System.out.println("Welche Kategorie hast du?");
        int kategorie = in.nextInt();
        double kosten = umrechnung(gefahrene_Kilometer, alter, kategorie);
        System.out.println(kosten + "€");
    }
    static double umrechnung(double Kilometer, int alter, int kategorie){
        double preis = 0;

        if (alter > 25) {
            if (Kilometer > 100){
                if (kategorie == 1) {
                    preis = 50 + (Kilometer - 100) * 0.5;
                }
                else {
                    preis = 50 + (Kilometer - 100) * 0.5 + Kilometer*0.05*kategorie;
                }
            } else {
                if (kategorie == 1) {
                    preis = Kilometer*0.5;
                }
                else {
                    preis = Kilometer*0.5+ Kilometer*0.05*kategorie;
                }
            }
        }
        else{
            if (Kilometer > 100){
                if (kategorie == 1) {
                    preis = 50 + (Kilometer - 100) * 0.35;
                }
                else {
                    preis = 50 + (Kilometer - 100) * 0.35 + Kilometer*0.05*kategorie;
                }
            } else {
                if (kategorie == 1) {
                    preis = Kilometer*0.35;
                }
                else {
                    preis = Kilometer*0.35+ Kilometer*0.05*kategorie;
                }
            }
        }
        return preis;

    }
}