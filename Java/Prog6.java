import java.util.Scanner;
public class Prog6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the item to search: ");
        int item=sc.nextInt();
        int index=-1;
        int flag=0;
        for(int i:arr){
            index++;
            if(item==i){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element Found at Index "+index);
        }
        else{
            System.out.println("Element not found!");
        }
    }    
}
