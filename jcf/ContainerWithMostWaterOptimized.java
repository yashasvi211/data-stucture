import java.util.*;

public class ContainerWithMostWaterOptimized {
    static int optimized(ArrayList<Integer> arr) {
        int front = 0;
        int back = arr.size() - 1;
        int MaxCap = Integer.MIN_VALUE;
        while (front < back) {
            int ht = Math.min(arr.get(front), arr.get(back));
            int curr_area = (back - front) * ht;
            MaxCap = Math.max(MaxCap, curr_area);
            if (arr.get(front) < arr.get(back)) {

                back--;

            } else {

                front++;
            }

        }
        return MaxCap;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.get(1);
        arr.get(8);
        arr.get(6);
        arr.get(2);
        arr.get(5);
        arr.get(4);
        arr.get(8);
        arr.get(3);
        arr.get(7);
        System.out.println(optimized(arr));

    }
}
