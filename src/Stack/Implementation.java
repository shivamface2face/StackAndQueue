package Stack;

import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(23);
        st.push(45);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
