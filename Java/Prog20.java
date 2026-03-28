import java.util.ArrayList;
public class Prog20{
    public static void main(String main[]){
        ArrayList<String> strings=new ArrayList<>();
        strings.add("Apple");
        strings.add("Mango");
        strings.add("Guava");

        System.out.println(strings);

        System.out.println("Item at index 1 is: "+strings.get(1));

        strings.set(1,"Grapes");

        System.out.println(strings);

        System.out.println("Size of ArrayList is: "+strings.size());

        strings.remove(2);

        System.out.println(strings);

        strings.clear();

        System.out.println(strings);
    }
}