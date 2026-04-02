import java.util.Scanner;
public class Maxnumber {

    static int findMax(int arr[]){
        int max = 0;
        for (int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
    return max;
 }

    static int findsecondMax(int arr[]){
        int max = findMax(arr);
        for (int i =0 ;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
             max = findMax(arr);
        }
        return max;
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of the Array");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        
        }
        System.out.println("Maximum no is "+findsecondMax(arr));
        



        

    }
    
    
}


