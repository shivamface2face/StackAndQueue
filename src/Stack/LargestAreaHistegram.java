package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistegram {
    public static void main(String[] args) {

        int arr[]={6,2,5,4,5,1,6};
     int ans=largest(arr);
        System.out.println(ans);
    }

         static int largest(int[] arr) {
        int rb[]=new int[arr.length];

             Stack<Integer> st=new Stack<>();
             st.push(arr[arr.length-1]);
             rb[rb.length-1]= arr.length;
             for (int i = arr.length-2; i >=0 ; i--) {
                 while (st.size()>0 && arr[st.peek()]>=arr[i]){      // tab tk khud peek se bada h aur stack khali na ho jae
                     st.pop();
                 }
                 if (st.size()==0){
                     rb[i]=arr.length;
                 }else {
                     rb[i]=st.peek();
                 }
                 st.push(i);      // jate jate push kr dega khud ko
             }



        int lb[]=new int[arr.length];
        st=new Stack<>();
        st.push(0);
        lb[0]=-1;
             for (int i = 1; i <arr.length ; i++) {
                  while (st.size()>0 && arr[st.peek()]>=arr[i]){
                      st.pop();
                  }
                  if (st.size()==0){
                      lb[i]=-1;
                  }else {
                      lb[i]=st.peek();
                  }
                  st.push(i);
             }




        int maxArea=0;
             for (int i = 0; i <arr.length ; i++) {
                 int width=rb[i]-lb[i]-1;
                 int area=arr[i]*width;
                 if (area>maxArea){
                     maxArea=area;
                 }
             }
             return  maxArea;
    }


}
