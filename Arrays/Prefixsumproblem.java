import java.util.Scanner;
public class Prefixsumproblem {

    static int[] prefixsumArray(int arr[]){
        int n = arr.length;
        int pref[]=new int[n];
        arr[1]=arr[1];

        for(int i =1 ;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }

    static void printArray(int arr[]){
        for(int i =1;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n  = sc.nextInt();

        int arr[] =new int [n+1];
        System.out.println("Enter the "+n+" Elements ");
        for(int i = 1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int []prefsum = prefixsumArray(arr);

        System.out.println("Enter the number of queris");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("Enter the range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefsum[r] - prefsum[l-1];

            System.out.println("Sum  "+ans);
        }
        // int result[]=prefixsumArray(arr);
        // printArray(result);
    }
    
}
