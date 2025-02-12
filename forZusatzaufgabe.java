public class forZusatzaufgabe{
    public static void main(String[] args) {
        int i=0;
        int j=1;
        System.out.println(i);
        System.out.println(j);
        for (int k=0; k<=40; k++){
            
            i=i+j;
            System.out.println(i);
            j=i+j;
            System.out.println(j);
        }
    }
}