import java.util.Scanner;

public class methods3_0{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Gib an, wie viel du fahren möchtest!");
        double gefahrene_Kilometer = in.nextInt();
        double kosten = umrechnung(gefahrene_Kilometer);
        System.out.println(kosten + "€");
    }
    static double umrechnung(double Kilometer){
        double Preis = 0;
        Preis = 50 + (Kilometer - 100) * 0.35;
        return Preis;
    }
}