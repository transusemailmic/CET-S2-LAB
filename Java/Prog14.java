import Prog14Package.calc;
public class Prog14 {
    public static void main(String args[]){
        int a=100;
        int b=300;
        System.out.println("Sum of "+a+" and "+b+" = "+calc.add(a,b));
        System.out.println("Difference of "+a+" and "+b+" = "+calc.sub(a,b));
        System.out.println("Multiplication of "+a+" and "+b+" = "+calc.mul(a,b));
        System.out.println("Division of "+a+" and "+b+" = "+calc.div(a,b));
    }
}
