import java.util.*;
public class spiral_matrix {
    static void printMatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void spiralOrder(int mat[][],int r, int c){
        int toprow=0, bottomrow=r-1, leftcol=0, rightcol=c-1;
        int totalMatrix=0;
        while(totalMatrix<r*c){
            for(int j=leftcol;j<=rightcol;j++){
                System.out.print(mat[toprow][j]+" ");
                totalMatrix++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow;i++){
                System.out.print(mat[i][rightcol]+" ");
                totalMatrix++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol;j--){
                System.out.print(mat[bottomrow][j]+ " ");
                totalMatrix++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow;i--){
                System.out.print(mat[i][leftcol]+" ");
                totalMatrix++;
            }
            leftcol++;

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows ans columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("enter "+r*c+" values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix: ");
        printMatrix(mat);

        System.out.println("the resultant matrix is: ");
        spiralOrder(mat,r,c);
        
    }
    
}
