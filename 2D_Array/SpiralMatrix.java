import java.util.Scanner;
public class SpiralMatrix {
    static void printmatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
        }
    }

    static void matrixspiral(int matrix[][],int r ,int c){
        int toprow = 0, bottomrow =  r-1, leftcolumn = 0,rightcolumn = c-1;
        int totalelements = 0;

        while(totalelements<r*c){
            // for printing the top row
            for(int j = leftcolumn;j<=rightcolumn && totalelements<r*c;j++){
                System.out.print(matrix[toprow][j] +" ");
                totalelements++;
            }
            toprow++;

            for(int i = toprow;i<=bottomrow && totalelements<r*c;i++){
                System.out.print(matrix[i][rightcolumn] + " ");
                totalelements++;
            }
            rightcolumn--;

            for(int j = rightcolumn;j>=leftcolumn && totalelements<r*c;j--){
                System.out.print(matrix[bottomrow][j]+ " ");
                totalelements++;
            }
            bottomrow--;

            for(int i = bottomrow;i>=toprow && totalelements<r*c;i--){
                System.out.print(matrix[i][leftcolumn]+ " ");
                totalelements++;
            }
            leftcolumn++;
        }

        

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the matrix");
        int r = sc.nextInt();
        System.out.println("Enter the columns of the matrix ");
        int c = sc .nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter the "+c*r+" Elementsof matrix");
        for(int i= 0;i<matrix.length;i++){
            for(int j= 0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        matrixspiral(matrix,r,c);
        
        
    }
}
