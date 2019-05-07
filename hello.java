/* hello world application */


public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
        addNumbers(); 
    }

    static void addNumbers() {
        int a = 5;
        int b = 5;
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
    }
}