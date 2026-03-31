import java.util.Set;
import java.util.LinkedHashSet;
public class Prog22 {
    public static void main(String args[]){
        Set<Integer> hash=new LinkedHashSet<>();
        hash.add(12);
        hash.add(13);
        hash.add(22);

        System.out.println("The elemenets in the hashset are: "+hash);

        hash.remove(12);

        System.out.println("The elemenets in the hashset are: "+hash);

        System.out.println("hash.contains(22): "+hash.contains(22));
    }
}
