public class trapping_rainwater {
    static int ans(int arr[]) {

        int n = arr.length;
        int tmp = Integer.MIN_VALUE;
        int left[] = new int[n];
        int right[] = new int[n];
        int water = 0;
        for (int i = 0; i < n; i++) {
            tmp = Math.max(tmp, arr[i]);
            left[i] = tmp;
            System.out.print(left[i] + " ");
        }
        tmp = 0;
        for (int i = n - 1; i >= 0; i--) {
            tmp = Math.max(tmp, arr[i]);
            right[i] = tmp;

        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            water += Math.min(left[i], right[i]) - arr[i];
        }
        return water;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total units of water trapped is " + ans(arr));
    }
}
