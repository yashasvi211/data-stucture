import java.util.ArrayList;

class ReverseArrayList {
    static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("Before:\n" + arr);

        System.out.println(reverse(arr));
    }
}