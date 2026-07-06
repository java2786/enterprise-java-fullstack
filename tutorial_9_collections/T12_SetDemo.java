import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class T12_SetDemo {
    public static void main(String[] args) {
        // Set<String> set = new LinkedHashSet<>();
        // [mango, grapes, kiwi]

        // Set<String> set = new HashSet<>();
        // [kiwi, mango, grapes]

        Set<String> set = new TreeSet<>();
        // [grapes, kiwi, mango]

        set.add("mango");
        set.add("grapes");
        set.add("mango");
        set.add("kiwi");
        set.add("mango");
        set.add("grapes");

        System.out.println(set.size());
        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        // while(iterator.hasNext()){
        //     String name = iterator.next();
        //     System.out.print(name+", ");
        // }
        // System.out.println();

        for(String name: set){
            System.out.print(name+", ");
        }
        System.out.println();
    }
}
