/* hello world application practice */


public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
        System.out.println(addNumbers(5, 5));
        System.out.println(helloName("Juno", "Vue"));
        
        String array[] = {
            "Juno",
            "Kingman",
            "Kash",
            "Nina"
        };

        hello.loop(array); 
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

    // Method for a person's first and last name 
    public static String helloName(String firstName, String lastName) {
        String person = (firstName + " " + lastName);
        return person; 
    }

    // Method to loop through array
    // x = index 
    public static void loop(String[] array) {
        for( int x = 0; x < array.length; x++) {
            System.out.println("Java Developer: " + array[x]);
        }
    }
} 
