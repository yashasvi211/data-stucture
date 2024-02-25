public class remove_duplicates {
    public static void ans(String str, int idx, String newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            ans(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            ans(str, idx + 1, newStr.concat(String.valueOf(currChar)), map);
        }
    }

    public static void main(String[] args) {
        String inputString = "aanujaa";
        boolean[] charMap = new boolean[26];
        ans(inputString, 0, "", charMap);
    }
}
