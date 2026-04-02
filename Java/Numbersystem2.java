// Conversion of Decimal to Binary
import java.util.Scanner;
public class Numbersystem2 {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans  = 0;
        int power = 1  ;

        while(decimal_num>0){
            int unit_digit = decimal_num % 2;
            ans += unit_digit*power;
            decimal_num/=2;
            power*=10;
        }
        System.out.println(ans);
    }
}
