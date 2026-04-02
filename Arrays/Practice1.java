import java.util.Scanner;
public class Practice1 {
    static int sumPair(int[]arr,int target){
        int ans =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the Array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target Element");
        int target = sc.nextInt();

        System.out.println("There are "+sumPair(arr,target)+"pairs in array");

    }
}
