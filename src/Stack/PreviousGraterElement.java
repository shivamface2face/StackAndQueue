package Stack;

import java.util.Stack;

public class PreviousGraterElement {
    public static void main(String[] args) {
        int arr[]={15,10,18,12,4,6,2,8};
//        next(arr);
        nextStack(arr);
    }

      static void nextStack(int[] arr) {

          Stack<Integer>st=new Stack<>();
          st.push(arr[0]);
          System.out.println(-1+" ");

          for (int i = 1; i < arr.length ; i++) {

             while (st.empty()==false && arr[i]> st.peek()) {
                 st.pop();
             }

                 int ans=(st.empty())?-1:st.peek();
                 System.out.println(ans);
                st.push(arr[i]);


          }


    }

    static void next(int[] arr) {
             for (int i = 0; i < arr.length; i++) {
                 int j;
                 for (j = i-1; j >=0 ; j--) {
                     if (arr[j]>arr[i]){
                         System.out.println(arr[j]);
                         break;
                     }
                 }
                 if (j==-1){
                     System.out.println("-1");
                 }
             }
    }
}
