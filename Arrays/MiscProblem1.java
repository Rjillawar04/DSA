public class MiscProblem1 {
    static void swap(int a ,int b){
        System.out.println("Values before swap "+a);
        System.out.println("Values before swap "+b);

        int temp = a;
         a = b;
         b= temp;

        System.out.println("Values After swap "+a);
        System.out.println("Values After swap "+b);



    }
    public static void main (String[]args){
        int a =9;
        int b = 3;
 
        swap(a,b);
    }
}
