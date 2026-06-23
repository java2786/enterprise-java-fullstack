public class Demo2 {

    static void methodA() throws InterruptedException {
        methodB();
    }

    static void methodB() throws InterruptedException {
        methodC();
    }

    static void methodC() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            // Thread.sleep(1000);
            throw new InterruptedException();
        }
    }

    public static void main(String[] args)  {
        try{
        methodA();
        } catch(InterruptedException ie){
            System.out.println("something unexpected");
        }
    }
}
