public class StairCaseSearch {
    public static void ans(int[][] arr, int key) {
        int j = arr[0].length - 1;
        int i = 0;

        while (i <= arr.length && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println("Found It at index: " + i + "," + j);
                return;

            } else if (arr[i][j] < key) {
                i++;

            } else if (arr[i][j] > key) {
                j--;

            }
        }
        System.out.println("Element Not Flound");
        return;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 8, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
        };
        ans(arr, 8);
    }
}
