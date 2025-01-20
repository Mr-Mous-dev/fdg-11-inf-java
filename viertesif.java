import java.util.Scanner;

public class viertesif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Geben Sie die Anzahl der Überweisungen ein: ");
        int anzahlUeberweisungen = scanner.nextInt();
        

        double gebuehr = 0;
        
        if (anzahlUeberweisungen > 10) {
            int ueberweisungenNachKostenlos = anzahlUeberweisungen - 10;
            
            if (ueberweisungenNachKostenlos <= 10) {
                gebuehr = ueberweisungenNachKostenlos * 0.95;
            } else {
                gebuehr = 10 * 0.95 + (ueberweisungenNachKostenlos - 10) * 1.50;
            }
        }
        
        System.out.println("Die Gebühr für " + anzahlUeberweisungen + " Überweisungen beträgt: " + gebuehr + " €");
        
        scanner.close();
    }
}
