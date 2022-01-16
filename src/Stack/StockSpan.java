package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,1,12,6,8,7};
        int ans[]=span(arr);
        System.out.println(Arrays.toString(ans));
    }

       static int[] span(int[] arr) {
        int ans[]=new int[arr.length];
           Stack<Integer>st=new Stack<>();
           st.push(0);
           ans[0]=1;
           for (int i = 1; i <arr.length ; i++) {

              while (st.size()>0 && arr[i]>arr[st.peek()])
              {
                st.pop();
              }
              if (st.size()==0){
                  ans[i]=i+1;
              }else {
                  ans[i]=i-st.peek();
              }
              st.push(i);

           }
           return  ans;
    }
}
