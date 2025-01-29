import java.util.Scanner;

public class while3{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int Zahl = 0;
        int Endergebnis=1;
        while (Zahl<n) {
            Zahl = Zahl + 1;
            Endergebnis = Endergebnis*Zahl;
        }
        System.out.println(Endergebnis);


    }
}