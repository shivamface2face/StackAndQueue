package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGraterElement {
    public static void main(String[] args) {
        int arr[]={2,5,9,3,1,12,6,8,7};
      int ans[]=  Nextgrater(arr);
        System.out.println(Arrays.toString(ans));
    }

      static int[] Nextgrater(int[] arr) {
        int[] ans=new int[arr.length];
          Stack<Integer>st=new Stack<>();
          st.push(arr[arr.length-1]);
           ans[ans.length-1]=-1;
          for (int i = arr.length-2; i >=0 ; i--) {
              while (st.size()>0 && st.peek()<=arr[i]){      // tab tk khud peek se bada h aur stack khali na ho jae
                  st.pop();
              }
              if (st.size()==0){
                  ans[i]=-1;
              }else {
                  ans[i]=st.peek();
              }
              st.push(arr[i]);      // jate jate push kr dega khud ko
          }
         return ans;
    }
}
