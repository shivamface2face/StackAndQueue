package Stack;

public class PreviousGraterElement {
    public static void main(String[] args) {
        int arr[]={15,10,18,12,4,6,2,8};
        next(arr);
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
