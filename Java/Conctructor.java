import java.util.Scanner;
class algebra{
    int a ;
    int b ; 
    algebra(int x , int y){
         a =  x;
         b = y;
    }

    int sum(){ 
        return a+b;
    }

    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class Conctructor {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        
        algebra  obj = new algebra(7,8);
        System.out.println(obj.sum());
        System.out.println(obj.mul());
        System.out.println(obj.sub());
    }
}
