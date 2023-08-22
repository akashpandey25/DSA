import java.util.*;
public class matrix_add {
    static void addition(int m1[][],int r1, int c1, int m2[][],int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong input!!!!");
        }
        int [][]k=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
               System.out.print( (k[i][j]=m1[i][j]+m2[i][j])+ " ");
            }
            System.out.println();
        }
        // printMatrix(k);
    }
    // static void printMatrix(int mat[][]){
    //     for(int i=0;i<mat.length;i++){
    //         for(int j=0;j<mat.length;j++){
    //             System.out.print(mat[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter r1 ans c1: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int m1[][]=new int[r1][c1];
        System.out.println("enter values of matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter r2 and c2: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int m2[][]=new int[r2][c2];
        System.out.println("enter values of matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
             
        }
        // System.out.println("matrix1: ");
        // printMatrix(m1);
        // System.out.println("matrix2: ");
        // printMatrix(m2);
        System.out.println("resultant matrix is: ");
        addition(m1, r1, c1, m2, r2, c2);
   
    }
    
}