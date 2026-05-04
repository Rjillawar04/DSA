import java.util.Scanner;
public class Recursion {

    static void printincreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        printincreasing(n-1);
        System.out.println(n);
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = sc.nextInt();

        printincreasing(n);
    }
}
