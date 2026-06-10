import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        int pin = 1234;
        int bal = 5000;
        String name = "ramesh";

        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice!=3) {
            System.out.println("\n======== Welcome To OurATM ========\n");
            System.out.println("1. Enter PIN ");
            System.out.println("2. Forgot PIN ");
            System.out.println("3. Exit ");
            System.out.println();

            // User input
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("You selected to enter pin");
                    break;
                case 2:
                    System.out.println("You selected forgot pin");
                    break;
                case 3:
                    System.out.println("ByeBye");
                    
                default:
                    System.out.println("You selected to something else");
            }
        }
        System.out.println("Closing scanner");
        scanner.close();
    }
}
