class Array{
    static void printArray(int []arr){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void changeArray(int []arr){
        for(int i = 0;i<arr.length;i++){
            arr[i]=0;

        }
        System.out.println();
    }
}

public class clone{
    public static void main(String[]args){
        int[] arr = {1,2,3,4};
        Array.printArray(arr);

        int []arr2 = arr.clone();
        Array.printArray(arr2);

        Array.changeArray(arr2);
        Array.printArray(arr2);  
        Array.printArray(arr);


    
    }
}