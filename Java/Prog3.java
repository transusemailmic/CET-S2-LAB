import java.util.Scanner;
public class Prog3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complex Number 1: ");
        System.out.print("Real Part: ");
        int r1=sc.nextInt();
        System.out.print("Imaginary Part: ");
        int i1=sc.nextInt();
        System.out.println("Enter Complex Number 2: ");
        System.out.print("Real Part: ");
        int r2=sc.nextInt();
        System.out.print("Imaginary Part: ");
        int i2=sc.nextInt();
        //Addition
        int r3=r1+r2;
        int i3=i1+i2;
        System.out.println("Complex Number 1: "+r1+"+"+i1+"i");
        System.out.println("Complex Number 2: "+r2+"+"+i2+"i");
        System.out.println("Sum: "+r3+"+"+i3+"i");
    }
}
