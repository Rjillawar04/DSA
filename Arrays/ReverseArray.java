public class ReverseArray {

    // static int[] reverse(int []arr){
    //     int n = arr.length;
    //     int ans[] = new int[n] ;
    //     int j =0;
    //     for(int i = n-1;i>=0;i--){
    //         ans[j++] = arr[i];
            
    //     }
    // return ans;
    // }
    static void swapArray(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int []arr){
        int i = 0,  j = arr.length-1;

        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[]args){
        int arr [] ={1,2,3,4,5,6};
        reverse(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        } 
    
        
    
    }
} 
