import java.util.*;

class ArrList {
    public static void main(String[] args) {
        // ArrayList<Integer> temp = new ArrayList<>();
        // temp.add(12);
        // temp.add(13);
        // temp.add(14);
        // temp.add(15);
        // temp.add(16);
        // System.out.println(temp);
        // temp.add(3, 49);
        // System.out.println(temp);
        // temp.remove(1);

        // System.out.println(Integer.valueOf(49));
        // for (int i = 0; i < temp.size(); i++) {
        // System.out.println("The element is " + temp.get(i));
        // }
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Hydrogen");
        temp.add("Helium");
        for (String str : temp) {
            System.out.println(str);
        }
        System.out.println(temp);
    }
}