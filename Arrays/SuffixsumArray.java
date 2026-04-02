import java.util.Scanner;
public class SuffixsumArray {

    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] makesuffixArray(int arr[]){
        int n = arr.length;
        int suf[] = new int[n];

        suf[n-1]=arr[n-1];
        for(int i =n-2;i>=0;i--){
            suf[i]=arr[i]+suf[i+1];
        }
        return suf;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] result = makesuffixArray(arr);
        printArray(result);
    }
}
