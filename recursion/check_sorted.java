public class check_sorted {
    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            // Reached the last element, array is considered sorted
            return true;
        }

        // Check for ascending order or descending order
        if (arr[i] <= arr[i + 1]) {
            // If current element is less than or equal to the next one, check ascending
            // order
            return isSorted(arr, i + 1);
        } else if (arr[i] >= arr[i + 1]) {
            // If current element is greater than or equal to the next one, check descending
            // order
            return isSorted(arr, i + 1);
        } else {
            // If neither of the above conditions is met, array is not sorted
            return false;
        }
    }

    public static void main(String[] args) {
        int arrAscending[] = { 5, 4, 3, 2, 1 };
        int arrDescending[] = { 1, 2, 3, 4, 5 };

        System.out.println("Is arrAscending sorted? " + isSorted(arrAscending, 0));
        System.out.println("Is arrDescending sorted? " + isSorted(arrDescending, 0));
    }
}
