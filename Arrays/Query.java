import java.util.Scanner;
public class Query {

    static int[] makeFrequncyArry(int arr[]){
        int frequency [] = new int[100005];

        for(int i =0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        return frequency;
    } 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Arry");
        int n = sc.nextInt();

        

        int arr [] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int frequencyArray[]=makeFrequncyArry(arr);

        System.out.println("Enter the number of Queries");
        int q  =  sc.nextInt();

        while(q>0){
            System.out.println("Enter the searched number");
            int x = sc.nextInt();
            if(frequencyArray[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            q--;
        }

    }
}
