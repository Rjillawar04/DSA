public class Squareroot {

    static int squareroot(int x){
        int start =0, end=x;
         
        int ans =-1;
    while(start<=end){
    int mid = start + (end-start)/2;
        int val = mid*mid;
        if(val==x){
            return mid;
        }else if(val>x){
            
            end = mid-1;
        }else{
           start= mid+1;
           ans=mid;
        }
       
    }
     return ans;
}
    public static void main(String[]args){
        int x = 24;
        System.out.println(squareroot(x));
    }
}
