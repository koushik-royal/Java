import java.util.Scanner;

public class WhileLoop {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        while (!password.equals("12345")) {

            System.out.println("pls try again.");

            System.out.println("enter your password:");
            password = scanner.nextLine();
            
        }
        System.out.println("login succesully");
    }
}