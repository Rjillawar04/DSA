import java.util.Scanner;
public class Power {

    static int power(int p ,int q){
        if (q == 0){
            return 1 ;
        }

        int smallans = power(p,q-1);

        return smallans *p; 
    }
   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the p");
    int p = sc.nextInt();
    System.out.println("Enetr the Q");
    int q = sc.nextInt();
    System.out.println(power(p,q));
   } 
}
