public class Binarysearch{

    static boolean binarysearch(int arr[], int target){
        int n = arr.length;
        int start =0 ,end = n-1;
        

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[]args){
        int [] arr = {1,2,4,6,7};
        int target = 3;
        binarysearch(arr,target);
        System.out.println(binarysearch(arr,target));
    }
}  