import java.util.Scanner;
public class Power1{
    static int power(int p,int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int smallpow = power(p,q/2);
            return smallpow * smallpow;
        }else{
            int smallpow= power(p,q/2);
            return smallpow * smallpow * p;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the P");
        int p = sc.nextInt();
        System.out.println("Enter the Q");
        int q = sc.nextInt();

        System.out.println(power(p,q));
    }
}