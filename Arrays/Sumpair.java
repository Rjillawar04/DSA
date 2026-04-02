import java.util.Scanner;

public class Sumpair{

    static int targetedSum(int arr[],int target){
        int n = arr.length;
        int ans  = 0;

        for (int i =0;i<n;i++){
            for (int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans ;
    }

    static void printArray(int []arr){
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Elements of Array");
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr);

        System.out.println("Enter the Target variabble");
        int target =sc.nextInt();
        System.out.println(targetedSum(arr,target));


        
    }
}