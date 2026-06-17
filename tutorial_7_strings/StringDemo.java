public class StringDemo {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        // if(a==b){
        //     System.out.println("a==b");
        // } else{
        //     System.out.println("a!=b");
        // }
        // if(a==c){
        //     System.out.println("a==c");
        // } else{
        //     System.out.println("a!=c");
        // }

        // if(a.equals(b)){
        //     System.out.println("a.equals b");
        // } else{
        //     System.out.println("a!=b");
        // }
        // if(a.equals(c)){
        //     System.out.println("a.equals c");
        // } else{
        //     System.out.println("a!=c");
        // }

        if(a==c.intern()){
            System.out.println("a==c");
        } else{
            System.out.println("a!=c");
        }
    }
}
