import java.util.*;
public class rotate_ninty_degree_a_array_clockwise {
    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void tranpose_matrix(int matrix[][],int r, int c){
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }
    static void reverse(int arr[]){
        int i=0; int j=arr.length-1;
        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotate(int matrix[][],int r,int c){
        tranpose_matrix(matrix, r,c);
        for(int i=0;i<r;i++){
            reverse(matrix[i]);
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
        System.out.println(" matrix is: ");
        printMatrix(matrix);
        rotate(matrix, r,c);
        System.out.println("reversed matrix ix: ");
        
     
        printMatrix(matrix);
    }
    
}
