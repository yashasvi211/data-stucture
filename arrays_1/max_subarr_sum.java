public class max_subarr_sum {
    public static int ans(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(" " + arr[k]);
                }

                max = Math.max(max, sum);
                System.out.println("=" + sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int ans = ans(arr);
        ans(arr);
        System.out.println("The max subarray sum is " + ans);

    }
}
