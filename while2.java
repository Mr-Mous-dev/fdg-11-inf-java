public class while2{
     public static void main(String[] args) {
        double Indien = 700000000;
        double China = 990000000;
        int Jahr=1987;
        while (Indien <= China){
        Jahr = Jahr + 1;
        China = China*1.014;
        Indien = Indien*1.021;

        }
        System.out.println(Jahr);
    }
}