import java.util.ArrayList;

public class ArrayList2d {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(7);
        main.add(arr1);
        main.add(arr2);
        System.out.println(main);

    }
}
