import java.util.*;
public class generate_spiral_order {
    static void printMatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int[][] spiralOrder(int n){
        int mat[][]=new int[n][n];
        int toprow=0, bottomrow=n-1, leftcol=0, rightcol=n-1;
        int current=1;
        while(current<=n*n){
            for(int j=leftcol;j<=rightcol && current<=n*n;j++){
            mat[toprow][j]=current++;
            }
            toprow++;
            for(int i=toprow;i<=bottomrow && current<=n*n;i++){
            mat[i][rightcol]=current++;
            }
            rightcol--;
            for(int j=rightcol;j>=leftcol && current<=n*n;j--){
            mat[bottomrow][j]=current++;
            }
            bottomrow--;
            for(int i=bottomrow;i>=toprow && current<=n*n;i--){
            mat[i][leftcol]=current++;
            }
            leftcol++;

        }
        return mat;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        int mat[][]=spiralOrder(n);
        printMatrix(mat);
        
    }
    
}

