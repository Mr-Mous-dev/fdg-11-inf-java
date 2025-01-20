import java.util.Scanner;

public class drittesif {
     public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
            
         System.out.print("Wie groß ist der Oberschenkel?");
         double Oberschenkellänge= input.nextDouble();
         System.out.print("Wie alt ist es?");
        double Lebensjahr = input.nextDouble();
         input.close();
         double Körpergröße;
         Körpergröße = 69.089 + 2.238 * Oberschenkellänge - Lebensjahr * 0.06;
        System.out.print("Der Körper ist " + Körpergröße + " cm groß.");
     }
 }