class kadanes_algorithm {
    public static int ans(int arr[]) {
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int ans = ans(arr);
        System.out.println("The max subarray sum is " + ans);
    }
}