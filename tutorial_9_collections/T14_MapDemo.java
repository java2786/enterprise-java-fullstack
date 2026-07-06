import java.util.HashMap;
import java.util.Map;

class Item{
    String name;
    int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
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
        Item other = (Item) obj;
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

public class T14_MapDemo {
    public static void main(String[] args) {
        Item i1 = new Item("Mobile", 12000);
        Item i2 = new Item("Book", 120);
        Item i3 = new Item("Pencil", 20);
        Item i4 = new Item("Adapter", 200);
        Item i5 = new Item("Printer", 2000);

        // List<Item> items = new ArrayList<>();
        // items.add(i1);
        // items.add(i2);
        // items.add(i3);
        // items.add(i4);
        // items.add(i5);
        // items.add(i3);
        // items.add(i4);

        // Set<Item> set_items = new HashSet<>();
        // set_items.add(i1);
        // set_items.add(i2);
        // set_items.add(i3);
        // set_items.add(i4);
        // set_items.add(i5);
        // set_items.add(i1);
        // set_items.add(i2);
        // set_items.add(i3);

        Map<String, Item> items = new HashMap<>();
        items.put("Mobile", i1);
        items.put("Adapter", i4);
        items.put("Pen", i3);
        items.put("Book", i2);
        items.put("Printer", i5);
        items.put(null, null);
        
        
        System.out.println(items);
        Item i = items.get("Book");
        System.out.println(i);


        for(String key:items.keySet()){
            System.out.println(items.get(key));
        }
        
    }
}
