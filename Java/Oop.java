class Student{
    int Roll_no;
    String Name;
    int Age;
}
public class Oop {
    public static void main(String[]args){
    Student obj1 = new Student();
    obj1.Name = "Rohan";
    obj1.Roll_no =2;
    System.out.println(obj1.Name);
    System.out.println(obj1.Roll_no);

    Student obj2 = new Student();
    obj2.Roll_no = 3;
    obj2.Name = "Rahul";

    System.out.println(obj2.Name);
    System.out.println(obj2.Roll_no);
}
}