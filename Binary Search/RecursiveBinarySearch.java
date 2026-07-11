public class RecursiveBinarySearch {

    static boolean recursivebinarysearch(int arr[],int start,int end,int target){
        if(start>end) return false;
        int mid = (start+end)/2;
        if(arr[mid]==target){
            return true;
        }else if(arr[mid]>target){
            return recursivebinarysearch(arr,start,mid-1,target);
        }else{
            return recursivebinarysearch(arr,mid+1,end,target);
        }
    }
    public static void main(String[]args){
        int arr[] = {1,2,4,5,8,9};
        int target =3 ;
        boolean result =recursivebinarysearch(arr,0,arr.length -1,target);
        System.out.println(result);
    }
}
