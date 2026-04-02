import java.util.Scanner;
public class MiscProblem2 {

    static int reverseArray(int[]arr){
        int n =arr.length;
        int j =0;
        int ans[] = new int[n];
        for(int i =arr.length;i>=0;i--){
            arr[j]=arr[i];
            j++;
        }
        return ans;
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int [] ans = reverseArray(arr);
        for(int i =0;i<ans.length;i++){
            System.out.println(arr[i]);
        }
    }
}
