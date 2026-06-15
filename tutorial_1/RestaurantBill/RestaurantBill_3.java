package RestaurantBill;

import java.util.Scanner;

public class RestaurantBill_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item1_name = "Samosa";
        int item1_price = 15;
        int item1_qty = 0;
        int item1_bill = 0;

        String item2_name = "Burger";
        int item2_price = 45;
        int item2_qty = 0;
        int item2_bill = 0;

        String item3_name = "Tea...";
        int item3_price = 10;
        int item3_qty = 0;
        int item3_bill = 0;

        System.out.println();
        System.out.println("======= Welcome to my shop =======");
        System.out.println("============ Our Menu ============");
        System.out.println();
        System.out.println("1. "+item1_name+"\t- Rs "+item1_price);
        System.out.println("2. "+item2_name+"\t- Rs "+item2_price);
        System.out.println("3. "+item3_name+"\t- Rs "+item3_price);
        System.out.println();
        System.out.print("Enter "+item1_name+" quantity: ");
        item1_qty = scanner.nextInt();
        if(item1_qty<0 || item1_qty>10){
            System.out.println("Invalid quantity");
            item1_qty = 0;
        }
        System.out.print("Enter "+item2_name+" quantity: ");
        item2_qty = scanner.nextInt();
        if(item2_qty<0 || item2_qty>10){
            System.out.println("Invalid quantity");
            item2_qty = 0;
        }
        System.out.print("Enter "+item3_name+" quantity: ");
        item3_qty = scanner.nextInt();
        if(item3_qty<0 || item3_qty>10){
            System.out.println("Invalid quantity");
            // item3_qty = 0;
            System.exit(0);
        }

        // finding bills of each item
        item1_bill = item1_price * item1_qty;
        item2_bill = item2_price * item2_qty;
        item3_bill = item3_price * item3_qty;
        
        System.out.println();
        System.out.println("Item\tQty\tPrice\tTotal");
        System.out.println("----------------------------------");
        System.out.println(item1_name+"\t"+item1_qty+"\tRs "+item1_price+"\tRs "+(item1_bill));
        System.out.println(item2_name+"\t"+item2_qty+"\tRs "+item2_price+"\tRs "+(item2_bill));
        System.out.println(item3_name+"\t"+item3_qty+"\tRs "+item3_price+"\tRs "+(item3_bill));

        System.out.println("----------------------------------");
        System.out.println("Total Bill: "+(item1_bill+item2_bill+item3_bill));
        System.out.println();

        scanner.close();
    }    
}
