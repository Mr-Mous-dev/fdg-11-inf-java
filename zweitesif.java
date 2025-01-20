import java.util.Scanner;

public class zweitesif {
     public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
            int Packetsmall = 5;
            int Packetmedium = 10;
            int Packetlarge = 15;
         System.out.print("Wie viel wiegt ihr Packet?");
         int Gewicht= input.nextInt();
         input.close();
         if (Gewicht < 10) {
             System.out.print("Sie zahlen " + Packetsmall + " €.");
         }
         else if (Gewicht < 20) {
             System.out.print("Sie zahlen " + Packetmedium + " €.");
         }
         else {
             System.out.print("Sie zahlen " + Packetlarge + " €.");
         }// closing the scanner object
         
     }
 }