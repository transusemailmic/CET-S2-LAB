import java.util.Scanner;
public class Prog4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Enter the elements of the array one by one of matrix: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int flag=0;
        outer:
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]!=matrix[col][row]){
                    flag=1;
                    break outer;
                }
            }
        }
        System.out.println("Entered Matrix: ");
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        if(flag==1){
            System.out.println("The Entered matrix is not symmetric");
        }
        else{
            System.out.println("The Entered matrix is symmetric");
        }
    }
}
