import java.util.Scanner;
public class Fibonacci {

    static int fibonacci(int n){

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }
        int previousterm1 = fibonacci(n-1);
        int previousterm2 = fibonacci(n-2);

        int ans = previousterm1+previousterm2;
        return ans ;
    }
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of X");
    int n = sc.nextInt();
    for(int i =0;i<n;i++){
    System.out.println(fibonacci(i));
    }
   } 
}
