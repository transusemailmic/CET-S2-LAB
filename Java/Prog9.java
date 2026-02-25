import java.util.Arrays;
import java.util.Collections;
public class Prog9 {
    public static void main(String args[]){
        String arr[] ={"Apple","Orange","Banana","Grapes","Guava","Jackfruit","Dragonfruit","Litchi","Lemon","Watermelon"};
        Arrays.sort(arr);
        System.out.println("Sorted in Ascending order: ");
        for(String item:arr){
            System.out.println(item);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Sorted in Descending order: ");
        for(String item:arr){
            System.out.println(item);
        }
    }
}
