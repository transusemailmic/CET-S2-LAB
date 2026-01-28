import java.util.Scanner;
public class Prog2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int n=sc.nextInt();
        int matrix1[][]=new int[n][n];
        int matrix2[][]=new int[n][n];
        int matrix3[][]=new int[n][n];
        System.out.println("Enter the elements of the array one by one of matrix 1: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix1[row][col]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the array one by one of matrix 2: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix2[row][col]=sc.nextInt();
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix3[row][col]=matrix1[row][col]+matrix2[row][col];
            }
        }
        System.out.println("Contents of matrix 1: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(matrix1[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Contents of matrix 2: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(matrix2[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Resultant Matrix: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(matrix3[row][col]+" ");
            }
            System.out.println();
        }
    }
}
