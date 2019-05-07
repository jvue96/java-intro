/* hello world application practice */


public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
        System.out.println(addNumbers(5, 5));
        System.out.println(helloName("Juno", "Vue"));
    }

    // Prints sum of integers 
    public static int addNumbers(int num1, int num2) {
        /* int a = 5;
        int b = 5;
        int c = 10; 
        int d = 10; 

        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
        System.out.println("The sum of a and b is = " + Integer.sum(c, d)); */

        int additionResult = (num1 + num2);
        return additionResult; 

    }

    // test 
        public static String helloName(String firstName, String lastName) {
            String person = (firstName + " " + lastName);
            return person; 
        }
    } 
