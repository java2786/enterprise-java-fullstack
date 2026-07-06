import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Fruit{
    String name;
    int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Fruit [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fruit other = (Fruit) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    } 
       
}


public class T13_SetDemo {
    public static void main(String[] args) {
        Set<Fruit> set = new TreeSet<>((f1, f2)->{return f1.price - f2.price;});

        set.add(new Fruit("blueberry", 1200));
        set.add(new Fruit("watermelon", 30));
        set.add(new Fruit("mango", 150));
        set.add(new Fruit("mango", 150));
        set.add(new Fruit("grape", 100));

        System.out.println(set.size());
        System.out.println(set);

        for (Fruit f : set){
            System.out.println(f);
        }

    }
}
