import java.util.Stack;
class GStack<T>{
    private Stack<T> stack;
    public GStack(){
        stack=new Stack<T>();
    }
    public void push(T item){
        stack.push(item);
    }
    public T pop(){
        return stack.pop();
    }
    public void display(){
        stack.forEach(item->System.out.print(item+" "));
        System.out.println();
    }
}
public class Prog19 {
    public static void main(String args[]){
        GStack<Integer> stack=new GStack<>();
        stack.push(10);
        stack.display();
        stack.push(20);
        stack.display();
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
    }
}
