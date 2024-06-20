public class LaxicographicLargest {
    static void find_largest(String arr[]) {
        String Largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareToIgnoreCase(Largest) > 0) {
                Largest = arr[i];
            }
        }
        System.out.println(Largest);
    }

    public static void main(String[] args) {
        String[] arr = { "aab", "aaa", "zzz" };

        find_largest(arr);

    }
}
