class NegativeException extends Exception{
    public NegativeException(String message){
        super(message);
    }
}
class Number{
    void checkNumber(int num) throws NegativeException{
        if(num<0){
            throw new NegativeException("Negative Number not allowed");
        }
        else{
            System.out.println("Valid Number");
        }
    }
}
public class prog16 {
    public static void main(String args[]){
        int num=-13;
        try{
            Number n=new Number();
            n.checkNumber(num);
        }
        catch(NegativeException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
    }
}
