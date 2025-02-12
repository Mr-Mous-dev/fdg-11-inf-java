public class for2_0 {
    public static void main(String[] args) {
        double preis = 12;
        for(int i=2013; i<=2023; i++){
            System.out.println(i + ": " + preis);
            preis = preis * 1.05;
            preis = Math.round(preis * 100.0) / 100.0;
        }
    }
}