import java.util.Scanner;
public class practice{

    static int  fact(int n){
        if (n==1 || n==1){
            return 1;
        }
        int ans = fact(n-1);
        return n *ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the X");
        int n = sc.nextInt();
        fact(n);
        System.out.println(n*fact(n-1));
    }
}