import java.util.Scanner;
public class Rotate {
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static int[] rotateArray(int arr[],int k){
        int n =arr.length;
        k = k%n;
    
        int j =0;
        int ans []=new int[n];
        for(int i =n-k;i<n;i++){
            ans[j++]=arr[i];
        }

        for(int i =0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans ;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();

       int result[]= rotateArray(arr,k);

        printArray(result);
    }
}
