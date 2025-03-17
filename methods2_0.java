import java.util.Scanner;

public class methods2_0 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Gib Meile ein!");
        double eingabe = in.nextDouble();
        double kilometer = meileInKilometer(eingabe);
        System.out.println(kilometer + "km");
    }

    static double meileInKilometer(double meile){
        double kilometer = 0;
        kilometer = meile * 1.609;
        return kilometer; 
    }
}