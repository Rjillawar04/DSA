import java.util.Scanner;
public class Sumof2d {

    static void printmatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
             System.out.println();
        }
        
    }

    static void sum(int arr1[][],int c1,int r1,int arr2[][],int r2,int c2){
        if (r1!=r2 || c1!=c2){
            System.out.println("Invalid input Addition not possible");
            return ;
        }

         int sum[][]=new int [r1][c1];

         for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
            }
         }
    printmatrix(sum);
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number  of Rows");
        int r1 = sc.nextInt();
        System.out.println("Enter the number  of Columns");
        int c1 = sc.nextInt();

        int arr1[][] = new int[r1][c1];

        System.out.println("Enter the"+r1*c1+ "elmenets in Array");
        for(int i =0;i< r1;i++){
            for(int j =0;j<c1; j++ ){
                arr1[i][j]= sc.nextInt();
            }
        }

         
        System.out.println("Enter the number  of Rows");
        int r2 = sc.nextInt();
        System.out.println("Enter the number  of Columns");
        int c2 = sc.nextInt();

        int arr2[][] = new int[r1][c1];

        System.out.println("Enter the"+r2*c2+ "elmenets in Array");
        for(int i =0;i< r1;i++){
            for(int j =0;j<c1; j++ ){
                arr2[i][j]= sc.nextInt();
            }
        }
        sum(arr1,r1,c1,arr2,r2,c2);
    }
}
