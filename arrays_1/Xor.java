import java.util.Stack;

public class Xor {
    static int ans(String inp)
    {
        Stack<Character> st=new Stack<>();
        for(int i=1; i<inp.length(); i++)
        {
            st.push(inp.charAt(i));
        }
        System.out.println(st);
        int f=inp.charAt(0)-'0';
        while(!st.isEmpty())
        {
            if(st.peek() == 'C')
            {
                st.pop();
                if (!st.isEmpty()) {
                    char a=(char) (f^(st.pop()-'0'));
                    f=a-'0';
                }
            }
            else if(st.peek() == 'B')
            {
                st.pop();
                if (!st.isEmpty()) {
                    char a=(char) (f|(st.pop()-'0'));
                    f=a-'0';
                }
            }
            else if(st.peek() == 'A')
            {
                st.pop();
                if (!st.isEmpty()) {
                    char a=(char) (f&(st.pop()-'0'));
                    f=a-'0';
                }
            }
            else {
                st.pop(); // Remove any unexpected characters
            }
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(ans("1C0C1C1A0B1"));
    }
}