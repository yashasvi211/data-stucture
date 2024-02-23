public class first_occ {
    static int ans(int arr[], int n, int i) {

        if (arr[i] == n) {
            return i;
        } else if (i == arr.length - 1) {
            return -1;
        }
        i++;
        return ans(arr, n, i);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5 };
        int n = 5;
        System.out.println("The first occ of " + n + " is " + ans(arr, n, 0));
    }
}
