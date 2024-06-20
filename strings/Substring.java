public class Substring {
    static String substring(String str, int si, int ei) {
        String ans = "";
        for (int i = si; i < ei; i++) {
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Pixel is great";
        System.out.println(substring(str, 0, 3));
    }
}
