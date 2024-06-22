import java.util.*;

public class ContainerWithMostWaterBF {
    static int find(ArrayList<Integer> arr) {
        int max_area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int min = Math.min(arr.get(i), arr.get(j));
                int area = (j - i) * min;
                max_area = Math.max(max_area, area);
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(find(arr));
    }
}
