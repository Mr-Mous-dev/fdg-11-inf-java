public class array1_1 {
    public static void main(String[] args) {
        double startgeld = 1500;
        double zinssatz = 1.028; 
        double[] kontostand = new double[11]; 

        kontostand[0] = startgeld; 

        for (int jahr = 1; jahr <= 10; jahr++) {
            kontostand[jahr] = kontostand[jahr - 1] * zinssatz;
        }
        System.out.println(kontostand[5]);
        System.out.println(kontostand[10]);
    }
}