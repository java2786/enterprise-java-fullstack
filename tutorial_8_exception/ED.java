class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int div(int a, int b){
        try{
            return a/b;
        } catch(ArithmeticException e){
            System.out.println("Can not divide by zero");
            return 0;
        }
    }
}
public class ED {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(4,5));
        System.out.println(calc.div(0,8));
        System.out.println(calc.div(24,0));
        System.out.println(calc.div(24,8));
    }
}
