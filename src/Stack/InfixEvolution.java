package Stack;

import java.util.Stack;

public class InfixEvolution {
    public static void main(String[] args) {
        String str="2+(5-3*6/2)";
     int ans=   iinfix(str);
        System.out.println(ans);
    }

      static int iinfix(String str) {


          Stack<Integer>oprnd=new Stack<>();
          Stack<Character>oprator=new Stack<>();
          for (int i = 0; i <str.length() ; i++) {
              char ch=str.charAt(i);
               if (ch=='('){
                    oprator.push(ch);
               }else if (Character.isDigit(ch)){
                    oprnd.push(ch-'0');             // char to integer conversion
               }else if (ch==')'){
                   while (oprator.peek()!='('){
                        char oport=oprator.pop();
                        int v2=oprnd.pop();
                        int v1=oprnd.pop();
                        int opv=operation(oport,v1,v2);
                        oprnd.push(opv);
                   }
                   oprator.pop();

               }else if (ch=='+' || ch=='/' || ch=='*' || ch=='-'){
                   while (oprator.size()>0 && oprator.peek()!='(' &&
                           precidqnce(ch)<=precidqnce(oprator.peek())){

                           char oport=oprator.pop();
                           int v2=oprnd.pop();
                           int v1=oprnd.pop();
                           int opv=operation(oport,v1,v2);
                           oprnd.push(opv);


                   }
                   oprator.push(ch);

              }
          }

          while (oprator.size()!=0){
              char oport=oprator.pop();
              int v2=oprnd.pop();
              int v1=oprnd.pop();
              int opv=operation(oport,v1,v2);
              oprnd.push(opv);
          }

      return oprnd.peek();

    }

    public static int precidqnce(char oprt){
        if (oprt=='+'){
            return 1;
        }else if (oprt=='-'){
            return 1;
        }else if (oprt=='/'){
            return 2;
        }else{
            return 2;
        }
    }
    public static int operation(char oprt,int v1,int v2){
        if (oprt=='+'){
            return v1+v2;
        }else if (oprt=='-'){
            return v1-v2;
        }else if (oprt=='/'){
            return v1/v2;
        }else{
            return v1*v2;
        }
    }


}
