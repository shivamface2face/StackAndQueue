package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Stack<Character>s=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            if (ch==')'){
                if (s.peek()=='('){
                    System.out.println(true);
                    return;
                }else {
                    while (s.peek()!='('){
                        s.pop();
                    }
                }
            }else {
                s.push(ch);
            }
        }
        System.out.println(false);
    }
}
