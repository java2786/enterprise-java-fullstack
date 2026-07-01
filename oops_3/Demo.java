class Bike{
    Bike(){
        this(50000);
    }
    Bike(int p){
        System.out.println(p);
    }
}

enum Toss{
    Head, Tail
}

public class Demo {
    public static void main(String[] args) {
        // new Bike();
        Toss toss = Toss.Head;

        if(toss == Toss.Tail){
            System.out.println("this is tail");
        } else {
            System.out.println("this is head");
        }
        System.out.println(toss.toString());
    }
}
