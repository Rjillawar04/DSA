import  java.util.Scanner;
public class GenerateSpiral {

    static void printmatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int [][] Generatespiralmatrix(int n){
        int matrix[][] = new int[n][n];
        int toprow =0 ,bottomrow = n-1 , leftcolumn = 0 , rightcolumn =n-1;
        int value = 1;

        while(value<=n*n){
        for(int j = leftcolumn;j<=rightcolumn;j++ ){
            matrix[toprow][j] = value;
            value++;
        }
        toprow++;

        for(int i = toprow;i<=bottomrow;i++){
            matrix[i][rightcolumn]=value;
            value++;
        }
        rightcolumn--;

        for(int j = rightcolumn;j>=leftcolumn;j--){
            matrix[bottomrow][j]= value;
            value++;
        }
        bottomrow--;

        for(int i = bottomrow;i>=toprow;i--){
            matrix[i][leftcolumn]=value;
            value++;
        }
        leftcolumn++;
    }
    return matrix;
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the no of integer ");
        int n = sc.nextInt();

         int [][]result = Generatespiralmatrix(n);

         printmatrix(result);
    }
}
