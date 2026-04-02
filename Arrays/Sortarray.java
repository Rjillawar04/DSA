
import java.util.Scanner;
public class Sortarray {
    static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;

    }

    // static void sortzerosandones(int arr[]){
    //     int countzeros = 0;
    //     int n = arr.length;

    //     for(int i =0; i<n ;i++){
    //         if(arr[i]==0){
    //             countzeros++;
    //         }
    //     }

    //     for(int i =0;i<n;i++){
    //         if(i<countzeros){
    //             arr[i] =0;
    //         }else{
    //             arr[i] =1;
    //         }
    //     }
    // }

    // static void sortzerosandones(int arr[]){
    //     int n = arr.length;
    //     int left = 0,right = n-1;

    //     while(left<right){

    //         if(arr[left]==1 && arr[right]==0){
    //             swap(arr,left,right);
    //             left++;
    //             right--;
    //         }
            
    //         if(arr[left]==0){
    //             left++;
    //         }


    //         if(arr[right]==1){
    //             right--;
    //         }

            
    //     }
    // }

    // static void sortArrayByParity(int arr[]){
    //     int n = arr.length;
    //     int left = 0;int right = n-1;

    //     while(left<right){
    //         if(arr[left]%2==1 && arr[right]%2 ==0){
    //             swap(arr,left,right);
    //         }

    //         if(arr[left]%2==0){
    //             left++;
    //         }

    //         if(arr[right]%2==1){
    //             right--;
    //         }
    //     }
    // }

    static void reverse(int arr[]){
        int i =0,j=arr.length-1;
        while( i<j){
            swap(arr,i,j);
            
             

            i++;
            j--;
        }
    }

    static int[] sortSquares(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        int k = 0;
        int ans[] = new int [n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the "+n+ " Elements");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int result[] = sortSquares(arr);
       
        System.out.println("Sorted Array");
        printArray(result);
        reverse(result);
        printArray(result);
    }
}
