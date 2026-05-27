import java.util.Scanner;
public class Seriessum {

    static int seriessum(int n ){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return seriessum(n-1)-n;
        }else{
            return seriessum(n-1)+n;
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();

        System.out.println(seriessum(n));
    }
}
