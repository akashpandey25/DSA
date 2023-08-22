import java.util.*;
public class tranpose_matrix {
    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    // static int[][] TransposeMatrix(int matrix[][], int r, int c){/*
    //     transpose by creating a new matrix */
    //     int ans[][]=new int[c][r];
    //     for(int i=0;i<c;i++){
    //         for(int j=0;j<r;j++){
    //             ans[i][j]=matrix[j][i];
    //         }
    //     }
    //     return ans;
        
    // }
    static void transposeInPlace(int matrix[][], int r, int c){
        /*transpose in place */
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }   

              
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns of matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("enter " + r*c + " elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("print matrix: ");
        printMatrix(matrix);
        System.out.println("resultant matrix: ");
        // int ans[][]=TransposeMatrix(matrix, r, c);
        // printMatrix(ans);
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);
       
    }
    
}
