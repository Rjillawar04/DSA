class ExampleArray{

    void mulArray(){
        int[][] arr = new int[2][2];
        arr[0][0] = 5;
        arr[1][1] = 7;

        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println("The length of Array is");
        System.out.println(arr.length);
    }
    void demoArray(){
        int [] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[3]=3;

        String[] arr = {"Ram","Shyam","RAj"};
       

        for (int i = 0 ;i<3;i++){
            System.out.println(arr[i]);
        }
        

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[3]);
    }
}

public class Array{
    public static void main(String[]args){
        ExampleArray obj1 = new ExampleArray();
        obj1.demoArray();

    }
}