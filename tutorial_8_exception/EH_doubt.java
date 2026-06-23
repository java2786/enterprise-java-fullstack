import java.util.Scanner;

// Class - Noun - name
// Method - Verb - do, work, bath, read

class LicenseDepartment {
    public boolean isEligible(int age) throws Exception {
        if (age > 18 && age > 0) {
            // System.err.println("You are eligible for License");
            return true;
        } else if(age<0){
            throw new Exception("Invalid age");
        }else{
            throw new Exception("Below 18 is not valid");
        }
    }
}

public class EH_doubt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = Integer.parseInt(scanner.nextLine());
        int age = 14;
        LicenseDepartment verify = new LicenseDepartment();
        try{
            System.out.println(verify.isEligible(age));
        }
        catch (Exception e) {
            System.err.println("You have entered an invalid age. "+e.getMessage());
        }
        scanner.close();
    }    
}
