import java.util.Scanner;
public class NoofCounts {

    static int counts(int n){
        if(n>=0 && n<=9){
            return 1;
        }

        return  1 +counts(n/10);


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        System.out.println(counts(n));
    }
}
