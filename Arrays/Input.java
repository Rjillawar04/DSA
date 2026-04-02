import java.util.Scanner;
public class Input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n = sc.nextInt();

        int []arr = new int[n];

        System.out.println("Enter " +n+ " Elements");
        for(int i =0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    
}
