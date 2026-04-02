import java .util .Scanner;
class algebra{
    public int sum(int a,int b){
    int ans =  a + b ;
    return ans ; 
}

}

public class Methods{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the first number");
        int y = sc.nextInt();

        algebra obj = new algebra();
        int ans =obj.sum(x,y);
        System.out.println(ans);
    }
}