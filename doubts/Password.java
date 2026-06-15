import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count= 3;
        String pwd= "Ishaan";
        while(count!=0){
            System.out.println("Enter your password");
            String temp= scanner.nextLine();

            if (pwd.equals(temp)){
                System.out.println("Correct password");
                break;
            }
            else{
                count=count-1;
                System.out.println("Invalid password, "+count+" Attempts remaining");
            }
        }
        scanner.close();
    }
}
