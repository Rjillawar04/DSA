import java.util.Scanner;
public class PrefixSum {

    static void printmatrix(int [][]matrix){
        for(int i= 0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    static void prefixsummatrix(int [][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0;i<r;i++){
            for(int j =1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        for(int j =0;j<c;j++){
            for(int i =1;i<r;i++){
                matrix[i][j] +=matrix[i-1][j];
            }
        }
    }

    static int findsum(int[][]matrix,int l1,int r1,int l2,int r2){
        int ans = 0;
        prefixsummatrix(matrix);
        int sum =0;int up =0 ,left =0 ,leftup = 0 ;

        sum = matrix[l2][r2];
        if(r1>0){
            left = matrix[l2][r1-1];
        }
        if(l1>0){
            up = matrix[l1-1][r2];
        }
        if(l1>0 && r1>0){
        leftup= matrix[l1-1][r1-1];
        }

        ans = sum - up -left +leftup;
        return ans;
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Rows of Matrix");
        int r = sc.nextInt();
        System.out.println("Enter the columns of Matrix");
        int c = sc.nextInt();

        

        int matrix[][] = new int[r][c];

        System.out.println("Enter the "+r*c+" Elents of matrix");
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum is "+findsum(matrix,l1,r1,l2,r2));

    }
}
