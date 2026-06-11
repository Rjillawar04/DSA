public class Bubble{

    static void bubblesort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            boolean flag =  false ;
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    flag =  true ;

                }
                if(flag == false){
                    return ;
                }
            }
        }
    }
    public static void main(String[]args){
        int [] arr  = {2,1,3,4,5} ;
        bubblesort(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}