public class array1_0 {
    public static void main(String[] args) {
        double startgeld = 1500;
        double zinssatz = 1.028; 
        double[] kontostand = new double[11]; 

        kontostand[0] = startgeld; 

        for (int jahr = 1; jahr <= 10; jahr++) {
            kontostand[jahr] = kontostand[jahr-1] * zinssatz;
        }

        for (int jahr = 0; jahr <= 10; jahr++) {
            System.out.println(kontostand[jahr]);
        }
    }
}