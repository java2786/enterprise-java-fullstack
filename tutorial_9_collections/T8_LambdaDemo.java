@FunctionalInterface
interface GreetActivity{
    public String greet(String name);
    public String toString();
}

class Greeting implements GreetActivity{
    public String greet(String name){
        return "Welcome "+name;
    }
    public String toString(){ return "DumDumDigaDiga";}
}

public class T8_LambdaDemo {

    public static void myGreetUser(String name, GreetActivity g){
        String msg = g.greet(name);

        System.out.println(msg);
    }
    public static void main(String[] args) {
        GreetActivity g = new Greeting();
        myGreetUser("ramesh", g);

        GreetActivity g2 = new GreetActivity() {
            public String greet(String name){
                return "Hola "+name;
            }
        };
        myGreetUser("Suresh", g2);

        GreetActivity g3 = (String name)->{
                return "Vango "+name;
            }
        ;
        myGreetUser("Suresh", g3);

        myGreetUser("Suresh", (name)->{
                return "Swagatam "+name;
            });
        myGreetUser("Mukesh", (name)->{
                return "Swagat Hai! "+name.toUpperCase();
            });

        

            Greeting abc = new Greeting();
            System.out.println(abc);
            System.out.println(abc.toString());
    }
}


