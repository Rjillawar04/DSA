import java.util.Scanner;
public class Equalpartition {
    static void printArray(int arr[]){
        for(int i =1;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int totalsum(int arr[]){
        int totalsum =0;
        for(int i =0;i<arr.length;i++){
            totalsum +=arr[i];
        }
        return totalsum;
    }
    static boolean equalpartition(int arr[]){
       int  totalsum = totalsum(arr);

       int prefsum=0;
       for(int i =0;i<arr.length;i++){
        prefsum += arr[i];
        int sufsum =totalsum-prefsum;

        if(prefsum==sufsum){
            return true;
        }
       }
       return false;
    }
    
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n  = sc.nextInt();

        int arr[] =new int [n];
        System.out.println("Enter the "+n+" Elements ");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean result = equalpartition(arr);
        System.out.println("Equal partition  "+result);
    }
}
