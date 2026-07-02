import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Item{
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
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
public class T10_LambdaSorting {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Pen", 20));
        items.add(new Item("Pencil", 25));
        items.add(new Item("Eraser", 15));
        items.add(new Item("Sharpner", 10));
        items.add(new Item("Eraser", 20));


        

        Collections.sort(items, (i1, i2)-> i1.getPrice()-i2.getPrice());

        System.out.println(items);

        System.out.println(items.contains(new Item("Eraser", 15)));

    }
}
