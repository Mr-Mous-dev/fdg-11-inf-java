public class array3_0 {
    public static void main(String[] args) {
        int[] arrayidkgoofy = {1, 2, 3, 4, 5};

        schlaueMethode(arrayidkgoofy);
    }

    static void schlaueMethode(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}