import java.util.Scanner;

public class Rotatematrix {

    static void printmatrix(int matrix[][]){
        for(int i= 0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void tarnsposematrix(int matrix[][], int c ,int r){
        for(int i =0;i<r;i++){
            for(int j =1;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int arr[]){
        int i = 0, j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rootate(int matrix[][],int n){
        tarnsposematrix(matrix ,n ,n);

        for(int i =0;i<n;i++){
            reverseArray(matrix[i]);
        }


    }
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number  of Rows");
        int r = sc.nextInt();
        System.out.println("Enter the number  of Columns");
        int c = sc.nextInt();

        int arr1[][] = new int[r][c];

        System.out.println("Enter the "+r*c+ " elmenets in Array");
        for(int i =0;i< r;i++){
            for(int j =0;j<c; j++ ){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printmatrix(arr1);

        rootate(arr1,r);

        System.out.println("Output Matrix");
        printmatrix(arr1);

        
        
    }
}

