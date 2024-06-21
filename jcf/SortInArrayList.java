import java.util.ArrayList;
import java.util.Collections;

public class SortInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(14);
        arr.add(41);
        arr.add(43);
        arr.add(24);
        arr.add(4);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("After Sorting:" + arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("In reverse Order:" + arr);
    }
}
