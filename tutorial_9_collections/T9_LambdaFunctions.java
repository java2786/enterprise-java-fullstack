import java.util.function.Function;

public class T9_LambdaFunctions {
    public static void greet(String name, Function<String, String> f){
        String m = f.apply(name);

        System.out.println(m);
    }
    
    
    public static void main(String[] args) {
        greet("Ramesh", (n)->{return "Hello "+n;});
        greet("mahesh", (n)->{return "Welcome "+n;});
    }
}
