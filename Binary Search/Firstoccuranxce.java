public class Firstoccuranxce {
    static int firstocuurance(int arr[],int x){
        int n = arr.length;
        int start = 0,end = n-1;
        int  foc =-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==x){
                foc=mid;
                end = mid-1;
            }else if(arr[mid]>x){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return foc;
    }
    public static void main(String[]args){
        int arr[] = {5,5,5,5,6,4};
        int x =5;
        System.out.println(firstocuurance(arr,x));
    }
}
