public class InsertionSort {
    static void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            {
                int current = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > current) {
                        arr[j] = arr[j + 1];
                        arr[j + 1] = current;
                    }
                }
            }
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        sort(arr);
        System.out.println("\nElements after sorting");
        print(arr);
    }
}
