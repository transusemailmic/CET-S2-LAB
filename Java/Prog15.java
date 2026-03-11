class WeakException extends Exception{
    public WeakException(String message){
        super(message);
    }
}
class UserAuth{
    void checkPassword(String password) throws WeakException{
        if (password.length()<6){
            throw new WeakException("password is weak");
        }
        else{
            System.out.println("Password is Strong");
        }
    }
}
public class Prog15 {
    public static void main(String args[]){
        String password="abc";
        try{
            UserAuth auth=new UserAuth();
            auth.checkPassword(password);
        }
        catch(WeakException e){
            System.out.println("Exception Caught: "+e.getMessage());
        }
    }
}
