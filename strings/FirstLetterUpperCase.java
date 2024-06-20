class FirstLetterUpperCase {
    static String uppercase(String str) {
        StringBuilder ans = new StringBuilder();
        ans.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans.append(str.charAt(i));
                ans.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(uppercase("My Name is, asf,a"));
    }
}
