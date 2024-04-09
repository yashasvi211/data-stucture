public class FindSubset {
    static void find(String input, String ans, int i) {
        if (i == input.length()) {
            System.out.println(ans);
            return;
        }
        find(input, ans + input.charAt(i), i + 1);
        find(input, ans, i + 1);
    }
    
    public static void main(String[] args) {
        find("abc", "", 0);
    }

}

// import java.util.Stack;

// public class FindSubset {
// static Stack<String> find(String inp) {
// Stack<String> ans = new Stack<>();
// for (int i = 0; i < inp.length(); i++) {
// for (int j = i; j < inp.length(); j++) {
// ans.push(inp.substring(i, j + 1));
// }
// }
// return ans;
// }

// public static void main(String[] args) {
// String Aloo = "abc";
// Stack<String> subsets = find(Aloo);
// for (int i = 0; i < subsets.size(); i++) {
// System.out.println(subsets.get(i));
// }
// }
// }
