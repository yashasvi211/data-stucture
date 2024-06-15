
class BubbleSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            {
                print(arr);
                System.out.println("The first element is " + arr[0]);

                for (int j = 0; j < arr.length - i - 1; j++) {

                    for (int k = 0; k < arr.length; k++) {

                        System.out.print(" " + arr[k] + " ");
                    }
                    System.out.println();
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        sort(arr);
        System.out.println("\nElements after sorting");
        print(arr);
    }
}