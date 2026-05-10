import java.util.Scanner;
public class SumofDigit {

    static int sod(int n){
        // Base case 
        if (n>=0 && n<=0){
            return n;
        }

        //recursive work
        // int smallans = sod(n/10);
        // int ans = smallans + n%10;
        // return ans ;

        return sod(n/10)+(n%10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int n = sc.nextInt();

        System.out.println(sod(n));
        
    }
}
