import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        int target = 12;
        int front = 0;
        int back = arr.size() - 1;
        while (front != back) {
            if (arr.get(back) + arr.get(front) == target) {

                System.out.println("At Index:" + front + " " + back);

            }
            if (arr.get(back) + arr.get(front) < target) {
                front++;
            } else {
                back--;
            }
        }

    }
}
