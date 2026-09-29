// import java.util.Scanner;

// public class switchExample {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number (1-4): ");
//         int day = scanner.nextInt();

//         switch (day) {

//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//             case 3:
//                 System.out.println("Wednesday");
//                 break;

//             case 4:
//                 System.out.println("Thusday");
//                 break;

//             default:
//                 System.out.println("Invalid number");
//         }
//     }
// }

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("You selected Login");
                break;

            case 2:
                System.out.println("You selected Register");
                break;

            case 3:
                System.out.println("You selected Exit");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}