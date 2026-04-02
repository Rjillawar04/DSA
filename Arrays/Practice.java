class Arithmatic{
    void SumofArray(){
      int []arr = {1,5,7,8};
      int sum = 0;
      for(int i = 0; i < arr.length;i++){
        sum = sum+arr[i];}  
      System.out.println(sum);
      int [][] arr1 = {{1,2},{2,3}};
    System.out.println(arr1[1][1]);
    }
    
    
}
public class Practice {
    public static void main(String[]args){
        Arithmatic obj = new Arithmatic();
        obj.SumofArray();
    }
}
