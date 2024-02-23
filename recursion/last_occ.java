public class last_occ {
    static int ans(int arr[], int n, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == n) {
            return i;
        }
        i--;
        return ans(arr, n, i);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4 };
        int i = arr.length - 1;
        int n = 4;
        System.out.println("The last occ of " + n + " is " + ans(arr, n, i));

    }
}
