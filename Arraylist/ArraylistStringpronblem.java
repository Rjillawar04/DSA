import java.util.ArrayList;
import java.util.Collections;
public class ArraylistStringpronblem {
   public static void main(String[]args){
    ArrayList<String> list = new ArrayList<>();
    list.add("Welcome");
    list.add("To");
    list.add("Coading");
    list.add("World");

    System.out.println("Original Arraylist"+list);
    Collections.sort(list );
    System.out.println("Sorted List "+list);
   } 
}
