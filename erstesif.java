 import java.util.Scanner;

public class erstesif {
     public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
            int Babys = 0;
            int Kinder = 20;
            int Erwachsene = 35;
         System.out.print("Wie alt sind Sie?");
         int Alter= input.nextInt();
         input.close();
         if (Alter <=3) {
             System.out.print("Sie zahlen " + Babys + " €.");
         }
         else if (Alter <= 14) {
             System.out.print("Sie zahlen " + Kinder + " €.");
         }
         else {
             System.out.print("Sie zahlen " + Erwachsene + " €.");
         }// closing the scanner object
         
     }
 }