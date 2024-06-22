import java.util.*;

public class PairSum2 {
    // Sorted and rotated
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int pivot = -1;
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i + 1) < arr.get(i)) {
                System.out.println(i + "=" + arr.get(i));
                pivot = i;
                break;
            }
        }
        int target = 14;
        int rp = pivot;
        int lp = pivot + 1;
        int n = arr.size();
        while (rp != lp) {
            if (arr.get(lp) + arr.get(rp) == target) {
                System.out.println("True");
                return;
            }
            if (arr.get(lp) + arr.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        System.out.println("False");
    }
}
