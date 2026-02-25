interface A{
    void displayA();
}
interface B{
    void displayB();
}
class Alpha implements A,B{
    public void displayA(){
        System.out.println("A is an alphabet!");
    }
    public void displayB(){
        System.out.println("B is an alphabet!");
    }
}
public class Prog13 {
    public static void main(String args[]){
        Alpha en=new Alpha();
        en.displayA();
        en.displayB();
    }
}
