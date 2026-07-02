class Product{
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
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
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
    // public boolean equals(Object o){ return ???}
}
public class T11_EqualsDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Pencil", 5);
        Product p2 = new Product("Pencil", 5);

        System.out.println("p1==p2 => "+(p1==p2));
        System.out.println("p1.equals(p2) => "+p1.equals(p2));

    }
}
