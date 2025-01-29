import java.util.Scanner;

public class zusatzaufgabeif {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Luftdruck in mbar?");
        int Luftdruck = input.nextInt();

        System.out.print("Wind von welcher Richtung?");
        String Windrichtung = input.next(); 

        if (Luftdruck > 750) {
            if (Windrichtung.equals("Ost")) {  
                System.out.print("Bewölkt");
            }
            if (Windrichtung.equals("Nord")) {
                System.out.print("Bewölkt");
            }
            if (Windrichtung.equals("Süd")) {
                System.out.print("Regnerisch");
            }
            if (Windrichtung.equals("West")) {
                System.out.print("Regnerisch");
            }
        }

        if (Luftdruck <= 750) {
            if (Windrichtung.equals("Ost")) {
                System.out.print("Sonnig");
            }
            if (Windrichtung.equals("Nord")) {
                System.out.print("Sonnig");
            }
            if (Windrichtung.equals("Süd")) {
                System.out.print("Sonnig");
            }
            if (Windrichtung.equals("West")) {
                System.out.print("Bewölkt");
            }
        }

        input.close();
    }
}
