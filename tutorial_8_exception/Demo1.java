public class Demo1 {
    static int a = 0;
    static void greet(String name){
      System.out.println(++a + ". Welcome "+name);
        greet(name);
    }
    public static void main(String[] args) {
        greet("Suresh");
    }
}
