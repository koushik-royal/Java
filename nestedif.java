// public class nestedif {
//     public static void main(String[] args) {

//         int age = 17;
//         boolean student = true;

//         if (age >= 18) {

//             if (student == true) {
//                 System.out.println("You are an adult student");
//             }
//         }
//     }
// }
 import java.util.Scanner;

 public class nestedif {
 
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.err.println("enter your name: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if(username.equals("koushik")){
        if(password.equals("12345")){

        System.err.println("LOGIN SUCCESSFULY");
        } else{
            System.err.println("wrong password");
        }
    }else{
        System.out.println("Wrong username");
    }

    }
 }