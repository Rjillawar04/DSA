 import java.util.Scanner;
 public class Factorial{

    static int factorial(int n){
        if(n==0){
            return 1;
        }

        int subproblem=factorial(n-1);
        int ans = n*subproblem;
        

        return ans ;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of the X");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
 }