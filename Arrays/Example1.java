class array{

    void Max_of_Array(){
        int [] arr ={ 10,5,3,2,8,4};

        int ans = 0;
        for (int i =0 ;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i];
                System.out.println(ans);
            }
    }
}
    void Sum_of_Array(){
    int []arr ={1,5,3};
    int sum = 0;
    for(int i =0 ;i<arr.length;i++){
      
      sum +=arr[i];
        
    }
    System.out.println(sum);
    }
}
public class Example1{
    public static void main(String[]args){
        array obj = new array();
        obj.Max_of_Array();
    }
    
}
