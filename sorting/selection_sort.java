public class selection_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minel = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[minel]) {
                    minel = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minel];
            arr[minel] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3 };

        System.out.println("Elements before sorting:");
        print(arr);
        sort(arr);
        System.out.println("\nElements after sorting:");
        print(arr);
    }
}