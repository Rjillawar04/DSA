import java.util.Scanner;
public class Count {

    static int lastoccurance(int arr[],int x){
        int lastindex = -1;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex = i;
            }
        }
        return lastindex;
    }

    static int counts(int []arr,int x){
        int count =0;
        
        for(int i =0;i<arr.length;i++){
            if(x == arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter"+n+"Elements of Array");
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x ");
        int x = sc.nextInt();
        // System.out.println("Count is:"+counts(arr,x));
        System.out.println("Lastoccurance is :"+lastoccurance(arr,x));

    }

}
