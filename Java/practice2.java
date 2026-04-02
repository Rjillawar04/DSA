public class practice2 {

    // static int repeatednum(int arr[]){
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j= i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 return arr[i];
                 
    //             }
    //         }
    //     }
    //     return -1;
    // }
    

    static void swap(int a, int b){
        System.out.println("A value of a  before swap "+a);
        System.out.println("A value of b bore swap "+b);
        int temp =a ;
        a = b;
        b = temp;
        System.out.println("A vlue of a after swap "+a);
        System.out.println("The value after swap of b "+b);


    }
    public static void main(String[]args){
        int a  = 9;
        int b = 5;
        
        swap(a,b);
        
        

    }
}


