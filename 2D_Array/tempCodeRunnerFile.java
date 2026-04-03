 import java.util.Scanner;
public class  Transposeinplacematrix{
    static void printmatrix(int arr[][]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void inplacetarnspose(int arr[][],int r,int c){
        for(int i =0;i<c;i++){
            for(int j = 0;j<r;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
    }

    

        
    
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number  of Rows");
        int r = sc.nextInt();
        System.out.println("Enter the number  of Columns");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];

        System.out.println("Enter the"+r*c+ "elmenets in Array");
        for(int i =0;i< r;i++){
            for(int j =0;j<c; j++ ){
                arr1[i][j]= sc.nextInt();
            }
        }

        inplacetarnspose(arr1,r,c);
         printmatrix(arr1);
        
    }
}