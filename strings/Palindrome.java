class Palindrome {
    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String filteredString = sb.toString();
        String reversedString = sb.reverse().toString();

        // Debugging output
        System.out.println(filteredString);
        System.out.println(reversedString);

        // Check if the filtered string is equal to its reverse
        return reversedString.equals(filteredString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Should print 'true'
    }
}
