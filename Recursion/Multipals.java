import java.util.Scanner;
public class Multipals {

    static void printmultipal(int n ,int k){
        if(k==1){
            System.out.println(n);
            return ;
        }

        printmultipal(n ,k-1);
        System.out.println(n*k);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  N");
        int n = sc.nextInt();
        System.out.println("Enter the k");
        int k = sc.nextInt();

        printmultipal(n, k);
    }
}
