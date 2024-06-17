
import java.util.ArrayList;
import java.util.List;

public class temp {
    public static void main(String[] args) {
        int n = 12;
        int k = 3;
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                temp.add(i);
            }
        }
        System.out.println(temp);
        if (k >= n) {
            System.out.println(-1);
            return;
        }
        int ans = temp.get(k - 1);
        System.out.println(ans);
    }
}
