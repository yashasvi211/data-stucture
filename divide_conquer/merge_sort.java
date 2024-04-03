class merge_sort {
    static void printarr(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        i++;
        printarr(arr, i);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 23, 2, 1, 1 };
        printarr(arr, 0);
    }
}