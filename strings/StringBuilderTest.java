
public class StringBuilderTest {

    public static void main(String[] args) {
        // Create a StringBuilder object and append all lowercase alphabets
        // Time complexity: O(26) = O(1)
        StringBuilder ch = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            ch.append(c);
        }

        // Create a String object and concatenate all lowercase alphabets
        // Time complexity: O(26^2) = O(1)
        String str = "";
        for (char c = 'a'; c <= 'z'; c++) {
            str += c;
        }

        // Print the StringBuilder and String
        System.out.println(ch);
        System.out.println(str);
    }

}
