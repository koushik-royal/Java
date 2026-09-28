public class nestedif {
    public static void main(String[] args) {

        int age = 17;
        boolean student = true;

        if (age >= 18) {

            if (student == true) {
                System.out.println("You are an adult student");
            }
        }
    }
}