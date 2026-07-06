import java.util.ArrayList;
import java.util.Scanner;

class Tweet {
    private String text;

    public Tweet(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

class User {
    private String name;
    private String userid;
    private String password;

    public User() {
    }

    public User(String name, String userid, String password) {
        this.name = name;
        this.userid = userid;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 15) {
            this.name = name;
        } else {
            System.out.println("Name must be between 2 and 15 characters.");
        }
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class TweetApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tweet> tweets = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();        

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Forget Password");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.println("Enter your choice");
            System.out.println("");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String loginId = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPass = scanner.nextLine();
                    boolean found = false;
                    for (User user : users) {
                        if (user.getUserid().equals(loginId) && user.getPassword().equals(loginPass)) {
                            System.out.println("Welcome " + user.getName());
                            found = true;
                            break;
                        }
                    }
                    if (found == true) {
                        
                        int Tchoice = 0;
                        while (Tchoice != 3) {
                            System.out.println("1. Post a Tweet");
                        System.out.println("2. View all Tweets");
                        System.out.println("3. Exit");
                            Tchoice = Integer.parseInt(scanner.nextLine());
                            switch (Tchoice) {
                                case 1:
                                    System.out.println("Enter your Tweet");
                                    String text = scanner.nextLine();
                                    tweets.add(new Tweet(text));
                                    break;

                                case 2:
                                    for (Tweet tweet : tweets) {
                                        System.out.println(tweet.getText());
                                    }
                                    break;

                                case 3:
                                    System.out.println("Logged out");
                                    break;

                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid User ID or Password.");

                    }
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter User ID: ");
                    String userid = scanner.nextLine();

                    boolean exists = false;

                    for (User user : users) {
                        if (user.getUserid().equals(userid)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("User ID already exists.");
                        break;
                    }

                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();

                    users.add(new User(name, userid, password));

                    System.out.println("Registration Successful!");
                    break;

                case 3:
                    System.out.print("Enter your Name: ");
                    String passName = scanner.nextLine();
                    System.out.print("Enter User ID: ");
                    String passUserID = scanner.nextLine();
                    boolean userFound = false;
                    for (User user : users) {
                        if (user.getName().equals(passName) && user.getUserid().equals(passUserID)) {
                            System.out.print("Enter New Password: ");
                            String newPassword = scanner.nextLine();
                            user.setPassword(newPassword);
                            System.out.println("Password Updated Successfully!");
                            userFound = true;
                            break;
                        }
                    }
                    if (!userFound) {
                        System.out.println("User not found.");
                    }
                    break;

                case 4:
                    System.out.println("Visit Again!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice, Try again");
                    break;
            }
        }
        scanner.close();
    }
}