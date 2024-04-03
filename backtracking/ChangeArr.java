public class ChangeArr {
    public static void changearr(int arr[], int i, int val) {
        if (i == arr.length) {
            printarr(arr, 0);
            return;
        }
        arr[i] = val;
        changearr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;// Backtracking step
    }

    static void printarr(int[] arr, int i) {
        while (i != arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changearr(arr, 0, 1);
        System.out.println();
        printarr(arr, 0);

    }
}