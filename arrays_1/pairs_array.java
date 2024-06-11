class pairs_array {
    public static int pairs(int arr[]) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            int pan = i + 1;
            if (i == arr.length - 1)
                break;
            System.out.print("The number of pair " + pan + " are ");
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ") ");
                ans++;
            }
            System.out.println();
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        System.out.println("The number of pairs are " + pairs(arr));
    }
}