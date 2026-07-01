import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Friend{
    String name;
    int age;
    Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String showDetails(){
        return "Name: "+name+", Age: "+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
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
        Friend other = (Friend) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

    // public boolean equals(Object obj) {
    //     if(obj == null){
    //         return false;
    //     }
    //     if(obj == this){
    //         return true;
    //     }

    //     if(!(obj instanceof Friend)){
    //         return false;
    //     }
    //     Friend f = (Friend)obj;
        
    //     if(this.name.equals(f.name) && this.age==f.age){
    //         return true;
    //     }
    //     return false;
    // }

    // public String toString() {
    //     // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    //     return "Firend[Name: "+name+", Age: "+age+"]";
    // }
    

}

public class T6_FriendList{
    public static void main3(String[] args) {
        Friend f1 = new Friend("Himesh",35);
        Friend f2 = f1;
        Friend f3 = new Friend("Himesh",35);

        System.out.println("F1: "+f1);
        System.out.println("F2: "+f2);
        System.out.println("F3: "+f3);
        // System.out.println(f1 == f2);
        // System.out.println(f1 == f3);

        System.out.println(f1.equals(f3));
    }
    public static void main(String[] args) {
        // List<String> names = new ArrayList<>();
        // names.add("Ramesh");
        // names.add("Suresh");
        // names.add("Dinesh");
        // names.add("Ramesh");

        List<Friend> names = new ArrayList<>();
        names.add(new Friend("Ramesh", 43));
        names.add(new Friend("Suresh", 38));
        names.add(new Friend("Dinesh", 37));
        names.add(new Friend("Ramesh", 41));

        System.out.println("First name: "+names.get(0));

        System.out.println("Check Dinesh: "+names.indexOf(new Friend("Dinesh", 37)));
        System.out.println("If Dinesh added: "+names.contains(new Friend("Dinesh", 37)));

        Collections.sort(names, (f1, f2)->f1.getName().compareTo(f2.getName()));

        System.out.println(names);
    }
}