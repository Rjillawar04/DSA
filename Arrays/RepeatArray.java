import java.util.Scanner;
public class RepeatArray {

    static int  repeatednim(int arr[]){
        int ans =0;
        for (int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) {
                    ans = arr[i];
                    return ans;
                }
            }
        }
       return -1; 
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc .nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the Array");
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The repeated number is "+repeatednim(arr));

    }
    
}
